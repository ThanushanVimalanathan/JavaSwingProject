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
public class DatabaseTable {
    static ResultSet RS;
    static Statement stmt;
    
    public ResultSet TableInsert(){
        try{
            stmt=DBConnection.createStatement();
            RS=stmt.executeQuery("SELECT * FROM st_details");
                    
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
        return RS;
    }
    
}
