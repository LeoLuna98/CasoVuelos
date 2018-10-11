/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Vuelo {
    private int numVuelo;
    private int numAsientos;
    private ListaEnlPasajero listaPasajeros;

    public Vuelo(int numVuelo, int numAsientos) {
        this.numVuelo = numVuelo;
        this.numAsientos = numAsientos;
        listaPasajeros = new ListaEnlPasajero();
    }
   
    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public ListaEnlPasajero getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(ListaEnlPasajero listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }
    
    public String obeneterInfoVuelo() {
        String cad = "Número del vuelo: N" + numVuelo + 
                "\nAsientos disponibles: " +numAsientos +
                "\nPasajeros: \n" + listaPasajeros.obtenerInfo();
        return cad;
    }
    
    public String obeneterInfoVueloSinPasajeros() {
        String cad = "Número del vuelo: N" + numVuelo + 
                "\nAsientos disponibles: " +numAsientos;
        return cad;
    }  
    
    public void agregarPasajeroAlVuelo(Pasajero pasajero) {
        if (numAsientos!=0) {
            pasajero.generarEdad();
            if(listaPasajeros.agregarNuevoPasajero(pasajero)) {
                numAsientos--;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay asientos disponibles");
        }
    }
    
    public void eliminarPasajeroDelVuelo(long dni) {
        if(listaPasajeros.eliminarDeLista(dni)) {
            numAsientos++;
        }
    }
    
    public void verMayorEdadEnVuelo() {
        Pasajero pasajero = listaPasajeros.mayorEdad();
        if (pasajero != null) {
            String cad = "Nombre: " + pasajero.getNombre()
                    + "\nDNI: " + pasajero.getDni()
                    + "\nEdad: " + pasajero.getEdad();
            JOptionPane.showMessageDialog(null, cad);
        }
    }
    
    public void ObtenerListaOrdenada() {
        listaPasajeros.ordenarLista();
    }
}
