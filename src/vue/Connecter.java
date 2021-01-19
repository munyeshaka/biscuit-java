/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiscuit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connecter {
    Connection con;

    public Connecter() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
        }catch(ClassNotFoundException e){
                System.err.println(e);
                }
        try{
    con=(Connection) DriverManager.getConnection("jdbc:mysql://LocalHost:3306/serveur","root","");
    }catch(SQLException es){
                 System.err.println(es);
                }
    } 
    Connection obtenirconnexion(){
        return con;
    }
   
}