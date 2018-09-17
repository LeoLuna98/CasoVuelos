/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class Pasajero {
    private String nombre;
    private long dni;
    private int edad;

    public Pasajero(String nombre, long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void generarEdad() {
        Random rand = new Random();
        this.edad = rand.nextInt(80-10+1)+10;
    }
    
    public String toString() {
        return "\n-Nombre del pasajero: " + this.nombre +
                "\n-DNI del pasajero: " + this.dni +
                "\n-Edad del pasajero: " + this.edad;
    }    
}
