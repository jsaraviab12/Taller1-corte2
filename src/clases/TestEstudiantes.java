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
public class TestEstudiantes {
    public static void main(String[] args) {
         Helper l = new Helper();
      Scanner lea = new Scanner(System.in); 
 String nombre;
 int edad;
 String sexo;
 String res;
  boolean agregar=true;
        while(agregar!=false){
            System.out.println("Digite el nombre del estudiante");
            nombre=lea.next();
            System.out.println("Digite la edad del estudiante");
            edad=lea.nextInt();
            System.out.println("Digite el Sexo del estudiante");
            sexo=lea.next();
            l.adicionarPrincipioEstudiantes(nombre, edad, sexo);
       
      
        System.out.println("Desea agregar otro Estudiante");
      res=lea.next();
        if (res.equalsIgnoreCase("Si")){
        agregar=true;   
       }else {
                agregar= false;
                }
           
        }
        l.mostrarEstudiantes();
    }
    
}
