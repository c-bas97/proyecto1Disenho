/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Binario extends Algoritmo{
    
    @Override
    public void codificar(DTO dto){
        //System.out.println("Clase Algoritmo, método Codificar. Básicamente, acá no debería entrar");
        String frase = dto.getFrase();
        String codificacion = "";
        ArrayList<String> alfabeto = dto.getAlfabeto();
        
        for (int i=0; i<frase.length(); i++){
            char c = frase.charAt(i);
            String letra = String.valueOf(c).toLowerCase();
            
            if (!letra.equalsIgnoreCase(" ")){
                int indice = alfabeto.indexOf(letra);
                String palabra = Integer.toBinaryString(indice);
                if (palabra.length()<5){
                    int ceros = 5-palabra.length();
                    for (int j=0; j<ceros; j++){
                        codificacion += "0";
                    }
                }
                codificacion += palabra + " ";
            }
            else {
                codificacion += "* ";
            }
        }
        
        dto.setResultados(codificacion);
    }
    
    @Override
    public void decodificar(DTO dto){
        //System.out.println("Clase Algoritmo, método Decodificar. Básicamente, acá no debería entrar");
        String frase = dto.getFrase();
        ArrayList<String> binarios = new ArrayList();
        List<String> bins = Arrays.asList(frase.split(" "));
        for (String str : bins){
            binarios.add(str);
        }
        String decodificacion = "";
        ArrayList<String> alfabeto = dto.getAlfabeto();
        
        for (int i=0; i<binarios.size(); i++){
            if (!binarios.get(i).equalsIgnoreCase("*")){
                int numero = Integer.parseInt(binarios.get(i), 2);
                decodificacion += alfabeto.get(numero);
            }
            else{
                decodificacion += " ";
            }
        }
        
        dto.setResultados(decodificacion);
    }
    
    @Override
    public String toString(){
        return "Binario";
    }
}
