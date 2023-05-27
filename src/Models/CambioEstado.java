/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author rces0
 */
public class CambioEstado {

    private LocalDateTime fechaHoraInicio;
    private Estado estado;

    public CambioEstado(LocalDateTime fechaHoraInicio, Estado estado) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.estado = estado;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public String getNombreEstado() {
        return this.estado.getNombre();
    }

    public boolean esEstadoInicial() {
        //si esta iniciada retorna verdadero sino falso.
        return estado.esIniciada();
    }

    public boolean esUltimoEstado() {
        return estado.esFinalizada();
    }
}
