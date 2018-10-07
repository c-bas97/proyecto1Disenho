/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import Controller.DTO;

/**
 *
 * @author Luis
 */
public class TXT implements IPersistencia {
    
     @Override
    public void escribir(DTO datos) {
        try{
            System.out.println("Creando txt");
            BufferedWriter archivo = new BufferedWriter(new FileWriter("bitacora.txt", true));
            String timeLog = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
            archivo.write("Fecha de Peticion: " + timeLog);
            archivo.newLine();
            archivo.write("Frase original: " + datos.getFrase());
            archivo.newLine();
            archivo.write("Resultados: " + "Resultado de la frase " + datos.getFrase() + " al aplicarle el/los algoritmo(s) seleccionado(s)  ");
            archivo.newLine();
            archivo.newLine();
            if(datos.isModo() == true){
                    archivo.write("Modo: Decodificador");
                }
                else{
                    archivo.write("Modo: Codificador");
                }
            for(int x = 0; x < datos.getTipoAlgoritmo().size(); x++){
                archivo.write("Metodo: " + datos.getTipoAlgoritmo().get(x).toString());
                archivo.newLine();
                archivo.write("Forma: " + datos.getTipoSalida().get(x));
                archivo.newLine();
                archivo.newLine();
            }
            archivo.flush();
            archivo.close();
        }
        catch(Exception e){
            System.out.println("Se encontro un error");
        }
    }
    
     @Override
    public String toString(){
        return "TXT";
    }
    
}
