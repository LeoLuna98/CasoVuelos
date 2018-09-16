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
    private String nomVuelo;
    private int numAsientos;
    private ListaEnlPasajero listaPasajeros;

    public Vuelo(String nomVuelo, int numAsientos) {
        this.nomVuelo = nomVuelo;
        this.numAsientos = numAsientos;
        this.listaPasajeros = null;
    }

    public Vuelo(String nomVuelo, int numAsientos, ListaEnlPasajero listaPasajeros) {
        this.nomVuelo = nomVuelo;
        this.numAsientos = numAsientos;
        this.listaPasajeros = listaPasajeros;
    }

    public String getNomVuelo() {
        return nomVuelo;
    }

    public void setNomVuelo(String nomVuelo) {
        this.nomVuelo = nomVuelo;
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
        String cad = "ID del vuelo: " + nomVuelo + 
                "\nAsientos disponibles: " +numAsientos +
                "\nPasajeros: \n" + listaPasajeros.obtenerInfo();
        return cad;
    }  
    
    public void agregarPasajeroAlVuelo(Pasajero pasajero) {
        listaPasajeros.agregarNuevoPasajero(pasajero);
        numAsientos--;
    }
}
