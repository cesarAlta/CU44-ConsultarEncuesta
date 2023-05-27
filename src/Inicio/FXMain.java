package Inicio;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */


import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author rces0
 */
public class FXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
       Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Views/pantallaEncuesta.fxml"));    
//       Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));

       primaryStage.setTitle("Consulta de encuesta de llamadas");
       primaryStage.setScene(new Scene(root));
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
