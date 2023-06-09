/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.util.ArrayList;
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

    public List<String> getDescripcionEncuesta(List<RespuestaPosible> respPosible) {
        List<String> desEncuesta = new ArrayList<>();

        for (Pregunta p : getPregunta()) {           
            for (RespuestaPosible resPosible : respPosible) {
                String descRta = p.getDescripcion(resPosible);
                if (descRta != null) {
                    if(desEncuesta.isEmpty())
                        desEncuesta.add(getDescripcion());
                    desEncuesta.add(descRta);
                }
                descRta=null;
             }
        }

//     
//        for (RespuestaPosible resPosible : respPosible) {
//            System.out.println(resPosible.getDescripcion());
//             for (Pregunta p : preguntas) {
//            String descRta = p.getDescripcion(resPosible);
//            if(descRta!=null){  
//                System.out.println(p.getPregunta());
//                desEncuesta.put(p.getPregunta(), descRta);
//            }
//        }
//        }
//       
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
