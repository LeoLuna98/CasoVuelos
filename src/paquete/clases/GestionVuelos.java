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
    
    public void agregarVuelo(Vuelo vuelo) {
        if (cantidadVuelos < 100) {
            int pos = busquedaS(vuelo.getNumVuelo());
            if (pos == -1) {
                int bandera = 0;
                int count = 0;
                while (bandera == 0 && count < cantidadVuelos) {
                    if (vuelo.getNumVuelo() < arreglo[count].getNumVuelo()) {
                        for (int i = cantidadVuelos; i > count; i--) {
                            arreglo[i] = arreglo[i - 1];
                        }
                        arreglo[count] = vuelo;
                        bandera = 1;
                    } else {
                        count++;
                    }
                }
                if (bandera == 0) {
                    arreglo[cantidadVuelos] = vuelo;
                }
                cantidadVuelos += 1;
            } else {
                JOptionPane.showMessageDialog(null, "El vuelo ya existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay espacio disponible para más vuelos");
        }
    }
    
    public int busquedaS(int numero) {
        int pos = -1;
        int i = 0;
        while (i<cantidadVuelos && pos == -1) {
            if (arreglo[i].getNumVuelo()==numero) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
    
    public void verInfo() {
        for (int i = 0; i < cantidadVuelos; i++) {
            System.out.println(arreglo[i].getNumVuelo());
        }
    }
    
    
}
