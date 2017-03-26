/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Test {
    public static void main(String[] args) {
      Helper l = new Helper();
      Scanner lea = new Scanner(System.in); 
       int numero;
       int eliminar;
       String res;
       String eli;
        boolean agregar=true;
        while(agregar!=false){
            
       
      numero= (int) (Math.random() * 10+ 1);
            System.out.println(""+numero);
       l.adicionarPrincipio(numero);
      
        System.out.println("Desea agregar otro numero");
      res=lea.next();
        if (res.equalsIgnoreCase("Si")){
        agregar=true;   
       }else {
                agregar= false;
                }
           
        }
     
      
      l.mostrarContenido();
      l.mostrarMayor();
      l.mostrarMenor();
      l.contadorPares();
      l.mostrarSuma();
      l.mostrarProm();
      l.adicionarPrincipioF();        
    }
}
   

