/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
/**
 *
 * @author rces0
 */
public class RespuestaDeCliente {
    private LocalDate fechaEncuesta;
    private RespuestaPosible respuestaSeleccionada;

    public RespuestaDeCliente(LocalDate fechaEncuesta, RespuestaPosible respuestaPosible) {
        this.fechaEncuesta = fechaEncuesta;
        this.respuestaSeleccionada = respuestaPosible;
    } 

    public LocalDate getFechaEncuesta() {
        return fechaEncuesta;
    }

    public void setFechaEncuesta(LocalDate fechaEncuesta) {
        this.fechaEncuesta = fechaEncuesta;
    }

    public RespuestaPosible getRespuestaSeleccionada() {
        return respuestaSeleccionada;
    }

    public void setRespuestaSeleccionada(RespuestaPosible respuestaSeleccionada) {
        this.respuestaSeleccionada = respuestaSeleccionada;
    }    
    
    public String getDescripcionRta(){
        return respuestaSeleccionada.getDescripcion();
    }
    
    
}
