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
public class Telefonico extends Algoritmo{
    
     @Override
    public void codificar(DTO dto){
        //System.out.println("Clase Telefonico, método Codificar. Codifica una frase según los datos que recibe en el dto");
        String frase = dto.getFrase();
        String codificacion = "";
        ArrayList<String> alfabeto = (ArrayList<String>) dto.getAlfabeto().clone();
        ArrayList<ArrayList<String>> division = new ArrayList();
        int letrasPorNumero = alfabeto.size()/9;
        int sobrantes = alfabeto.size() - (9*letrasPorNumero);
        
        for(int i = 0; i<9; i++){       //Crea la división del alfabeto
            ArrayList<String> unNumero = new ArrayList();
            int j=0;
            while (j<letrasPorNumero){
                unNumero.add(alfabeto.remove(0));
                j++;
            }
            if (sobrantes!=0){
                unNumero.add(alfabeto.remove(0));
                sobrantes--;
            }
            division.add(unNumero);
        }
        
        System.out.println(division);
        
        //recorrer frase, cada letra se busca en "division" y codifica, los espacios son *
        for(int i=0; i<frase.length(); i++){
            char c = frase.charAt(i);
            String letra = String.valueOf(c).toLowerCase();
            
            if (!letra.equalsIgnoreCase(" ")){
                for (int j=0; j<division.size(); j++){      //revisa donde está la letra que debe codificar
                    if (division.get(j).contains(letra)){
                        //Codificar, luego agrega la codificacion a "codificacion" y cierra el for interno, permitiendo que el externo pase a la siguiente letra
                        codificacion += (j+1) + "" + (division.get(j).indexOf(letra)+1) + " ";
                        break;
                    }
                }
            }
            else{
                codificacion += "* ";
            }
        }
        System.out.println(codificacion);
        dto.setResultados(codificacion);
    }
    
    @Override
    public void decodificar(DTO dto){
        //System.out.println("Clase Telefonico, método Decodificar. Decodifica una frase según los datos que recibe en el dto");
        String frase = dto.getFrase();
        String decodificacion = "";
        ArrayList<String> alfabeto = (ArrayList<String>) dto.getAlfabeto().clone();
        ArrayList<ArrayList<String>> division = new ArrayList();
        int letrasPorNumero = alfabeto.size()/9;
        int sobrantes = alfabeto.size() - (9*letrasPorNumero);
        
        for(int i = 0; i<9; i++){       //Crea la división del alfabeto
            ArrayList<String> unNumero = new ArrayList();
            int j=0;
            while (j<letrasPorNumero){
                unNumero.add(alfabeto.remove(0));
                j++;
            }
            if (sobrantes!=0){
                unNumero.add(alfabeto.remove(0));
                sobrantes--;
            }
            division.add(unNumero);
        }
        
        System.out.println(division);
        
        //recorrer frase, cada letra se busca en "division" y decodifica, los espacios son *
        for(int i=0; i<frase.length(); i++){
            char c1 = frase.charAt(i);
            String letra1 = String.valueOf(c1).toLowerCase();
            
            if (!letra1.equalsIgnoreCase("*") && !letra1.equalsIgnoreCase(" ")){
                i++;
                char c2 = frase.charAt(i);
                String letra2 = String.valueOf(c2).toLowerCase();
                
                int num = (Integer.valueOf(letra1)) - 1;
                int indice = (Integer.valueOf(letra2)) - 1;
                
                decodificacion += division.get(num).get(indice);
            }
            else if (letra1.equalsIgnoreCase("*")){
                decodificacion += " ";
            }
        }
        System.out.println(decodificacion);
        dto.setResultados(decodificacion);
    }
    
    @Override
    public String toString(){
        return "Telefonico";
    }
    
}
