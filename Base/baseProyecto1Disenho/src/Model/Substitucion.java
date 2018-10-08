/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Substitucion extends Algoritmo{
    
    @Override
    public void codificar(DTO dto){
        //System.out.println("Clase Substitucion, método Codificar. Codifica una frase según los datos que recibe en el dto");
        String frase = dto.getFrase();
        String codificacion = "";
        ArrayList<String> alfabeto = dto.getAlfabeto();
        String cifra = dto.getCifra();
        int cifra1 = 0, cifra2 = 0;
        Boolean flag;
        
        if (cifra.length() == 2){
            cifra1 = Character.getNumericValue(cifra.charAt(0));
            cifra2 = Character.getNumericValue(cifra.charAt(1));
            flag = true;
        }
        else {
            flag = false;
            codificacion = "Error en la cifra utilizada para codificar";
        }
        
        if (flag){
            for (int i = 0; i<frase.length(); i++){    //recorre la frase letra por letra
                char c = frase.charAt(i);
                String letra = String.valueOf(c); 
                
                while (!letra.equalsIgnoreCase(" ") && i<frase.length()){
                    int indice;
                    if (flag){
                        //aplico cifra1 a la letra y la agrego, cambio la bandera
                        indice = alfabeto.indexOf(letra);
                        //System.out.println(indice + "  indice de la letra " + letra);
                        indice += cifra1;
                        if (indice >= alfabeto.size()){
                            indice -= alfabeto.size();
                        }
                        //System.out.println("Se insertó " + letra + " como " + alfabeto.get(indice) + " un valor de " + indice + " con cifra " + cifra1);
                        codificacion += alfabeto.get(indice);
                        flag = false;
                    }
                    else{
                        //aplico cifra2 y la agrego, cambio la bandera
                        indice = alfabeto.indexOf(letra);
                        //System.out.println(indice + "  indice de la letra " + letra);
                        indice += cifra2;
                        if (indice >= alfabeto.size()){
                            indice -= alfabeto.size();
                        }
                        //System.out.println("Se insertó " + letra + " como " + alfabeto.get(indice) + " un valor de " + indice + " con cifra " + cifra2);
                        codificacion += alfabeto.get(indice);
                        flag = true;
                    }
                    i++;
                    if (i < frase.length()){
                        c = frase.charAt(i);
                        letra = String.valueOf(c);
                    }                
                }
                if (i <frase.length()){
                    codificacion += " ";
                }
                flag = true;
            }
        }
        dto.setResultados(codificacion);
    }
    
    @Override
    public void decodificar(DTO dto){
        //System.out.println("Clase Substitucion, método Decodificar. Decodifica una frase según los datos que recibe en el dto");
        String frase = dto.getFrase();
        String decodificacion = "";
        ArrayList<String> alfabeto = dto.getAlfabeto();
        String cifra = dto.getCifra();
        int cifra1 = 0, cifra2 = 0;
        Boolean flag;
        
        if (cifra.length() == 2){
            cifra1 = Character.getNumericValue(cifra.charAt(0));
            cifra2 = Character.getNumericValue(cifra.charAt(1));
            flag = true;
        }
        else {
            flag = false;
            decodificacion = "Error en la cifra utilizada para decodificar";
        }
        
        if (flag){
            for (int i = 0; i<frase.length(); i++){    //recorre la frase letra por letra
                char c = frase.charAt(i);
                String letra = String.valueOf(c).toLowerCase(); 
                
                while (!letra.equalsIgnoreCase(" ") && i<frase.length()){
                    int indice;
                    if (flag){
                        //aplico cifra1 a la letra y la agrego, cambio la bandera
                        indice = alfabeto.indexOf(letra);
                        //System.out.println(indice + "  indice de la letra " + letra);
                        indice -= cifra1;
                        if (indice < 0){
                            indice += alfabeto.size();
                        }
                        //System.out.println("Se insertó " + letra + " como " + alfabeto.get(indice) + " un valor de " + indice + " con cifra " + cifra1);
                        decodificacion += alfabeto.get(indice);
                        flag = false;
                    }
                    else{
                        //aplico cifra2 y la agrego, cambio la bandera
                        indice = alfabeto.indexOf(letra);
                        //System.out.println(indice + "  indice de la letra " + letra);
                        indice -= cifra2;
                        if (indice < 0){
                            indice += alfabeto.size();
                        }
                        //System.out.println("Se insertó " + letra + " como " + alfabeto.get(indice) + " un valor de " + indice + " con cifra " + cifra2);
                        decodificacion += alfabeto.get(indice);
                        flag = true;
                    }
                    i++;
                    if (i < frase.length()){
                        c = frase.charAt(i);
                        letra = String.valueOf(c).toLowerCase();
                    }                
                }
                if (i <frase.length()){
                    decodificacion += " ";
                }
                flag = true;
            }
        }
        dto.setResultados(decodificacion);
    }
    
    @Override
    public String toString(){
        return "Substitucion";
    }
    
}
