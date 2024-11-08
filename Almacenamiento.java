import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Almacenamiento<T> {
    private List<T> lista;
    private T obj;


    public Almacenamiento(){
        this.lista = new ArrayList<>();
        this.obj = null;

    }

    public Almacenamiento(T obj){
        this.lista = new ArrayList<>();
        this.obj = obj;
    }


    public void agregarObjeto(T e){
        lista.add(e);
    }


    public void eliminarObjeto(T e){
        if (lista.isEmpty()){
            System.out.println("la lista esta vacia");
        }else if (!lista.remove(e)) {
            System.out.println("El objeto no se encuentra en la lista.");
        } else {
            System.out.println("Objeto eliminado exitosamente.");
        }
    }


    public void mostrarAlmacenamiento(){
        Iterator iterator = lista.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public int buscarObjeto(T e) {
        int index = lista.indexOf(e);

        if (index != -1){
            System.out.println("el objeto no existe dentro del almacenamiento");
        }else {
            System.out.println("el objeto existe en el almacenamiento");
        }
        return index; // Retorna el índice, o -1 si no se encuentra
    }







}