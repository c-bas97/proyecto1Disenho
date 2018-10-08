/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import dto_cliente.DTO_Cliente;

/**
 *
 * @author Usuario
 */
public class FactoryFrase {
    
    public void generarFrase(DTO_Cliente dto){
        //según el tipo de frase (compararla con el ToString de las hijas de frase),
        //se ejecuta el generador
        dto.getTipoFrase();
    }
}
