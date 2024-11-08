import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.Vector;

public class Pila<T> {
    private T elemento;
    private Stack<T> pila;

    public Pila() {
        this.elemento = null;
        this.pila = new Stack<>();
    }

    public Pila(T elemento) {
        this.elemento = elemento;
        this.pila = new Stack<>();
    }


    public void setElemento(T elemento) {
        this.elemento = elemento;
    }


    public void apilar(T elemento) {
        pila.push(elemento);
    }


    public T desapilar(){
        if(pila.isEmpty()){
            System.out.println("LA PILA ESTA VACIA");
            return null;
        }else {
            return pila.pop();
        }


    }

    public void mostrarPila(){
        System.out.println(pila);
    }


    public boolean verificarPila(){

      boolean existe = (!pila.isEmpty() ? true : false);

      return existe;
    }


    public int contarElementos(){
        int contador = 0;
        for (T t : pila){
            contador++;
        }
        return contador;
    }
}
