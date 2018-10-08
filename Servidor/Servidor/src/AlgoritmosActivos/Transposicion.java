/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosActivos;

import Controller.DTO;
import Model.Algoritmo;

/**
 *
 * @author Luis
 */
public class Transposicion extends Algoritmo {
     @Override
    public void codificar(DTO dto){
        //System.out.println("Clase Transposicion, método Codificar. Codifica una frase según los datos que recibe en el dto");
        String frase = dto.getFrase();
        String codificacion = "";
        String palabra = "";
        
        for (int i=0; i<frase.length(); i++){   //recorre letra por letra la frase a codificar
            char c = frase.charAt(i);
            String caracter = String.valueOf(c);
            
            if (!caracter.equalsIgnoreCase(" ")){
                palabra += caracter;
            }
            else{
                codificacion += new StringBuilder(palabra).reverse().toString() + " ";
                palabra = "";
            }
        }
        codificacion += new StringBuilder(palabra).reverse().toString();
        
        dto.setResultados(codificacion);
    }
    
    @Override
    public void decodificar(DTO dto){
        //System.out.println("Clase Transposicion, método Decodificar. Decodifica una frase según los datos que recibe en el dto");
        //Debido a que no hay diferencia entre el codificar y el decodificar de esta función, se invocará el codificador.
        codificar(dto);
    }
    
    @Override
    public String toString(){
        return "Transposicion";
    }
    
}
