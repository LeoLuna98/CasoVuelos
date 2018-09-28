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
    
    public boolean agregarNuevoPasajero(E pasajero) {
        boolean estado = true;
        int dniFlag = busquedaDNI(pasajero.getDni());
        if (dniFlag == 0) {
            Nodo<E> nuevo = new Nodo<>();
            nuevo.setInfo(pasajero);
            nuevo.setSiguiente(null);

            if (L == null) {
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
        } else {
            estado = false;
        }
        return estado;
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
    
    public String obtenerInfo(){
        Nodo<E> ptr=L;
        String cad = "";
        while(ptr!=null){
            cad = cad + ptr.getInfo() + "\n";
            ptr=ptr.getSiguiente();
        }
        return cad;
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
            JOptionPane.showMessageDialog(null, "Lista vacía");
            return null; //si la lista está vacía
        }
    }
    
    public boolean eliminarDeLista(long dni) {
        boolean estado = true;
        if (L != null) {
            Nodo<E> ptr = L;
            if (ptr.getInfo().getDni() == dni) {
                L = ptr.getSiguiente();
            } else {
                Nodo<E> aux = null;
                int bandera = 0;
                while (bandera == 0 && ptr.getSiguiente() != null) {
                    aux = ptr.getSiguiente();
                    if (aux.getInfo().getDni() == dni) {
                        ptr.setSiguiente(aux.getSiguiente());
                        bandera = 1;
                    } else {
                        ptr = ptr.getSiguiente();
                    }
                }
                if (bandera == 0) {
                    JOptionPane.showMessageDialog(null, "DNI no encontrado, ingrese otro");
                    estado = false;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacía, no se puede eliminar elemento");
            estado = false;
        }
        return estado;
    }
}
