/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Hamdy
 */
public class GUI {
    contactPerson cp ; 
    ContactDAO cdao ; 
    public GUI(){
         cp = new contactPerson();
         cdao= new ContactDAO() ; 
         
    Stage primaryStage = new Stage ();
    primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text scenetitle = new Text("Personal Details");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label ID = new Label("ID:");
        grid.add(ID, 0, 1);

        TextField IDTextField = new TextField();
        grid.add(IDTextField, 3, 1);
        IDTextField.setDisable(true);

        Label userName = new Label("First Name:");
        grid.add(userName, 0, 2);

        TextField userTextField = new TextField();
        grid.add(userTextField, 3, 2);

        Label nn = new Label("Nick_name:");
        grid.add(nn, 0, 3);

        TextField nicl_nameTextField = new TextField();
        grid.add(nicl_nameTextField, 3, 3);
        
         Label emaillb = new Label("email:");
        grid.add(emaillb, 0, 4);

        TextField emailtf = new TextField();
        grid.add(emailtf, 3, 4);
        
         Label phonelb = new Label("Phone:");
        grid.add(phonelb, 0, 5);

        TextField phonetf = new TextField();
        grid.add(phonetf, 3, 5);
        
        Button btnf = new Button("First");
        Button btnnext = new Button("next");
        Button btnpre = new Button("pre");
        Button btnl = new Button("Last");
        
        HBox first = new HBox(10);
        first.setAlignment(Pos.BOTTOM_RIGHT);
        first.getChildren().add(btnf);
        grid.add(first, 0, 6);
        
        HBox next = new HBox(10);
        next.setAlignment(Pos.BOTTOM_RIGHT);
        next.getChildren().add(btnnext);
        grid.add(next, 1, 6);
        
        HBox pre = new HBox(10);
        pre.setAlignment(Pos.BOTTOM_RIGHT);
        pre.getChildren().add(btnpre);
        grid.add(pre, 2, 6);
        
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btnl);
        grid.add(hbBtn,3, 6);
        
        
        /////////////////////////
        btnf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                cp = new contactPerson();
                cdao= new ContactDAO() ; 
                cp=cdao.First();
               
                IDTextField.setText(String.valueOf(cp.getID()));
                userTextField.setText(cp.getName());
                nicl_nameTextField.setText(cp.getNick_name());
                emailtf.setText(cp.getEmail());
                phonetf.setText(cp.getHome_phone());

            }
        });
        
         btnl.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                cp = new contactPerson();
                cdao= new ContactDAO() ; 
                cp=cdao.Last();
               
                IDTextField.setText(String.valueOf(cp.getID()));
                userTextField.setText(cp.getName());
                nicl_nameTextField.setText(cp.getNick_name());
                emailtf.setText(cp.getEmail());
                phonetf.setText(cp.getHome_phone());

            }
        });
         
         btnnext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                //cp = new contactPerson();
                //cdao= new ContactDAO() ; 
                cp=cdao.Next();
               
                IDTextField.setText(String.valueOf(cp.getID()));
                userTextField.setText(cp.getName());
                nicl_nameTextField.setText(cp.getNick_name());
                emailtf.setText(cp.getEmail());
                phonetf.setText(cp.getHome_phone());

            }
        });
         
          btnpre.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                //cp = new contactPerson();
                //cdao= new ContactDAO() ; 
                cp=cdao.Prev();
               
                IDTextField.setText(String.valueOf(cp.getID()));
                userTextField.setText(cp.getName());
                nicl_nameTextField.setText(cp.getNick_name());
                emailtf.setText(cp.getEmail());
                phonetf.setText(cp.getHome_phone());

            }
        });
        
        Scene scene = new Scene(grid, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
}
   

     
}
