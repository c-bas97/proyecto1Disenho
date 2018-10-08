/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import dto_cliente.DTO_Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Controlador {
    
    //private Controller control;
    
    public void agregarAlfabeto(DTO_Admin dto) throws IOException{
    
    }
        
    public void actualizarAlfabeto(DTO_Admin dto){
        
    }
    
    public void agregarAlgoritmo(DTO_Admin dto) throws FileNotFoundException, IOException{
        String archivoEntrada = dto.getArchivoAlgoritmo();
        String nombreAlgoritmo = dto.getNombreAlgoritmo();
        File fin = new File(archivoEntrada);
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));

        String dest = "C:\\Users\\Luis\\Desktop\\gitKraken\\Disenho\\proyecto1Disenho\\Servidor\\Servidor\\src\\AlgoritmosActivos" + File.separator + nombreAlgoritmo + ".java";
        FileWriter fstream = new FileWriter(dest, true);
        BufferedWriter out = new BufferedWriter(fstream);
        String aLine = null;
        while ((aLine = in.readLine()) != null) {
            out.write(aLine);
            out.newLine();
                                                }
        in.close();
        out.close();
    }
    
    public void eliminarAlgoritmo(DTO_Admin dto){
        
    }
    
    private void abrirCarpetaBitácoras(){
        
    }
    
    public void cargarDatos(DTO_Cliente dto){
        
    }
    
    public void procesarPeticion(DTO_Cliente dto){
        
    }
}
