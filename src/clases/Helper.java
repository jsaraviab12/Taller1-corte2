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

    public Helper() {
        cabeza = null;
        size = 0;
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

    public void mostrarContenido() {

        Nodo aux = cabeza;

        while (aux != null) {
            System.out.println(aux.getValor());//mostramos el dato
            aux = aux.getSiguiente();
        }

    }

    public String mostrarContenidoI() {

        Nodo aux = cabeza;
        String contenido = "";
        while (aux != null) {
            contenido += aux.getValor();//mostramos el dato
            aux = aux.getSiguiente();
        }
        return contenido;
    }

    public int devolverValor(int pos) {
        int contador = 0, aux1;
        Nodo aux = cabeza;
        while (contador < pos) {
            aux = aux.getSiguiente();
            contador++;
        }
        aux1 = (int) aux.getValor();
        return aux1;
    }

    public void mostrarMayor() {
        int mayor;
        mayor = devolverValor(0);
        for (int i = 0; i < size; i++) {
            if (mayor > devolverValor(i)) {
                mayor = mayor;
            } else {
                mayor = devolverValor(i);
            }

        }
        System.out.println("El mayor es: "+mayor);
    }
     public void mostrarMenor() {
        int menor;
       menor = devolverValor(0);
        for (int i = 0; i < size; i++) {
            if (menor < devolverValor(i)) {
                menor  = menor ;
            } else {
                menor  = devolverValor(i);
            }

        }
        System.out.println("El mayor es: "+menor );
    }
}


