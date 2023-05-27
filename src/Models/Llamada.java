/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author rces0
 */
public class Llamada {

    private String descripcionOperador;
    private String detalleAccionRequerida;
    private double duracion;
    private boolean encuenstaEnviada;
    private String observacionAuditor;
    private CambioEstado cambioEstado[];
    private Cliente cliente;
    private RespuestaDeCliente respuestaDeEncuesta[];

//Constructor
    public Llamada(String descripcionOperador, String detalleAccionRequerida, double duracion, boolean encuenstaEnviada, String observacionAuditor, CambioEstado[] cambioEstado, Cliente cliente, RespuestaDeCliente[] respuestaDeEncuesta) {
        this.descripcionOperador = descripcionOperador;
        this.detalleAccionRequerida = detalleAccionRequerida;
        this.duracion = duracion;
        this.encuenstaEnviada = encuenstaEnviada;
        this.observacionAuditor = observacionAuditor;
        this.cambioEstado = cambioEstado;
        this.cliente = cliente;
        this.respuestaDeEncuesta = respuestaDeEncuesta;
    }
//inicio getter and setter

    public String getDescripcionOperador() {
        return descripcionOperador;
    }

    public void setDescripcionOperador(String descripcionOperador) {
        this.descripcionOperador = descripcionOperador;
    }

    public String getDetalleAccionRequerida() {
        return detalleAccionRequerida;
    }

    public void setDetalleAccionRequerida(String detalleAccionRequerida) {
        this.detalleAccionRequerida = detalleAccionRequerida;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEncuenstaEnviada() {
        return encuenstaEnviada;
    }

    public void setEncuenstaEnviada(boolean encuenstaEnviada) {
        this.encuenstaEnviada = encuenstaEnviada;
    }

    public String getObservacionAuditor() {
        return observacionAuditor;
    }

    public void setObservacionAuditor(String observacionAuditor) {
        this.observacionAuditor = observacionAuditor;
    }

    public CambioEstado[] getCambioEstado() {
        return cambioEstado;
    }

    public void setCambioEstado(CambioEstado[] cambioEstado) {
        this.cambioEstado = cambioEstado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public RespuestaDeCliente[] getRespuestaDeEncuesta() {
        return respuestaDeEncuesta;
    }

    public void setRespuestaDeEncuesta(RespuestaDeCliente[] respuestaDeEncuesta) {
        this.respuestaDeEncuesta = respuestaDeEncuesta;
    }

    //fin getter and setter
    
    // inicio como yo lo haria como yo lo haria    
    //comprueba que el cambio de estado de la llamada este dentro del periodo que recibe coomo parametro
    public CambioEstado esDePeriodo(LocalDate inicio, LocalDate fin) {
        /*
        se recorre los cambios de estados validado que sea al cambio de estado 
        con estado finalizado al que este dentro del periodo requerido.  
        Y se lo retorna sino se retorna null */
        
        for (CambioEstado ce : getCambioEstado()) {
            if (ce.esUltimoEstado()
                    && ce.getFechaHoraInicio().isAfter(inicio.atTime(0, 0, 0)) && ce.getFechaHoraInicio().isBefore(fin.atTime(0, 0, 0))) {
                return ce;
            }
        }
        return null;
    }

    public boolean tieneEncuestaEnviada() {
        return this.encuenstaEnviada;
    }

    public boolean tieneRespuesta() {
        return (respuestaDeEncuesta != null && respuestaDeEncuesta.length > 0) ? true : false;

    }

    public String getNombreClienteDeLlamada() {
        return this.cliente.getNombreCOmpleto();
    }

    public String getEstadoActual() {
        String estAct = null;
        for (CambioEstado ce : cambioEstado) {
            if (ce.esUltimoEstado()) {
                estAct = ce.getNombreEstado();
            }
        }
        return estAct;
    }

    public List<RespuestaPosible> getResupestas() {
        List<RespuestaPosible> respPosible = new ArrayList<>();
        for (RespuestaDeCliente resCli : respuestaDeEncuesta) {
            respPosible.add(resCli.getRespuestaSeleccionada());
        }
        return respPosible;
    }

    public String[] getDatosParaConsultaDeEncuesta(CambioEstado ultimoCE) {
       
        return new String[]{getNombreClienteDeLlamada(),ultimoCE.getNombreEstado(),""+getDuracion()};
            
    }

}
