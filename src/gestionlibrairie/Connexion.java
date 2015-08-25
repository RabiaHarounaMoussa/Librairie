/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlibrairie;

import java.sql.*;

/**
 *
 * @author hp
 */
public class Connexion {
    
    public static Connection conn = null;
    public static Statement stmt = null;
    public static String NomDb, User, Password, Url;
    
    public Connexion() throws Exception {
        //Fournir les éléments de connexion à la base de données
        NomDb = "librairie";
        User = "root";
        Password = "";
        String jdbcDriver = "com.mysql.jdbc.Driver";
        Url = "jdbc:mysql://localhost:3306/" + NomDb;
        
        //Connexion à la base de données
        try {
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(Url, User, Password);
            stmt =  conn.createStatement();
            System.out.println("Connexion réussie !!!");
        } catch (Exception e) {
            System.out.println("Connexion échouée !!!");
        }

    }
    
    
}
