/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author rces0
 */
public class Cliente {
    private int dni;
    private String nombreCOmpleto;
    private String nroCelular;

    public Cliente(int dni, String nombreCOmpleto, String nroCelular) {
        this.dni = dni;
        this.nombreCOmpleto = nombreCOmpleto;
        this.nroCelular = nroCelular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreCOmpleto() {
        return nombreCOmpleto;
    }

    public void setNombreCOmpleto(String nombreCOmpleto) {
        this.nombreCOmpleto = nombreCOmpleto;
    }

    public String getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }
    
    
    
}
