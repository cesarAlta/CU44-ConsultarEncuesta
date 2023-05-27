/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.CambioEstado;
import Models.Encuesta;
import Models.Llamada;
import Models.RespuestaDeCliente;
import Models.RespuestaPosible;
import Utilities.CargaDeDatos;
import Views.PantallaEncuestaController;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.control.Alert;

/**
 *
 * @author rces0
 */
public class GestorConsultarEncuesta {

    private final PantallaEncuestaController controller;
    private HashMap<Llamada, CambioEstado> hashMapLLamadaUltimoCe;

    public GestorConsultarEncuesta(PantallaEncuestaController controller) {
        this.controller = controller;
    }

    public void opConsultarEncuesta() {
        controller.solicitarSeleccionDePeriodo();

    }

    public void tomarSeleccionFecaInicioPerioso(LocalDate fechaInicioPeriodo, LocalDate fechaFinPeriodo) {
        buscarLlamadasConEncuestasResp(fechaInicioPeriodo, fechaFinPeriodo);
    }

    private void buscarLlamadasConEncuestasResp(LocalDate inicio, LocalDate fin) {
        List<Llamada> llamdas = CargaDeDatos.getLLamadas();

        hashMapLLamadaUltimoCe = new HashMap<>();
        HashMap<Llamada, String> hasMostrarLLamadas = new HashMap<>();

        //se buscan las llamadas con encuesta resp.
        for (Llamada llamada : llamdas) {
            //por cada llamada se pregunta si tiene encuesta enviada y tiene resp.
            if (llamada.tieneEncuestaEnviada() && llamada.tieneRespuesta()) {
                //si cumple la condicion se buscan las llamadas finalizadas que este dentro del periodo y se guarda con su estdo finalizado
                CambioEstado cambioEstadoFinalizadoDeLallamada = llamada.esDePeriodo(inicio, fin);

                if (llamada.esDePeriodo(inicio, fin) != null) {
                    hashMapLLamadaUltimoCe.put(llamada, cambioEstadoFinalizadoDeLallamada);
                    hasMostrarLLamadas.put(llamada,
                            "Fecha de llamada: " + cambioEstadoFinalizadoDeLallamada.getFechaHoraInicio().toLocalDate().toString() + ". Hora: " + cambioEstadoFinalizadoDeLallamada.getFechaHoraInicio().toLocalTime());
                }
            }
        }

        controller.solicitarSeleccionLlamada(hasMostrarLLamadas);
    }

    private Encuesta encuestaLlamadaSeleccionada = null;
    private List<String> mostrarTodosLosDatosLlamada;

    public void tomarSeleccionLlamada(Llamada llamadaSel) {

        mostrarTodosLosDatosLlamada = new ArrayList<>();
        String[] datosLlamada = obtenerDatosDeLallamada(llamadaSel);
        List<RespuestaPosible> respPosibleCliSeleccionada = obtenerRespuestaDeClienteDeLlamadaSeleccionada(llamadaSel);
        HashMap<String, String> mapPregYResp = obtenerEncuestaDeLlamadaSel(respPosibleCliSeleccionada);

        mostrarTodosLosDatosLlamada.add(datosLlamada[0]);
        mostrarTodosLosDatosLlamada.add(datosLlamada[1]);
        mostrarTodosLosDatosLlamada.add(datosLlamada[2]);
        mostrarTodosLosDatosLlamada.add(encuestaLlamadaSeleccionada.getDescripcion());

        for (Map.Entry<String, String> entry : mapPregYResp.entrySet()) {
            String res = "¿ " + entry.getKey() + "? " + "-->" + entry.getValue();
            System.out.println(res);

            mostrarTodosLosDatosLlamada.add(res);
        }
        controller.mostrarDatosDeLaEncuesta(mostrarTodosLosDatosLlamada);
    }

    public String[] obtenerDatosDeLallamada(Llamada llamadaSel) {

        CambioEstado ultimoEstado = hashMapLLamadaUltimoCe.get(llamadaSel);
        return llamadaSel.getDatosParaConsultaDeEncuesta(ultimoEstado);
    }

    public List<RespuestaPosible> obtenerRespuestaDeClienteDeLlamadaSeleccionada(Llamada llamadaSel) {
        return llamadaSel.getResupestas();
    }

    public String obtenerClienteDeLlamada(Llamada llamadaSel) {
        return llamadaSel.getNombreClienteDeLlamada();
    }

    private String obtenerEstadoActualDeLLamadaSel(Llamada llamadaSel) {
        return llamadaSel.getEstadoActual();
    }

    private String obtenerDuracionDeLLamadaSel(Llamada llamdasel) {
        return " " + llamdasel.getDuracion();
    }

    private HashMap<String, String> obtenerEncuestaDeLlamadaSel(List<RespuestaPosible> respPosibleCliSeleccionada) {

        List<Encuesta> encuestas = CargaDeDatos.getEncuestas();
        for (RespuestaPosible rp : respPosibleCliSeleccionada) {
            for (Encuesta enc : encuestas) {
                if (enc.esEncustaDeCliente(rp)) {
                    encuestaLlamadaSeleccionada = enc;
                }
            }
        }
        HashMap<String, String> descEncuestaLlamadaSel = encuestaLlamadaSeleccionada.getDescripcionEncuesta(respPosibleCliSeleccionada);

        return descEncuestaLlamadaSel;
    }

    public void generarCSV() {
        String rutaArchivo = "F:/3-DSI-2023/impCU44/CU44-ConsultarEncuesta/Csvs/archivo.csv";

        try (FileWriter fileWriter = new FileWriter(rutaArchivo); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            // Escribir encabezados: nombre, estado actual de la llamda, duracion de lla llamada
            printWriter.println(
                    "Cliente: " + mostrarTodosLosDatosLlamada.get(0) + ". Llamada: " + mostrarTodosLosDatosLlamada.get(1) + ". Duracion:" + mostrarTodosLosDatosLlamada.get(2));

            // Escribir datos pregunta respuesta
            printWriter.println(mostrarTodosLosDatosLlamada.get(3));
            for (int i = 4; i < mostrarTodosLosDatosLlamada.size(); i++) {
                printWriter.println(mostrarTodosLosDatosLlamada.get(i));

            }
            
            controller.informarAvisoDeGeneracionExitosa();


        } catch (IOException e) {
            System.out.println("Error al generar el archivo CSV: " + e.getMessage());
            controller.mostrarAlertaErrorCsv("Error al generar el archivo CSV: " + e.getMessage());
        }
        

    }

}
