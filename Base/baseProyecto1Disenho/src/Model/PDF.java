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
public class PDF implements IPersistencia {
    
    @Override
    public void escribir(DTO datos) {
        System.out.println("Clase PDF, método Escribir. Aqui se creara un documento PDF como salida");
    }
    
    @Override
    public String toString(){
        return "PDF";
    }
    
}
