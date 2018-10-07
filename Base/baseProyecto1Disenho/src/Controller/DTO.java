/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import Model.Algoritmo;
import Model.IPersistencia;

/**
 *
 * @author Luis
 */
public class DTO {
    private String nombreAlfabeto;
    private ArrayList<String> alfabeto;
    private String frase;
    private boolean modo;
    private ArrayList<Algoritmo> tipoAlgoritmo;
    private ArrayList<IPersistencia> tipoSalida;
    private ArrayList<String> resultados;
    private String clave;
    private String cifra;
    

    public DTO(){
        this.resultados = new ArrayList<>();
    }

    public String getNombreAlfabeto() {
        return nombreAlfabeto;
    }

    public ArrayList<String> getAlfabeto() {
        return alfabeto;
    }

    public String getFrase() {
        return frase;
    }

    public boolean isModo() {
        return modo;
    }
    
    public ArrayList<Algoritmo> getTipoAlgoritmo() {
        return tipoAlgoritmo;
    }

    public ArrayList<IPersistencia> getTipoSalida() {
        return tipoSalida;
    }

    public ArrayList<String> getResultados() {
        return resultados;
    }

    public void setNombreAlfabeto(String nombreAlfabeto) {
        this.nombreAlfabeto = nombreAlfabeto;
    }

    public void setAlfabeto(ArrayList<String> alfabeto) {
        this.alfabeto = alfabeto;
      
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setModo(boolean modo) {
        this.modo = modo;
    }

    public void setTipoAlgoritmo(ArrayList<Algoritmo> tipoAlgoritmo) {
        this.tipoAlgoritmo = tipoAlgoritmo;
    }

    public void setTipoSalida(ArrayList<IPersistencia> tipoSalida) {
        this.tipoSalida = tipoSalida;
    }

    public void setResultados(String resultado) {
        this.resultados.add(resultado);
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCifra() {
        return cifra;
    }

    public void setCifra(String cifra) {
        this.cifra = cifra;
    }
    
    
}
