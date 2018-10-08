/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;


import java.io.IOException;

/**
 *
 * @author Luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DTO_Admin dto = new DTO_Admin();
        dto.setarchivoAlgoritmo("C:\\Users\\Luis\\Desktop\\Binario1.txt");
        dto.setNombreAlgoritmo("Binario1");
        Controlador cont = new Controlador();
        cont.agregarAlgoritmo(dto);
        
    }
    
}
