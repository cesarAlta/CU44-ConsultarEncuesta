/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author rces0
 */
public class Encuesta {

    private String descripcion;
    private LocalDate fechaFinVigencia;
    private Pregunta[] preguntas;

//Constructor
    public Encuesta(String descripcion, LocalDate fechaFinVigencia, Pregunta[] pregunta) {
        this.descripcion = descripcion;
        this.fechaFinVigencia = fechaFinVigencia;
        this.preguntas = pregunta;
    }

    // incio getter andf setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(LocalDate fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Pregunta[] getPregunta() {
        return preguntas;
    }

    public void setPregunta(Pregunta[] pregunta) {
        this.preguntas = pregunta;
    }
//fin getter and setter

    public HashMap<String,String> getDescripcionEncuesta(List<RespuestaPosible> respPosible) {
        HashMap<String,String> desEncuesta = new HashMap<>();      

        for (RespuestaPosible resPosible : respPosible) {
             for (Pregunta p : preguntas) {
            String descRta = p.getDescripcion(resPosible);
            if(descRta!=null){                
                desEncuesta.put(p.getPregunta(), descRta);
            }
        }
        }
       
        return desEncuesta;

    }

    public boolean esEncustaDeCliente(RespuestaPosible respPosible) {
        boolean esEncuestaDelCliente = false;
        for (Pregunta p : preguntas) {
            esEncuestaDelCliente = p.esRespuestaDelCliente(respPosible);
        }
        return esEncuestaDelCliente;
    }
}
