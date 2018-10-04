/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Substitucion;
import Model.Telefonico;
import Model.Transposicion;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static void main(String[] args){
        DTO dto = new DTO();
        //dto.setFrase("esto es un secreto no lo puedo decir aserpros");
        dto.setFrase("abc def jl");
        ArrayList<String> alf = new ArrayList<>(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}));
        dto.setAlfabeto(alf);
        
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

        Telefonico tel = new Telefonico();
        tel.codificar(dto);
        dto.setFrase(dto.getResultados().get(0));
        tel.decodificar(dto);
    }
}
