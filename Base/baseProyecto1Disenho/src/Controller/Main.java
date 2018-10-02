/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Substitucion;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static void main(String[] args){
        DTO dto = new DTO();
        Substitucion sub = new Substitucion();
        
        dto.setFrase("tarea programada");
        dto.setCifra("23");
        ArrayList<String> alf = new ArrayList<>(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}));
        dto.setAlfabeto(alf);
        sub.codificar(dto);
        
        for (int i = 0; i<dto.getResultados().size(); i++){
            System.out.println(dto.getResultados().get(i));
        }
    }
}
