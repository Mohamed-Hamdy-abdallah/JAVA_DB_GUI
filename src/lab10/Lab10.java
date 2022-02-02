/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab10;

/**
 *
 * @author Mohamed Hamdy
 */
import java.sql.*;  
import javafx.application.Application;
import javafx.stage.Stage;

public class Lab10 extends Application{

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
       Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         GUI g = new GUI(); 
    }
    
}
