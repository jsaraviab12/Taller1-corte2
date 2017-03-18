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
public class Nodo {
    private Object valor;
    private Nodo siguiente;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    public void enlazarSiguiente(Nodo n)
    {
        siguiente = n;
    }

    public Object getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    
}
