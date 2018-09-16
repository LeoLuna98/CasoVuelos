/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.test;

import paquete.clases.ListaEnlPasajero;
import paquete.clases.Pasajero;

/**
 *
 * @author Leonardo
 */
public class test {
    
    public static void main(String[] args) {
        
        ListaEnlPasajero<Pasajero> lista = new ListaEnlPasajero<>();
        
        Pasajero pasj1 = new Pasajero("Leo", 522);
        pasj1.generarEdad();
        
        Pasajero pasj2 = new Pasajero("Ledo", 2);
        pasj2.generarEdad();
        
        Pasajero pasj3 = new Pasajero("Lefo", 50);
        pasj3.generarEdad();
        
        
        lista.agregarNuevoPasajero(pasj1);
        lista.agregarNuevoPasajero(pasj2);
        lista.agregarNuevoPasajero(pasj3);
        lista.recorrido();
        
    }
    
}
