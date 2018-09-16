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
 * @param <E>
 */
public class ListaEnlPasajero <E extends Pasajero> {
    private Nodo<E> L;
    
    public ListaEnlPasajero() {
        this.L=null;
    }
    
    public Nodo<E> getL() {
        return L;
    }
    
    // -MARK: Reglas de negocio:
    
    public void agregarNuevoPasajero(E pasajero) {
        Nodo<E> nuevo=new Nodo<>();
        nuevo.setInfo(pasajero);
        nuevo.setSiguiente(null);
        
        if (L==null) {
            nuevo.setSiguiente(null);
            L = nuevo;  
        } else {
            Nodo<E> ptr = L;
            if (pasajero.getDni() < ptr.getInfo().getDni()) {
                insertarAlInicio(pasajero);
            } else {
                Nodo<E> aux = null;
                int bandera = 0;
                while (bandera == 0 && ptr.getSiguiente() != null) {
                    aux = ptr.getSiguiente();
                    if (pasajero.getDni() < aux.getInfo().getDni()) {
                        ptr.setSiguiente(nuevo);
                        nuevo.setSiguiente(aux);
                        bandera = 1;
                    } else {
                        ptr = ptr.getSiguiente();
                    }
                }
                if (bandera == 0) {
                    insertarAlFinal(pasajero);
                }
            }
        }
    }
    
    public void insertarAlInicio(E item){
        Nodo<E> nuevo=new Nodo<E>();
        nuevo.setInfo(item);
        
        if(L==null){
            nuevo.setSiguiente(null);
        }else{
            nuevo.setSiguiente(L);
        }
        L=nuevo;        
    }
    
    public void insertarAlFinal(E item){
        Nodo<E> nuevo=new Nodo<>();
        nuevo.setInfo(item);
        nuevo.setSiguiente(null);
        
        if(L==null){
            L=nuevo;
        }else{
            Nodo<E> ptr=L;
            while(ptr.getSiguiente()!=null){
                ptr=ptr.getSiguiente();
            }
            ptr.setSiguiente(nuevo);
        }        
    }
    
    public void obtenerInfo(){
        Nodo<E> ptr=L;
        
        while(ptr!=null){
            System.out.print(ptr.getInfo()+"--> ");
            ptr=ptr.getSiguiente();
        }
        System.out.print("nulo");
    }
    
    public int busquedaDNI(long dni) {
        Nodo<E> ptr=L;
        int bandera = 0;
        
        while(ptr != null && bandera == 0) {
            if (ptr.getInfo().getDni() == dni) {
                bandera = 1;
                JOptionPane.showMessageDialog(null, "DNI ya agregado, ingrese otro DNI");
            } else {
            ptr=ptr.getSiguiente();
            }
        }
        return bandera;
    }
    
    public Pasajero mayorEdad() {
        if (L != null) {
            Nodo<E> ptr = L;
            Pasajero pasajeroMayor = ptr.getInfo();
            int mayorEdad = ptr.getInfo().getEdad();
            ptr = ptr.getSiguiente();

            while (ptr != null) {
                if (ptr.getInfo().getEdad() > mayorEdad) {
                    pasajeroMayor = ptr.getInfo();
                    mayorEdad = ptr.getInfo().getEdad();
                }
                ptr = ptr.getSiguiente();
            }

            return pasajeroMayor;
        } else {
            return null; //si la lista está vacía
        }
    }
    
    public void eliminarDeLista(long dni) {
        
    }
}
