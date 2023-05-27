/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author rces0
 */
public class RespuestaPosible {
    private String descripcion;
    private int valor;

    public RespuestaPosible(String descripcion, int valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

  
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
   
    public String getDescripcionRta(){
        return this.descripcion;
        
    }

}
