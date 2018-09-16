/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Leonardo
 */
public class GestionVuelos {
    private Vuelo[] arreglo;
    private int cantidadVuelos;

    public GestionVuelos() {
        arreglo = new Vuelo[100];
        cantidadVuelos = 0;
    }

    public Vuelo[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Vuelo[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getCantidadVuelos() {
        return cantidadVuelos;
    }

    public void setCantidadVuelos(int cantidadVuelos) {
        this.cantidadVuelos = cantidadVuelos;
    }
    
    
    
}
