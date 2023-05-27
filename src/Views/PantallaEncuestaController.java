/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import Controllers.GestorConsultarEncuesta;
import Models.Llamada;
import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author rces0
 */
public class PantallaEncuestaController implements Initializable {

    GestorConsultarEncuesta gestorConsultarEncuesta;

    @FXML
    private DatePicker datePickInicio;
    @FXML
    private DatePicker datePickFin;
    @FXML
    private Button btnBuscarLLamadas;
    @FXML
    private TableView<Llamada> tabLlamadas;
    @FXML
    private ListView listLlamadas;
    @FXML
    private TextArea descEncuesta;
    @FXML
    private Label nombreDelCliente;
    @FXML
    private Label estadoLlamada;
    @FXML
    private Label duraacionLlamada;
    @FXML
    private Label titulonEncuesta;
    @FXML
    private ListView lsitPregYresp;
    @FXML
    private AnchorPane selleccionLlamada;
    @FXML
    private AnchorPane   detalleEncuesta;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gestorConsultarEncuesta = new GestorConsultarEncuesta(this);
        try {
            gestorConsultarEncuesta.opConsultarEncuesta();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void solicitarSeleccionDePeriodo() {
        datePickInicio.setValue(LocalDate.now());
        datePickFin.setValue(LocalDate.now());

    }

    public void tomarSeleccionDePeriodo() {
        LocalDate fechaInicioPeriodo = datePickInicio.getValue();
        LocalDate fechaFinPeriodo = (datePickFin.getValue());

        gestorConsultarEncuesta.tomarSeleccionFecaInicioPerioso(fechaInicioPeriodo, fechaFinPeriodo);

    }

    public void solicitarSeleccionLlamada(HashMap<Llamada, String> llamadasConRespuestas) {
        listLlamadas.setItems(FXCollections.observableArrayList(llamadasConRespuestas.values()));

        listLlamadas.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String choice = (String) listLlamadas.getSelectionModel().getSelectedItem();
            for (Map.Entry<Llamada, String> llamda : llamadasConRespuestas.entrySet()) {
                if (choice.equals(llamda.getValue())) {
                    tomarSeleccionLlamada(llamda.getKey());
                }
            }

        });
    }

    public void tomarSeleccionLlamada(Llamada llamadaSel) {
        gestorConsultarEncuesta.tomarSeleccionLlamada(llamadaSel);
        detalleEncuesta.setVisible(true);
        selleccionLlamada.setVisible(false);

    }

    public void mostrarDatosDeLaEncuesta(List<String> res) {
        this.nombreDelCliente.setText(res.get(0));
        this.estadoLlamada.setText(res.get(1));
        this.duraacionLlamada.setText(res.get(2));
        this.titulonEncuesta.setText(res.get(3));
        
      List<String> pregYres = new ArrayList<String>();
      
        for (int i = 4; i < res.size(); i++) {
          pregYres.add(res.get(i));
               
        }
        lsitPregYresp.setItems(FXCollections.observableArrayList(pregYres));        

    }
    public void cerrarDetalleEncuesta(){
        this.detalleEncuesta.setVisible(false);
        this.selleccionLlamada.setVisible(true);
    
    }
    public void generarCSV(){
        gestorConsultarEncuesta.generarCSV();
        
    }

    public void informarAvisoDeGeneracionExitosa() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setHeaderText(null);
    alert.setTitle("Info");
    alert.setContentText("El archivo se genero correctamente!");
    alert.showAndWait();
    }

    public void mostrarAlertaErrorCsv(String par) {
         Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setHeaderText(null);
    alert.setTitle("Error!");
    alert.setContentText(par);
    alert.showAndWait();
    }

}
