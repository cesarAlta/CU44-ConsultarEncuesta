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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private ListView<String> listViewLlamadas;
    @FXML
    private Label labNombreDelCliente;
    @FXML
    private Label labEstadoLlamada;
    @FXML
    private Label labDuraacionLlamada;
    @FXML
    private Label labTitulonEncuesta;
    @FXML
    private ListView<String> lsitViewPregYresp;
    @FXML
    private AnchorPane anchorPaneSelleccionLlamada;
    @FXML
    private AnchorPane anchorPaneDetalleEncuesta;

    public PantallaEncuestaController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gestorConsultarEncuesta = new GestorConsultarEncuesta(this);
        try {
            gestorConsultarEncuesta.opConsultarEncuesta();
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
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
        listViewLlamadas.setItems(FXCollections.observableArrayList(llamadasConRespuestas.values()));
        
        listViewLlamadas.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String choice = (String) listViewLlamadas.getSelectionModel().getSelectedItem();
            for (Map.Entry<Llamada, String> llamda : llamadasConRespuestas.entrySet()) {
                if (choice.equals(llamda.getValue())) {
                    tomarSeleccionLlamada(llamda.getKey());
                }
            }
        });
    }

    public void tomarSeleccionLlamada(Llamada llamadaSel) {        
        gestorConsultarEncuesta.tomarSeleccionLlamada(llamadaSel);
        anchorPaneDetalleEncuesta.setVisible(true);
        anchorPaneSelleccionLlamada.setVisible(false);

    }

    public void mostrarDatosDeLaEncuesta(List<String> res) {
        this.labNombreDelCliente.setText(res.get(0));
        this.labEstadoLlamada.setText(res.get(1));
        this.labDuraacionLlamada.setText(res.get(2));
        this.labTitulonEncuesta.setText(res.get(3));

        List<String> pregYres = new ArrayList<>();

        for (int i = 4; i < res.size(); i++) {
            pregYres.add(res.get(i));

        }
        lsitViewPregYresp.setItems(FXCollections.observableArrayList(pregYres));

    }

    public void cerrarDetalleEncuesta() {
        this.anchorPaneDetalleEncuesta.setVisible(false);
        this.anchorPaneSelleccionLlamada.setVisible(true);

    }

    public void tomarSeleccionDeVisualizacioon() {
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

    @FXML
    public void salir(ActionEvent e) {
        Node source = (Node) e.getSource();     //Me devuelve el elemento al que hice click
        Stage stage = (Stage) source.getScene().getWindow();    //Me devuelve la ventana donde se encuentra el elemento
        stage.close();

    }

}
