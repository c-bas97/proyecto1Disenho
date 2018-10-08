/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PalabraClave extends Algoritmo{
    
    @Override
    public void codificar(DTO dto){
        String frase = dto.getFrase();
        String codificacion = "";
        ArrayList<String> alfabeto = dto.getAlfabeto();
        String palabraClave = dto.getClave();
        int indiceClave = 0;
        
        for (int i=0; i<frase.length();i++){            //iterar sobre la frase

            char cc = palabraClave.charAt(indiceClave);
            String letraClave = String.valueOf(cc);
            char cf = frase.charAt(i);
            String letraFrase = String.valueOf(cf);

            if (letraFrase.equalsIgnoreCase(" ")){      //encontró un espacio, por lo que debe dejar de iterar sobre la clave (reiniciar)
                codificacion += " ";
                indiceClave = 0;
            }
            else {              //obtiene la letra que sustituye a la original
                int indiceLetraFrase = alfabeto.indexOf(letraFrase) +1;
                int indiceLetraClave = alfabeto.indexOf(letraClave) +1;
                String nuevaLetra;

                //asignar la letra
                if ((indiceLetraFrase+indiceLetraClave)>alfabeto.size()){
                    nuevaLetra = alfabeto.get(indiceLetraFrase+indiceLetraClave - alfabeto.size() -1);
                } else {
                    nuevaLetra = alfabeto.get(indiceLetraFrase+indiceLetraClave -1);
                }
                codificacion += nuevaLetra;
                indiceClave++;
            }

            //reiniciar el iterador sobre la palabra clave
            if (indiceClave == (palabraClave.length())){
                indiceClave = 0;
            }
        }
                    
        dto.setResultados(codificacion);
    }
    
    @Override
    public void decodificar(DTO dto){
        String frase = dto.getFrase();
        String decodificacion = "";
        ArrayList<String> alfabeto = dto.getAlfabeto();
        String palabraClave = dto.getClave();
        int indiceClave = 0;
        
        for (int i=0; i<frase.length();i++){            //iterar sobre la frase

            char cc = palabraClave.charAt(indiceClave);
            String letraClave = String.valueOf(cc);
            char cf = frase.charAt(i);
            String letraFrase = String.valueOf(cf);

            if (letraFrase.equalsIgnoreCase(" ")){      //encontró un espacio, por lo que debe dejar de iterar sobre la clave (reiniciar)
                decodificacion += " ";
                indiceClave = 0;
            }
            else {              //obtiene la letra que sustituye a la original
                int indiceLetraFrase = alfabeto.indexOf(letraFrase) +1;
                int indiceLetraClave = alfabeto.indexOf(letraClave) +1;
                String nuevaLetra;

                //asignar la letra
                if ((indiceLetraFrase-indiceLetraClave)<0){
                    nuevaLetra = alfabeto.get(indiceLetraFrase-indiceLetraClave + alfabeto.size() -1);
                } else {
                    nuevaLetra = alfabeto.get(indiceLetraFrase-indiceLetraClave -1);
                }
                decodificacion += nuevaLetra;
                indiceClave++;
            }

            //reiniciar el iterador sobre la palabra clave
            if (indiceClave == (palabraClave.length())){
                indiceClave = 0;
            }
        }
        
        dto.setResultados(decodificacion);
    }
    
    @Override
    public String toString(){
        return "Palabra Clave";
    }
}
