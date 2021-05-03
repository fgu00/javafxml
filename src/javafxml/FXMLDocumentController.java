/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxml;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author russo.salvatore
 */
public class FXMLDocumentController implements Initializable {
    private static int pos=0;
    @FXML
    private Label label;
    @FXML
    private Rectangle r4=new Rectangle();
    @FXML
    private Rectangle r5=new Rectangle();;
    @FXML
    private Rectangle r6=new Rectangle();;
    @FXML
    private Rectangle r7=new Rectangle();;
    @FXML
    private Rectangle r1=new Rectangle();;
    @FXML
    private Rectangle r2=new Rectangle();;
    @FXML
    private Rectangle r3=new Rectangle();;
    @FXML
    private Button avanti=new Button();
    @FXML
    private Button indietro=new Button();
    private Rectangle[]a={r1,r2,r3,r4,r5,r6,r7};
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        avanti.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
             //  this.avanti();
            }
            
        });
    }    

    @FXML
    private void avanti(ActionEvent event) {
        if(pos<a.length-1){
            a[pos].setStroke(Color.WHITE);
            a[pos+1].setStroke(Color.RED);
            pos++;
        }
    }

    @FXML
    private void indietro(ActionEvent event) {
         if(pos>0){
            a[pos].setStroke(Color.WHITE);
            a[pos-1].setStroke(Color.RED);
            pos--;
        }
    }
}

   
