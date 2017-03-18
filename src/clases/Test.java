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
public class Test {
    public static void main(String[] args) {
      Helper l = new Helper();
        System.out.println("Esta la lista vacia ? " + l.estaVacio());
        l.adicionarPrincipio(5);
        System.out.println("Tamaño de la lista: " + l.obtenerTamano());
        l.adicionarPrincipio("cinco");
        l.adicionarPrincipio("diez");
        l.adicionarPrincipio("tres");
        System.out.println("Tamaño de la lista: " + l.obtenerTamano());
        System.out.println("Esta la lista vacia ? " + l.estaVacio());
        
        System.out.println(l.mostrarContenido());
        System.out.println(l.devolverValor(2));
       
    }
   
}
