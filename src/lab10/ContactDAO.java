/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Mohamed Hamdy
 */
public class ContactDAO {
    Statement stmt;
     ResultSet rs1 ; 
    Connection con ; 
    public ContactDAO(){
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
     con=DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/addressbook","root","12345");
     stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     rs1=stmt.executeQuery("select * from contact");
        }catch(Exception e){ 
        System.out.println(e);
    }
        
        
    }
    
   public contactPerson First(){
         contactPerson cp = new contactPerson() ;  
       try{
          
            //ResultSet rs=stmt.executeQuery("select * from contact");
            if (rs1.first()){
                cp.setID(rs1.getInt(1));
                cp.setName(rs1.getString(2));
                cp.setNick_name(rs1.getString(3));
                cp.setEmail(rs1.getString(8));
                cp.setHome_phone(rs1.getString(5));
                
            }
            
        }catch(Exception e){System.out.println(e);}
        return cp;
    }
   
   public contactPerson Last(){
         contactPerson cp = new contactPerson() ;  
       try{
          
            
            if (rs1.last()){
                cp.setID(rs1.getInt(1));
                cp.setName(rs1.getString(2));
                cp.setNick_name(rs1.getString(3));
                cp.setEmail(rs1.getString(8));
                cp.setHome_phone(rs1.getString(5));
                
            }
            
        }catch(Exception e){System.out.println(e);}
        return cp;
    }
   
   public contactPerson Next(){
         contactPerson cp = new contactPerson() ; 
        
         
         try{
          
            
           
            if (rs1.next()){
                cp.setID(rs1.getInt(1));
                cp.setName(rs1.getString(2));
                cp.setNick_name(rs1.getString(3));
                cp.setEmail(rs1.getString(8));
                cp.setHome_phone(rs1.getString(5));
               
            }
            else{
               cp = this.First();
            }
            
            
        }catch(Exception e){System.out.println(e);}
         
        return cp;
    }
   
   
   public contactPerson Prev(){
         contactPerson cp = new contactPerson() ; 
         
         
         try{
          
            
           
            if (rs1.previous()){
                cp.setID(rs1.getInt(1));
                cp.setName(rs1.getString(2));
                cp.setNick_name(rs1.getString(3));
                cp.setEmail(rs1.getString(8));
                cp.setHome_phone(rs1.getString(5));
               
            }
            else{
               cp = this.Last();
            }
            
            
        }catch(Exception e){System.out.println(e);}
         
        return cp;
    }
        
    }
    

