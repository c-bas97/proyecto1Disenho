/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import Controller.DTO;
import Model.Algoritmo;
import dto_cliente.DTO_Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.String.valueOf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Controlador {

    public void agregarAlfabeto(DTO_Admin dto) throws IOException, SQLException{
        Controller.Controlador controler = new Controller.Controlador();
        controler.agregarAlfabeto(dto.getArchioAlfabeto());
    }
        
    public void actualizarAlfabeto(DTO_Admin dtoA) throws SQLException{
        Controller.Controlador controler = new Controller.Controlador();
        DTO dto = new DTO();
        dto.setNombreAlfabeto(dtoA.getArchioAlfabeto());
        controler.actualizarAlfabeto(dto, Boolean.TRUE);
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
        //agregar código que elimina el algoritmo de la carpeta de baseProyecto
    }
    
    public void abrirCarpetaBitacoras(String ruta_archivo){
        try{
            Runtime.getRuntime().exec("rundll32 url.dll FileProtocolHandler " + ruta_archivo);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrió un error");
        }
    }
    
    public void cargarDatos(DTO_Cliente dtoc) throws SQLException{
        ArrayList<String> alf = new ArrayList();
        ArrayList<String> tipFr;
        ArrayList<String> alg;
        ArrayList<String> tipBit;
        Controller.Controlador controler = new Controller.Controlador();
        
        //Obtener datos
        alg = controler.cargarAlgoritmos();
        tipBit = controler.cargarPersistencias();
        

        alf =controler.cargarAlfabetos();
        /*
        tipFr = new ArrayList<>();

        alf = (ArrayList<String>) controler.cargarAlfabetos();
        
        tipFr = new ArrayList<String>();

        Class[] classes = ClassUtil.getClasses("Servidor");
        for(Class clazz : classes)
        {
            if(Frase.class.isAssignableFrom(clazz)) //Need something in this if statement
            {
                //agregar a tipFr el nombre (sin el .java) de la clase, o ponerle un toString a las clases que implementan F---rase y meter ese string al arreglo
            }
        }*/
        
        //asignar los datos
        dtoc.setAlfabetos(alf);
        dtoc.setAlgoritmos(alg);
        //dtoc.setTiposFrases(tipFr);
        dtoc.setTiposBitacoras(tipBit);
    }
    
    public void procesarPeticion(DTO_Cliente dto) throws SQLException{
        Controller.Controlador controler = new Controller.Controlador();
        if (dto.getTipoFrase() != null){
            DTO datos = new DTO();
            
            //asignar los datos necesarios para codificar o decodificar una frase
            datos.setCifra(dto.getCifra());
            datos.setClave(dto.getClave());
            datos.setFrase(dto.getFrase());
            if (dto.getCodificar()== true)
                datos.setModo(false);
            else
                datos.setModo(true);
            datos.setNombreAlfabeto(dto.getAlfabeto());
            
            ArrayList<Algoritmo> lista1 = new ArrayList();
            /*
            for (int i=0; i<dto.getAlgoritmos().size(); i++){
               lista1.add(dto.getAlgoritmos().get(i));
            }
            datos.setTipoAlgoritmo();
            datos.setTipoSalida();
            
            
            //realizar codificación/decodificación
            controler.procesarPeticion(datos);
            */
        }
        else{
            FactoryFrase fabrica = new FactoryFrase();
            fabrica.generarFrase(dto);
        }
    }
}
