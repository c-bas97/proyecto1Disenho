/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;

/**
 *
 * @author Luis
 */
public class Substitucion extends Algoritmo{
    
    @Override
    public void codificar(DTO dto){
        System.out.println("Clase Substitucion, método Codificar. Codifica una frase según los datos que recibe en el dto");
        String frase = dto.getFrase();
        ArrayList
        
    }
    @Override
    public void decodificar(DTO dto){
        System.out.println("Clase Substitucion, método Decodificar. Decodifica una frase según los datos que recibe en el dto");
    }
    
    @Override
    public String toString(){
        return "Substitucion";
    }
    
}
