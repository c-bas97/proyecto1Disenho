/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import Model.Alfabeto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luis
 */
public class DAOAlfabetos {
    
    Connection con;
    Statement  state;
    ResultSet  rs;

    public DAOAlfabetos() throws SQLException {
        this.con = DriverManager.getConnection("jdbc:derby://localhost:1527/Disenho_DB", "luis", "12345");
        this.state= con.createStatement();
    };
    
    
    
    public void actualizar(String nombre,Boolean estado) throws SQLException{
        state.executeUpdate("UPDATE ALFABETOS SET ESTADO = '" + estado + "' WHERE NOMBRE = '"+ nombre +"' ");
        System.out.println("alfabeto " + nombre + " actualizado");
    };
    
    
    
    public void crear(String archivo) throws SQLException, FileNotFoundException, IOException{
        Boolean validado = validar(archivo);
        if(validado == true){
            String nombre;
            String alfabeto;
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                nombre = reader.readLine();
                alfabeto = reader.readLine();
            }
            state.executeUpdate("INSERT INTO ALFABETOS(NOMBRE,ALFABETO,ESTADO) VALUES('" + nombre + "','" + alfabeto + "', TRUE)");
            System.out.println("alfabeto " + archivo + " agregado a la base");
        }
        else{
            System.out.println("no se pudo agregar porque ya esta en la base");
        }
        
        
    };
    
    
    
    /*
    public void eliminar(String nombreColumna) throws SQLException{ No hace falta
        state.executeUpdate("DELETE FROM ALFABETOS WHERE NOMBRE = '" + nombreColumna + "'");
        System.out.println(nombreColumna + " ha sido eliminado de la base de datos");
    };
    */
    private boolean validar(String archivo) throws SQLException, FileNotFoundException, IOException{ // recordar cambiar por private
        String nombre;
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        nombre = reader.readLine();
        reader.close();
        rs = state.executeQuery("SELECT NOMBRE FROM Alfabetos Where NOMBRE = '" + nombre + "'");
        boolean recordFound = rs.next();
        if(recordFound){
            System.out.println("Ya se encuentra eb la base");
            return false;
        }
        else{
            System.out.println("validado, continuando on la agregacion");
        return true;
        }

        
                
    }
    
    
    
    public ResultSet getAlfabetos() throws SQLException{
        rs = state.executeQuery("SELECT * FROM Alfabetos WHERE ESTADO = TRUE");
        /*
        while(rs.next()){
            System.out.println(rs.getString(1));
        }*/
        return rs;
    }
    
    
    
    public Alfabeto getAlfabeto(String nombre){
        System.out.println("Clase DAOAlfabetos, metodo GetAlfabeto. Carga el alfabeto con el que trabajará el usuario");
        ArrayList<String> alf = new ArrayList<>(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}));
        Alfabeto alfabeto = new Alfabeto("default",alf);
        
        return alfabeto;        
    }
}
