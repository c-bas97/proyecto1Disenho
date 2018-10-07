/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto_cliente;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DTO_Cliente {

    private Boolean cargarDatos;
    private ArrayList<String> alfabetos;
    private ArrayList<String> tiposFrases;
    private ArrayList<String> algoritmos;
    private ArrayList<String> tiposBitacoras;
    private String alfabeto;
    private String tipoFrase;
    private String frase;
    private String clave;
    private String cifra;
    private ArrayList<String> resultados;
    private Boolean codificar;
    
    public DTO_Cliente (){
    }

    public Boolean getCargarDatos() {
            return cargarDatos;
    }

    public void setCargarDatos(Boolean cargarDatos) {
        this.cargarDatos = cargarDatos;
    }

    public ArrayList<String> getAlfabetos() {
        return alfabetos;
    }

    public void setAlfabetos(ArrayList<String> alfabetos) {
        this.alfabetos = alfabetos;
    }

    public ArrayList<String> getTiposFrases() {
        return tiposFrases;
    }

    public void setTiposFrases(ArrayList<String> tiposFrases) {
        this.tiposFrases = tiposFrases;
    }

    public ArrayList<String> getAlgoritmos() {
        return algoritmos;
    }

    public void setAlgoritmos(ArrayList<String> algoritmos) {
        this.algoritmos = algoritmos;
    }

    public ArrayList<String> getTiposBitacoras() {
        return tiposBitacoras;
    }

    public void setTiposBitacoras(ArrayList<String> tiposBitacoras) {
        this.tiposBitacoras = tiposBitacoras;
    }

    public String getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String alfabeto) {
        this.alfabeto = alfabeto;
    }

    public String getTipoFrase() {
        return tipoFrase;
    }

    public void setTipoFrase(String tipoFrase) {
        this.tipoFrase = tipoFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
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

    public ArrayList<String> getResultados() {
        return resultados;
    }

    public void setResultados(ArrayList<String> resultados) {
        this.resultados = resultados;
    }

    public Boolean getCodificar() {
        return codificar;
    }

    public void setCodificar(Boolean codificar) {
        this.codificar = codificar;
    }
    
    
}
