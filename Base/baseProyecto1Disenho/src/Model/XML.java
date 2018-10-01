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
public class XML implements IPersistencia{
    
    @Override
    public void escribir(DTO datos) {
        System.out.println("Clase XML, método escribir. Aca se creara un XML como salida");
    }
    
    @Override
    public String toString(){
        return "XML";
    }
    
}
