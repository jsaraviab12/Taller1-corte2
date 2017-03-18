/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Helper {
    Nodo cabeza;
    int size;
    public Helper(){
    cabeza = null;
    size=0;
    }
   
    
 public void adicionarPrincipio(Object valor) {
        if (cabeza == null) {
            Nodo nuevo = new Nodo(valor);
            cabeza = nuevo;
        } else {
            Nodo nuevo = new Nodo(valor);
            nuevo.enlazarSiguiente(cabeza);
            cabeza = nuevo;
        }
        size++;
    }

    public boolean estaVacio() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    public int obtenerTamano() {
        return this.size;
    }

    public String mostrarContenido(){
         Nodo  aux=cabeza;
         String contenido="";
        while(aux!=null){
            contenido+=aux.getValor()+"\n"; 
            aux=aux.getSiguiente();
            
        }
        return contenido;
         
    }
   public Object devolverValor(int pos){
    int contador=0;
    Nodo aux = cabeza;
    while(contador<pos){
        aux=aux.getSiguiente();
        contador++;
    }
    return aux.getValor();
   }
    }
    

