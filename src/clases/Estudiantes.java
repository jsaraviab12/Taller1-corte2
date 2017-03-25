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
public class Estudiantes {
    private Object nombre;
    private Object edad;
    private Object sexo;
    private Estudiantes siguiente;

   

   
    
    public void enlazarSiguiente(Estudiantes n)
    {
        this.siguiente = n;
    }
    
    public Estudiantes obtenerSiguiente()
    {
        return siguiente;
    }

    public Estudiantes(Object nombre, Object edad, Object sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.siguiente = null;
    }
    
     public Estudiantes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Estudiantes siguiente) {
        this.siguiente = siguiente;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getEdad() {
        return edad;
    }

    public void setEdad(Object edad) {
        this.edad = edad;
    }

    public Object getSexo() {
        return sexo;
    }

    public void setSexo(Object sexo) {
        this.sexo = sexo;
    }
    

 
    
}
