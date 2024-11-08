import java.util.*;

public class ListaOrdenada<T extends Comparable<T>> {
    private List<T> lista;

    public ListaOrdenada() {
        lista = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        lista.add(elemento);
    }

    public void eliminarElemento(T elemento) {
        lista.remove(elemento);
    }

    public void recorrerLista() {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    public T obtenerElementoPos(int pos) {
        if (pos >= 0 && pos < lista.size()) {
            return lista.get(pos);
        } else {
            throw new IndexOutOfBoundsException("Posición fuera de los límites de la lista.");
        }
    }

    public void ordenarListaAscendente() {
        Collections.sort(lista); // Orden ascendente
    }

    public void ordenarListaDescendente() {
        Collections.sort(lista, Collections.reverseOrder()); // Orden descendente
    }
}
