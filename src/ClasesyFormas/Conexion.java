package ClasesyFormas;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexion {
//Variables Globales 
    public static final String URL= "jdbc:mysql://127.0.0.1:3306/colegio";
    public static final String USE= "Usuario";
    public static final String PASS= "12345";
    
    
    public Connection getConection(){
   
   Connection con = null; //Varible Local
     try {
     Class.forName("com.mysql.jdbc.Driver");
     con = (Connection) DriverManager.getConnection(URL,USE,PASS);} 
     catch(Exception e){
         System.out.println(e);}    
   
     return con;
    }

    PreparedStatement prepareStatement(String insert_into_pruebaIdNombre_VALUES) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
