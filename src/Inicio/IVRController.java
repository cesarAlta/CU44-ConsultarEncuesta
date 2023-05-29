/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Inicio;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author rces0
 */
public class IVRController implements Initializable {
    @FXML
    private Button btnEncuesta;
    @FXML
    private ImageView imageViewIVR;
     @FXML
    private ImageView imageViewMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        agregarImagenBoteones();
       
        // TODO
    }

    public void agregarImagenBoteones() {
        String linkEncuesta = "F:/3-DSI-2023/impCU44/CU44-ConsultarEncuesta/icons/enc.png";
        String linkMenu = "F:/3-DSI-2023/impCU44/CU44-ConsultarEncuesta/icons/menu-icon.png";
        String linkIVR ="F:/3-DSI-2023/impCU44/CU44-ConsultarEncuesta/icons/IVR-removebg-preview.png";

        Image imagenEncuesta = new Image(linkEncuesta,40, 40, false, true);
        Image imagenMenu = new Image(linkMenu, 24, 24, false, true);
        Image imagenIVR = new Image(linkIVR, 100, 100, false, true);
        
        btnEncuesta.setGraphic(new ImageView(imagenEncuesta));
        imageViewIVR.setImage(imagenIVR);       
        imageViewMenu.setImage(imagenMenu);


    }
    public void opcionConsultaEncuesta() throws IOException{

        Stage stage ;
Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Views/pantallaEncuesta.fxml"));
Scene scene = new Scene(root);
stage = new Stage(StageStyle.UNDECORATED );
stage.setScene(scene);
stage.show();
        
    }

}
