/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author rces0
 */
public class Estado {

    private String nombre;

    public Estado(String nombre) {
        this.nombre = nombre;
    }

    public boolean esIniciada() {
        return nombre.equals("Iniciada");
    }

    public String getNombre() {
        return nombre;

    }

    public boolean esFinalizada() {
        return this.nombre.equals("Finalizada");
    }
}
