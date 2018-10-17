/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Alfabeto;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Controlador  {
    private Alfabeto alfabetoActual;
    private DAOAlfabetos dbalfabetos;
    
    public Controlador() throws SQLException{
        this.dbalfabetos = new DAOAlfabetos();
    }
    
    public ArrayList<String> cargarAlfabetos() throws SQLException{
        //System.out.println("Clase Controller, metodo CargarAlfabetos. Solicita los nombres de los alfabetos disponibles");
        return dbalfabetos.getAlfabetos();
    }
    
    public ArrayList<String> cargarPersistencias(){
        //System.out.println("Clase Controller, metodo CargarPersistencias. Solicita los nombres de los distintos tipos de persistencias disponibles");
        ArrayList<String> datos = new ArrayList<String>();
        File folder = new File("C:\\Users\\Luis\\Desktop\\gitKraken\\Disenho\\proyecto1Disenho\\Base\\baseProyecto1Disenho\\src\\Persistencias");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
                String dato = listOfFiles[i].getName();
                String modificado = dato.replaceAll(".java", "");
                datos.add(modificado);
        }
        return datos;
    }
    
    public ArrayList<String> cargarAlgoritmos(){
        //System.out.println("Clase Controller, metodo CargarAlgoritmos. Le regresa a la vista el nombre de aquellos algoritmos disponibles");
        ArrayList<String> datos = new ArrayList<String>();
        File folder = new File("C:\\Users\\Luis\\Desktop\\gitKraken\\Disenho\\proyecto1Disenho\\Servidor\\Servidor\\src\\AlgoritmosActivos");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
                String dato = listOfFiles[i].getName();
                String modificado = dato.replaceAll(".java", "");
                datos.add(modificado);
        }
        return datos;
    }
    
    public void agregarAlfabeto(String rutaArchivo) throws SQLException, IOException{
        dbalfabetos.crear(rutaArchivo);
    }
    
    public void actualizarAlfabeto(DTO datos, Boolean estado) throws SQLException{
        dbalfabetos.actualizar(datos.getNombreAlfabeto(),estado);
    }
    
    public void predefinirAlfabeto(DTO dto) throws SQLException{
        //System.out.println("Clase Controller, metodo PredefinirAlfabeto. Solicita cargar el alfabeto al controlador");
        this.alfabetoActual = dbalfabetos.getAlfabeto(dto.getNombreAlfabeto());
    }
    
    public void procesarPeticion(DTO datos) throws SQLException{
        //System.out.println("Clase Controller, metodo procesarPeticion. Procesa una peticion de procesamiento por parte de un usuario");
        //System.out.println("    - Valida los datos");
        alfabetoActual = dbalfabetos.getAlfabeto(datos.getNombreAlfabeto());
        Boolean validado = validar(datos);
        if(validado == true){
            //System.out.println("    - Ejecuta los algoritmos");
            ejecutarAlgoritmos(datos);
            //System.out.println("    - Guarda la bitácora");
            escribirArchivo(datos);
            //System.out.println("    - Termina de procesar la petición y regresa los datos");
        }
        else{
            JOptionPane.showMessageDialog(null, "la frase no se adecua al alfabeto activo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private boolean validar(DTO datos){
        //System.out.println("Clase Controller, metodo Validar. Le solicita al alfabeto que valide una frase para luego poder ejecutar los algoritmos");
       
        return alfabetoActual.validar(datos);
    }
    
    private void ejecutarAlgoritmos(DTO datos){
        //System.out.println("Clase Controller, metodo EjecutarAlgoritmos. Llama a los algoritmos de codificación o decodificación");
        if(datos.isModo() == false){
            for(int x = 0; x < datos.getTipoAlgoritmo().size(); x++){
                datos.getTipoAlgoritmo().get(x).codificar(datos);
            }
        }
        else{
            for(int x = 0; x < datos.getTipoAlgoritmo().size(); x++){
                datos.getTipoAlgoritmo().get(x).decodificar(datos);
            }
        }
    }
    
    private void escribirArchivo(DTO datos){
        //System.out.println("Clase Controller, metodo Escribir. Solicita la generación y guardado de las bitácoras respectivas");
        for(int x = 0; x < datos.getTipoSalida().size(); x++){
           datos.getTipoSalida().get(x).escribir(datos);
        }
    }
    
}
