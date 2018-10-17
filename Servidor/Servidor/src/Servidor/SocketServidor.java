/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import dto_cliente.DTO_Cliente;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class SocketServidor {
    private Controlador controlador;
    private ServerSocket servidor;      // objeto que se encarga de atender peticiones externas
    private  int PUERTO = 5000;         // puerto por donde atenderá las peticiones
    
    // la conexion de escritura del servidor
    private OutputStream conexionSalida;
    private ObjectOutputStream flujoSalida;

    // la conexion de lectura del servidor
    private InputStream conexionEntrada;
    private ObjectInputStream flujoEntrada;
    
    // socket que contiene la conexion con el cliente
    private Socket cliente;
    
    public void iniciarServidor() throws IOException, SQLException,ClassNotFoundException{
        try {
            this.controlador = new Controlador();
            servidor = new ServerSocket(PUERTO);
            
            while (true){
                cliente = servidor.accept();        //aceptar un cliente
                
                //establecimiento del canal de escritura DEL SERVIDOR
                conexionSalida =  cliente.getOutputStream();
                flujoSalida = new ObjectOutputStream(conexionSalida);
                
                //establecimiento del canal de lectura DEL SERVIDOR
                conexionEntrada = cliente.getInputStream();
                flujoEntrada = new ObjectInputStream(conexionEntrada);
                
                //llama a atenderPeticion para procesar los datos recibidos
                atenderPeticion();
                
                //cierra los canales y desconecta al cliente
                flujoEntrada.close();
                flujoSalida.close();
                cliente.close();
            }
        }
        catch (Exception e){
            System.out.println("Problemas creando el servidor en el puerto "+ PUERTO);
        }
    }
    
    private void atenderPeticion() throws SQLException,IOException, ClassNotFoundException{
        try {
            //obtener el DTO que envió el cliente con su solicitud (datos, frase, codificación o decodificación)
            DTO_Cliente dto = (DTO_Cliente) flujoEntrada.readObject();
            
            //llamar al controlador
            if (dto.getCargarDatos()){
                controlador.cargarDatos(dto);
            }
            else {
                controlador.procesarPeticion(dto);
            }
            
            //enviar respuesta al cliente
            flujoSalida.writeObject(dto);
        } catch (IOException ex) {
            System.out.println("Problemas leyendo o escribiendo en el flujo entrada/salida");
        } catch (ClassNotFoundException ex) {
            System.out.println("Problemas en la conversion del objeto recibido...");
        }
    }
}
