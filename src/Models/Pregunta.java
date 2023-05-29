/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author rces0
 */
public class Pregunta {

    private String Pregunta;
    private RespuestaPosible[] respuesta;

    public Pregunta(String Pregunta, RespuestaPosible[] respuestaPosible) {
        this.Pregunta = Pregunta;
        this.respuesta = respuestaPosible;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    public RespuestaPosible[] getRespuestaPosible() {
        return respuesta;
    }

    public void setRespuestaPosible(RespuestaPosible[] respuestaPosible) {
        this.respuesta = respuestaPosible;
    }

    public boolean esRespuestaDelCliente(RespuestaPosible respPosible) {
        boolean esRespuestaDelCliente = false;

        for (RespuestaPosible rp : respuesta) {
            if (Objects.equals(rp, respPosible)) {
                esRespuestaDelCliente = true;
            }
        }        
        return esRespuestaDelCliente;
    }

    public  String getDescripcion(RespuestaPosible respPosSeleccionada) {
        String pregResp = null;
        for (RespuestaPosible rp : respuesta) {
            if (rp.equals(respPosSeleccionada)) {
                 pregResp = "¿"+ getPregunta()+"? "+"--> "+respPosSeleccionada.getDescripcionRta();
            }
        }
        return pregResp;

    }

   public boolean esMiPregunta(RespuestaPosible resPosible) {
       for(RespuestaPosible rp : getRespuestaPosible()){
           if(rp.equals(resPosible))
               return true;
       }
       return false;
    }
}
