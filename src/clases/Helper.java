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
    Estudiantes head;
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
            System.out.println(aux.getValor());
            aux = aux.getSiguiente();
        }

    }
     public void verValorUltimo() {
        Object aux;
        aux = cabeza.getValor();

         System.out.println("El ultimo es:"+aux);
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
        System.out.println("El mayor es: " + mayor);
    }

    public void mostrarMenor() {
        int menor;
        menor = devolverValor(0);
        for (int i = 0; i < size; i++) {
            if (menor < devolverValor(i)) {
                menor = menor;
            } else {
                menor = devolverValor(i);
            }

        }
        System.out.println("El menor es: " + menor);
    }

    public void contadorPares() {
        int pares = 0;

        for (int i = 0; i < size; i++) {
            int numero = devolverValor(i);
            if (numero % 2 == 0) {
                pares++;
            }

        }
        System.out.println("La cantidad de numeros pares es: " + pares);
    }

    public void mostrarSuma() {
        int acum = 0;

        for (int i = 0; i < size; i++) {
            int numero = devolverValor(i);
            acum = acum + numero;
        }
        System.out.println("El valor de la suma es de " + acum);
    }

    public void mostrarProm() {
        int acum = 0;
        int res;

        for (int i = 0; i < size; i++) {
            int numero = devolverValor(i);
            acum = acum + numero;
        }
        res = acum / size;
        System.out.println("El valor del promedio es de " + res);
    }

    public void adicionarPrincipioF() {
        int factorial=1 ;
        for (int i = 0; i < size; i++) {
            int numero = devolverValor(i);
              
            for(factorial=numero;numero>1;numero--){
                factorial*=(numero-1);
               
            }
              System.out.println("Facotorial "+factorial); 
            

        }
    }
     public Object adicionarPrincipioEstudiantes(Object nombre, Object edad, Object sexo) {
        Estudiantes e = new Estudiantes (nombre,edad,sexo);
            return (e);
        
    }
      public void mostrarEstudiantes() {

        Nodo aux = cabeza;
        Estudiantes e;

        while (aux != null) {
            e = (Estudiantes) aux.getValor();
            System.out.println(" "+e.getNombre()+" "+e.getEdad()+" "+e.getSexo());
            aux = aux.getSiguiente();
        }

    }
    public void eliminarPrimero() {
        cabeza = cabeza.getSiguiente();
    }
    public void eliminarUltimo(){
        Nodo aux=cabeza;
         while(aux.getSiguiente().getSiguiente() != null){
                aux=aux.getSiguiente();
            }
          aux.setSiguiente(null);
             
            
          
        }
    public void eliminarDado(int pos){
         Nodo aux1;
        Nodo aux = cabeza;
        for (int i = 0; i < pos-1; i++) {

            aux = aux.getSiguiente();
            
           
        }
       aux.setSiguiente(null);
      aux1= aux.getSiguiente();
      aux.setSiguiente(aux1.getSiguiente());
    } public void cortarLista( int pos){
        Nodo aux1;
        Nodo aux = cabeza;
        for (int i = 0; i < pos-1; i++) {

            aux = aux.getSiguiente();
   
        }
       aux.setSiguiente(null);
      
    }
 
    }


        

    

