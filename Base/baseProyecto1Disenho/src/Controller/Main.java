/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Algoritmo;
//import Model.Binario;
import Model.IPersistencia;
import Model.PDF;
import Model.PalabraClave;
import Model.TXT;
import Model.XML;
import java.io.File;
import java.io.IOException;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static void main(String[] args) throws SQLException, IOException{
        DTO dto = new DTO();
        Algoritmo Telefonico = new Algoritmo();
        Algoritmo Binario = new Algoritmo();
        ArrayList algoritmos = new ArrayList();
        algoritmos.add(Binario);
        dto.setTipoAlgoritmo(algoritmos);
        ArrayList salidas = new ArrayList();
        IPersistencia ip = new XML();
        salidas.add(ip);
        dto.setTipoSalida(salidas);
        
        //dto.setFrase("esto es un secreto no lo puedo decir aserpros");
        dto.setFrase("abc def jl");
        ArrayList<String> alf = new ArrayList<>(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}));
        dto.setAlfabeto(alf);
        dto.setNombreAlfabeto("prueba");
        dto.setModo(true);
        /*
        Controlador cont = new Controlador();
        PDF pdf = new PDF();
        pdf.escribir(dto);
        TXT tx = new TXT();
        tx.escribir(dto);
        
        */
        
        DAOAlfabetos dalfa = new DAOAlfabetos();
        dalfa.crear("C:\\Users\\Luis\\Desktop\\gitKraken\\Disenho\\proyecto1Disenho\\Base\\baseProyecto1Disenho\\prueba1Alfabeto.txt");
        //alfa.actualizar("abecedario", TRUE);
        //dalfa.validar("C:\\Users\\Luis\\Desktop\\gitKraken\\Disenho\\proyecto1Disenho\\Base\\baseProyecto1Disenho\\prueba1Alfabeto.txt");
        //File file = new File(".");
        //for(String fileNames : file.list()) System.out.println(fileNames);
        //dalfa.getAlfabetos();
        //dalfa.eliminar("pruebaNueva");
        
        
//        Substitucion sub = new Substitucion();
//        dto.setCifra("23");        
//        sub.codificar(dto);
//        for (int i = 0; i<dto.getResultados().size(); i++){
//            System.out.println(dto.getResultados().get(i));
//        }
//        dto.setFrase(dto.getResultados().get(0));
//        sub.decodificar(dto);
//        for (int i = 0; i<dto.getResultados().size(); i++){
//            System.out.println(dto.getResultados().get(i));
//        }


//        Transposicion trans = new Transposicion();
//        trans.codificar(dto);
//        for (int i = 0; i<dto.getResultados().size(); i++){
//            System.out.println(dto.getResultados().get(i));
//        }
//        dto.setFrase(dto.getResultados().get(0));
//        trans.decodificar(dto);
//        for (int i = 0; i<dto.getResultados().size(); i++){
//            System.out.println(dto.getResultados().get(i));
//        }

//        Telefonico tel = new Telefonico();
//        tel.codificar(dto);
//        dto.setFrase(dto.getResultados().get(0));
//        tel.decodificar(dto);

        
//        Binario bin = new Binario();
//        bin.codificar(dto);
//        System.out.println(dto.getResultados().get(0));
//        dto.setFrase(dto.getResultados().get(0));
//        bin.decodificar(dto);
//        System.out.println(dto.getResultados().get(1));


//        PalabraClave clave = new PalabraClave();
//        dto.setFrase("tarea programada");
//        dto.setClave("tango");
//        clave.codificar(dto);
//        System.out.println(dto.getResultados().get(0));
//        dto.setFrase(dto.getResultados().get(0));
//        clave.decodificar(dto);
//        System.out.println(dto.getResultados().get(1));
    }
}
