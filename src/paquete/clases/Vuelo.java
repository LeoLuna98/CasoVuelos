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
public class Vuelo {
    private int numVuelo;
    private int numAsientos;
    private ListaEnlPasajero listaPasajeros;

    public Vuelo(int numVuelo, int numAsientos) {
        this.numVuelo = numVuelo;
        this.numAsientos = numAsientos;
        this.listaPasajeros = null;
    }

    public Vuelo(int numVuelo, int numAsientos, ListaEnlPasajero listaPasajeros) {
        this.numVuelo = numVuelo;
        this.numAsientos = numAsientos;
        this.listaPasajeros = listaPasajeros;
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
    
    public void agregarPasajeroAlVuelo(Pasajero pasajero) {
        listaPasajeros.agregarNuevoPasajero(pasajero);
        numAsientos--;
    }
}
