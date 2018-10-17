/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;


import AlgoritmosActivos.Binario;
import AlgoritmosActivos.PalabraClave;
import AlgoritmosActivos.Substitucion;
import AlgoritmosActivos.Telefonico;
import AlgoritmosActivos.Transposicion;
import Controller.DTO;
import Model.Algoritmo;
import Model.IPersistencia;
import Persistencias.PDF;
import Persistencias.TXT;
import Persistencias.XML;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        // TODO code application logic here
        //SocketServidor socket = new SocketServidor();
        //socket.iniciarServidor();
        
        
        Algoritmo Telefonico = new Algoritmo();
        Algoritmo Binario = new Algoritmo();
        ArrayList algoritmos = new ArrayList();
        //algoritmos.add(Binario);
        //algoritmos.add(Telefonico);
        DTO dto = new DTO();
        //dto.setTipoAlgoritmo(algoritmos);
//        ArrayList salidas = new ArrayList();
//        IPersistencia ip = new XML();
//        salidas.add(ip);
//        dto.setTipoSalida(salidas);
//        
        dto.setFrase("esto es un secreto no lo puedo decir aserpros");
        //dto.setFrase("abc def jl");

        ArrayList<String> alf = new ArrayList<>(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}));
        dto.setAlfabeto(alf);
        dto.setNombreAlfabeto("prueba");
        dto.setModo(true);
//
//        Controlador cont = new Controlador();
//        PDF pdf = new PDF();
//        pdf.escribir(dto);
//        TXT tx = new TXT();
//        tx.escribir(dto);
//
//        
        dto.setFrase("prueba numero uno");
        Substitucion sub = new Substitucion();
        dto.setCifra("23");        
        sub.codificar(dto);
        System.out.println(dto.getResultados().get(0));
        dto.setFrase(dto.getResultados().get(0));
        sub.decodificar(dto);
        System.out.println(dto.getResultados().get(1));
//
//
//        Transposicion trans = new Transposicion();
//        trans.codificar(dto);
//        System.out.println(dto.getResultados().get(0));
//        dto.setFrase(dto.getResultados().get(0));
//        trans.decodificar(dto);
//        System.out.println(dto.getResultados().get(1));
//
//        Telefonico tel = new Telefonico();
//        tel.codificar(dto);
//        System.out.println(dto.getResultados().get(0));
//        dto.setFrase(dto.getResultados().get(0));
//        tel.decodificar(dto);
//        System.out.println(dto.getResultados().get(1));
//
//        
//        Binario bin = new Binario();
//        bin.codificar(dto);
//        System.out.println(dto.getResultados().get(0));
//        dto.setFrase(dto.getResultados().get(0));
//        bin.decodificar(dto);
//        System.out.println(dto.getResultados().get(1));
//
//
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
