/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class AdminLogin {
    
    static ResultSet RS;
    static Statement stmt;
    
    public ResultSet ADSearch(String Name,String Pass){
        
        try{
            stmt=DBConnection.createStatement();
            RS=stmt.executeQuery("Select * From pro_details Where Name='"+Name+"'and Pro_ID='"+Pass+"'");
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
        
        return RS;
    }
    
}
