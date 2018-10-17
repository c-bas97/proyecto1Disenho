/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import dto_cliente.DTO_Cliente;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Usuario
 */
public class SocketCliente  {

    public SocketCliente() {
    }
    
    private String HOST =  "192.168.1.11";
    private int PUERTO= 5000;
    
    private InputStream conexionEntrada;
    private ObjectInputStream flujoLectura;

    private OutputStream conexionSalida;
    private ObjectOutputStream flujoEscritura;
   

    public DTO_Cliente enviarSolicitud(DTO_Cliente dto) throws IOException, ClassNotFoundException{
        
            Socket cliente = new Socket(HOST, PUERTO);
            
            conexionSalida = cliente.getOutputStream();
            flujoEscritura = new ObjectOutputStream(conexionSalida);
            
            //Establece mecanismo de comunicacion con el servidor - Lectura..
            //Entrada de datos
            
            conexionEntrada = cliente.getInputStream();
            flujoLectura = new ObjectInputStream(conexionEntrada);
            //Salida de datos
            

            // procesar la gestion a solicitar
            flujoEscritura.writeObject(dto);
            flujoEscritura.flush();
            
            // recupera la respuesta del servidor...
            dto = (DTO_Cliente) flujoLectura.readObject(); // aqui esta el problema que resetea la conexion
            System.out.println(dto.getAlfabeto());
            
            flujoEscritura.close();
            flujoLectura.close();
            cliente.close();
        

        return dto;
    }
}
