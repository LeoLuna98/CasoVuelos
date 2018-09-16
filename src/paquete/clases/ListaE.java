/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Leonardo
 * @param <E>
 */
public class ListaE <E extends Pasajero> {
    private Nodo<E> L;
    
    public ListaE() {
        this.L=null;
    }
    
    public Nodo<E> getL() {
        return L;
    }
    
    // -MARK: Reglas de negocio:
    
    public void insertarAlInicio(E item){
        Nodo<E> nuevo=new Nodo<>();
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
    public void recorrido(){
        Nodo<E> ptr=L;
        
        while(ptr!=null){
            System.out.print(ptr.getInfo()+"--> ");
            ptr=ptr.getSiguiente();
        }
        System.out.print("nulo");
    }
}
