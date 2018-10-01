/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import Controller.IValidable;

/**
 *
 * @author Luis
 */
public class Alfabeto implements IValidable {
    
    private String nombre;
    private ArrayList<String> alfabeto;
    private Boolean activo;
    
    public Alfabeto(String nom, ArrayList<String> alf){
        this.nombre = nom;
        this.alfabeto = alf;
        this.activo = true;
    }
    
    @Override
    public boolean validar (Object objeto){
        System.out.println("Clase Alfabeto, método Validar. Se verifica que la frase ingresada por el usuario sea compatible con el alfabeto activo");
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(ArrayList<String> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
