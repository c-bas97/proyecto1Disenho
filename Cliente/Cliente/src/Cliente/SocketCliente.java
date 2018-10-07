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
public class SocketCliente {
    
    private String HOST =  "localhost";
    private int PUERTO= 5000;
    
    private InputStream conexionEntrada;
    private ObjectInputStream flujoLectura;

    private OutputStream conexionSalida;
    private ObjectOutputStream flujoEscritura;
   

    public DTO_Cliente enviarSolicitud(DTO_Cliente dto) throws IOException{
        try {
            Socket cliente = new Socket(HOST, PUERTO);
            
            //Establece mecanismo de comunicacion con el servidor - Lectura..
            //Entrada de datos
            conexionEntrada = cliente.getInputStream();
            flujoLectura = new ObjectInputStream(conexionEntrada);
            //Salida de datos
            conexionSalida = cliente.getOutputStream();
            flujoEscritura = new ObjectOutputStream(conexionSalida);

            // procesar la gestion a solicitar
            flujoEscritura.writeObject(dto);
            flujoEscritura.flush();
            
            // recupera la respuesta del servidor...
            dto = (DTO_Cliente) flujoLectura.readObject();

            flujoEscritura.close();
            flujoLectura.close();
            cliente.close();
        } catch (ClassNotFoundException  ex) {
            System.out.println("Conectandose a un servidor desconocido");
        } catch (IOException ex) {
            System.out.println("Problemas con los flujos de entrada / salida");
        }

        return dto;
    }
}
