
package Controle;


import java.sql.*;
import javax.swing.JOptionPane;

// Classe pour la connection a la base de donnee
public class DbConnection {
    
    // Declaration des objets
            private static Connection conn = null;
			
        static{
	try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/saveur?serverTimezone=UTC","root","saved@$257$");
           
                        } catch (ClassNotFoundException | SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                            //System.out.println("Database.getConnection() Error --> " + e.getMessage());
                        } 
                }
			
	//-----------------------------------------------------------------------
			
	public static Connection getConnection(){
                        return conn;
	}
    
}