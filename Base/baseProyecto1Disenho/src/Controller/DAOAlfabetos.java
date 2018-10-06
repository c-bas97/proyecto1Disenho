/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import Model.Alfabeto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
    
    public void actualizar(String nombreColumna) throws SQLException{
        state.executeUpdate("INSERT INTO ALFABETOS(NOMBRE,ALFABETO) VALUES('" + nombreColumna + "')");
        System.out.println("alfabeto " + nombreColumna + " agregado a la base");
    };
    
    
    
    public void crear(String archivo) throws SQLException, FileNotFoundException, IOException{
        String nombre;
        String alfabeto;
    
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        nombre = reader.readLine();
        alfabeto = reader.readLine();
        reader.close();
 
        state.executeUpdate("INSERT INTO ALFABETOS(NOMBRE,ALFABETO) VALUES('" + nombre + "','" + alfabeto + "')");
        System.out.println("alfabeto " + archivo + " agregado a la base");
        
    };
    
    
    
    
    public void eliminar(String nombreColumna) throws SQLException{
        state.executeUpdate("DELETE FROM ALFABETOS WHERE NOMBRE = '" + nombreColumna + "'");
        System.out.println(nombreColumna + " ha sido eliminado de la base de datos");
    };
    
    private boolean validar(DTO datos){
        System.out.println("Clase DAOAlfabetos, metodo Validar. Valida que un nuevo alfabeto pueda ser guardado");
        return true;
    }
    
    public ResultSet getAlfabetos() throws SQLException{
        rs = state.executeQuery("SELECT * FROM Alfabetos");
        /*
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) System.out.print(",  ");
                String columnValue = rs.getString(i);
                System.out.print(columnValue);
    }
    System.out.println("");
}*/
        System.out.println(rs);
        return rs;
    }
    
    public Alfabeto getAlfabeto(String nombre){
        System.out.println("Clase DAOAlfabetos, metodo GetAlfabeto. Carga el alfabeto con el que trabajará el usuario");
        ArrayList<String> alf = new ArrayList<>(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}));
        Alfabeto alfabeto = new Alfabeto("default",alf);
        
        return alfabeto;        
    }
}
