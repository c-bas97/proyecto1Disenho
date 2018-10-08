/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;
import java.util.ArrayList;
import Controller.IValidable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    
    public boolean validar (Object frase){
        if(frase.getClass() == DTO.class){
            DTO objeto = (DTO) frase;
            String frase1 = objeto.getFrase();
            ArrayList<String> fraseEnLista = new ArrayList<String>();
             for(int i=0; i< frase1.length();i++){
             fraseEnLista.add(Character.toString(frase1.charAt(i)));
        }
            if(alfabeto.containsAll(fraseEnLista)== true){
                return true;
            }
            else{
                return false;
            }
            
        }
        
        else{
            return false;
        }
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
