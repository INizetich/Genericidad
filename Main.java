
import com.sun.security.jgss.GSSUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        ///INSTANCIA DE CLASE PERSONA
        Persona persona = new Persona("Ignacio","Nizetich","45462201",20);
        Persona persona2 = new Persona("Arian","Shaffer","46491403",20);
        Persona persona3 = new Persona("tucu","figueroa","44102945",21);
        Persona persona4 = new Persona("franco","nizetich","42841345",21);

        ///INSTANCIA DE LA CLASE GENERICA ALMACENAMIENTO
        Almacenamiento<Persona> almacenamiento = new Almacenamiento<>();
        ///INSTANCIA DE LA CLASE GENERICA PILA
        Pila pila = new Pila();
        ///INSTANCIA DE LA CLASE GENERICA OPERACION MATEMATICA
        OperacionMatematica operacion = new OperacionMatematica();
        ///INSTANCIA DE LA CLASE GENERICA CONJUNTO
        Conjunto conjunto = new Conjunto();
        ///INSTANCIA DE LA CLASE GENERICA LISTA ORDENADA
        ListaOrdenada<Persona> listaOrdenada = new ListaOrdenada();

        System.out.println("------------INGRESE UNA OPCION------------");
        System.out.println("1.CLASE GENERICA ALMACENAMIENTO");
        System.out.println("2.CLASE GENERICA PILA");
        System.out.println("3.CLASE GENERICA OPERACION MATEMATICA");
        System.out.println("4.CLASE GENERICA CONJUNTO");
        System.out.println();
           opc = scanner.nextInt();
           scanner.nextLine();

        switch (opc){
            case 1:
                almacenamiento.agregarObjeto(persona);
                almacenamiento.agregarObjeto(persona2);
                almacenamiento.mostrarAlmacenamiento();

                int indice = almacenamiento.buscarObjeto(persona);

                if (indice != -1){
                    System.out.println("el objeto se encuentra en la poscision: "+indice);
                }else {
                    System.out.println("el objeto no existe dentro de la lista");
                }

                break;

            case 2:

                pila.apilar("\nHOLA, ESTE ES MI PRIMER ELEMENTO EN LA PILA");
                pila.apilar(2);
                pila.apilar(4.0);
                pila.apilar(persona);
                pila.mostrarPila();
                System.out.println("ELIMINO EL ULTIMO ELEMENTO INGRESADO DE LA PILA");
                pila.desapilar();


                System.out.println("\nASI QUEDA LA PILA CON EL ULTIMO ELEMENTO BORRADO");
                pila.mostrarPila();

                boolean verificacion = pila.verificarPila();

                if(verificacion){
                    System.out.println("la pila no se encuentra vacia");
                }else {
                    System.out.println("la pila se encuentra vacia");
                }

                int cantidad = pila.contarElementos();

                System.out.println("La cantidad de elementos cargados en la pila son: "+cantidad);
                break;


            case 3:
                System.out.println("ingrese un numero");
                int numero = scanner.nextInt();
                scanner.nextLine();
                System.out.println("ingrese otro numero");
                int numero2 = scanner.nextInt();
                scanner.nextLine();
                ///SETEO LOS NUMEROS PARA LAS CUENTAS
                operacion.setNumeros(numero,numero2);

                ///SUMA
                System.out.println("La suma es: "+operacion.suma());

                ///RESTA
                System.out.println("La resta es: "+operacion.resta());

                ///MULTIPLICACION
                System.out.println("La multiplicacion es: "+operacion.multiplicacion());

                ///DIVISION
                System.out.println("La division es: "+operacion.division());



                break;


            case 4:
                ///AGREGO OBJETOS AL CONJUNTO

                conjunto.agregarObjeto(persona);
                conjunto.agregarObjeto(persona2);

                System.out.println("RECORRO EL CONJUNTO CARGADO");
                ///RECORRO EL CONJUNTO
                conjunto.recorrerConjunto();

                System.out.println("BUSCO Y VERIFICO SI EXISTE EL OBJETO, SI EXISTE LO ELIMINA");
                ///ELIMINAR UN OBJETO DEL CONJUNTO
                conjunto.eliminarObjeto(persona2);

                conjunto.recorrerConjunto();

                ///VERIFICO SI EL OBJETO EXISTE DENTRO DEL CONJUNTO
                if(conjunto.existeObjeto(persona2)){
                    System.out.println("el objeto existe en el conjunto.");
                }else {
                    System.out.println("el objeto no existe en el conjunto.");
                }




                break;


            case 5:
                ///AGREGO OBJETOS A LA LISTA ORDENADA
                listaOrdenada.agregarElemento(persona);
                listaOrdenada.agregarElemento(persona2);
                listaOrdenada.agregarElemento(persona3);
                listaOrdenada.agregarElemento(persona4);

                ///RECORRO LA LISTA
                System.out.println("LISTA SIN ORDENAR");
                listaOrdenada.recorrerLista();

                ///ORDENAR LA LISTA DE MANERA ASCENDENTE
                System.out.println("LISTA ORDENADA DE MANERA ASCENDENTE.");
              listaOrdenada.ordenarListaAscendente();
              listaOrdenada.recorrerLista();

              ///ORDENAR LISTA DE MANERA DESCENDENTE
                System.out.println("LISTA ORDENADA DE MANERA DESCENDENTE.");
                listaOrdenada.ordenarListaDescendente();
                listaOrdenada.recorrerLista();

                ///OBTENER LA POSICION DE UN OBJETO EN ESPECIFICO
                System.out.println("ingrese la pos especifica a devolver");
                int pos = scanner.nextInt();
                scanner.nextLine();
                Persona personita = listaOrdenada.obtenerElementoPos(pos);
                System.out.println(personita);

                break;
        }




    }
}