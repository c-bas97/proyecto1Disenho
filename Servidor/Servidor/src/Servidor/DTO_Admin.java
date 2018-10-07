/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.File;

/**
 *
 * @author Usuario
 */
public class DTO_Admin {
    private File archioAlfabeto;          //alfabeto a guardar/modificar
    private File algoritmo;         //para agregar
    private String nombreAlgoritmo;     //activar o desactivar

    public File getArchioAlfabeto() {
        return archioAlfabeto;
    }

    public void setArchioAlfabeto(File archioAlfabeto) {
        this.archioAlfabeto = archioAlfabeto;
    }

    public File getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(File algoritmo) {
        this.algoritmo = algoritmo;
    }

    public String getNombreAlgoritmo() {
        return nombreAlgoritmo;
    }

    public void setNombreAlgoritmo(String nombreAlgoritmo) {
        this.nombreAlgoritmo = nombreAlgoritmo;
    }
}
