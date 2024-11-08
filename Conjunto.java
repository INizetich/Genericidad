import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class Conjunto <T>{
    private LinkedHashSet<T> elementos;

    public Conjunto(){
        this.elementos = new LinkedHashSet();
    }



    public void agregarObjeto(T obj){
        elementos.add(obj);
    }


    public void eliminarObjeto(T obj){
   if(!elementos.isEmpty()){
       for (T dato :elementos){
           if(dato.equals(obj)){
               elementos.remove(obj);
               System.out.println("ELEMENTO BORRADO CON EXITO.");
               break;
           }
       }
   }

    }


    public void recorrerConjunto(){
        Iterator<T> iterator = elementos.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public boolean existeObjeto(T obj) {
        return elementos.contains(obj); // Devuelve true si el objeto está en la colección
    }

}
