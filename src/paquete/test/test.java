/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.test;

import javax.swing.JOptionPane;
import paquete.clases.ListaEnlPasajero;
import paquete.clases.Pasajero;

/**
 *
 * @author Leonardo
 */
public class test {
    
    public static void main(String[] args) {
        
        ListaEnlPasajero<Pasajero> lista = new ListaEnlPasajero<>();
        
        if (lista.mayorEdad() == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
        }
        
        Pasajero pasj1 = new Pasajero("Leo", 522);
        pasj1.generarEdad();
        lista.agregarNuevoPasajero(pasj1);
        
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
        
        System.out.println(lista.mayorEdad().getEdad());
        
        lista.obtenerInfo();
        
    }
    
}
