/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.test;

import javax.swing.JOptionPane;
import paquete.clases.GestionVuelos;
import paquete.clases.ListaEnlPasajero;
import paquete.clases.Pasajero;
import paquete.clases.Vuelo;

/**
 *
 * @author Leonardo
 */
public class test {
    
    public static void main(String[] args) {
        
        ListaEnlPasajero<Pasajero> lista = new ListaEnlPasajero<>();
        GestionVuelos obGE = new GestionVuelos();
        
        /*lista.obtenerInfo();
        
        if (lista.mayorEdad() == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
        }
        
        
        int dni1 = 522;
        int flag1 = lista.busquedaDNI(dni1);
        System.out.println(flag1);
        if (flag1 == 0) {
            Pasajero pasj1 = new Pasajero("Leo", dni1);
            pasj1.generarEdad();
            lista.agregarNuevoPasajero(pasj1);
        }
        
        
        
        Pasajero pasj2 = new Pasajero("Ledo", 2);
        pasj2.generarEdad();
        lista.agregarNuevoPasajero(pasj2);
        
        int dni = 465;
        int flag = lista.busquedaDNI(dni);
        System.out.println(flag);
        if (flag == 0) {
            Pasajero pasj3 = new Pasajero("Lefo", dni);
            pasj3.generarEdad();
            lista.agregarNuevoPasajero(pasj3);
        }
        
        System.out.println(lista.mayorEdad().getEdad());*/
        
        Pasajero pj = new Pasajero("Leo", 1234);
        pj.generarEdad();
        lista.agregarNuevoPasajero(pj);
        Pasajero pj2 = new Pasajero("Diana", 9964);
        pj2.generarEdad();
        lista.agregarNuevoPasajero(pj2);
        Pasajero pj3 = new Pasajero("Bruno", 14747);
        pj3.generarEdad();
        lista.agregarNuevoPasajero(pj3);
        Pasajero pj4 = new Pasajero("Roro", 7527);
        pj4.generarEdad();
        lista.agregarNuevoPasajero(pj4);
        
        System.out.println(lista.obtenerInfo());
        System.out.println("\n");
        
        //lista.eliminarDeLista(147475);
        
        System.out.println(lista.obtenerInfo());
        
        System.out.println("----------------------");
        
        Vuelo vuelo1 = new Vuelo(5556, 100, lista);
        System.out.println(vuelo1.obeneterInfoVuelo());
        
        System.out.println("----------------------");
        
        Pasajero pj5 = new Pasajero("pepe", 9964);
        pj5.generarEdad();
        
        
        Vuelo vuelo2 = new Vuelo(1234, 222);
        Vuelo vuelo3 = new Vuelo(12434, 222);
        Vuelo vuelo4 = new Vuelo(12354, 222);
        
        
        vuelo1.agregarPasajeroAlVuelo(pj5);
        obGE.agregarVuelo(vuelo1);
        obGE.agregarVuelo(vuelo2);
        obGE.agregarVuelo(vuelo3);
        obGE.agregarVuelo(vuelo4);
        obGE.verInfo();
        
        System.out.println("----------------------");
        obGE.eliminarConReferencia(124346546);
        obGE.verInfo();
        
        
    }
    
}
