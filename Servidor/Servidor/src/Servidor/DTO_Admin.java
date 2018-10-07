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
    private String archioAlfabeto;          //alfabeto a guardar/modificar
    private String nombreAlfabeto;
    private String archivoAlgoritmo;         //para agregar
    private String nombreAlgoritmo;     //activar o desactivar

    public DTO_Admin() {
    }
    
    public void setArchioAlfabeto(String archioAlfabeto) {
        this.archioAlfabeto = archioAlfabeto;
    }

    public void setNombreAlfabeto(String nombreAlfabeto) {
        this.nombreAlfabeto = nombreAlfabeto;
    }

    public void setarchivoAlgoritmo(String algoritmo) {
        this.archivoAlgoritmo = algoritmo;
    }

    public void setNombreAlgoritmo(String nombreAlgoritmo) {
        this.nombreAlgoritmo = nombreAlgoritmo;
    }
    
    

}
