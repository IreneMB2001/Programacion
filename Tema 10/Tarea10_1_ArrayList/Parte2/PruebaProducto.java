package Tarea10_1_ArrayList.Parte2;
/* PruebaProducto.java
 * Programa que prueba como funcionan varios objetos de la clase Producto implementados en un ArrayList
 * @ Author Irene Martín
 */
import java.util.Scanner;
import java.util.ArrayList;

public class PruebaProducto {
  public static void main (String [] args){
    Scanner s= new Scanner(System.in);
    //Crear 5 instancias de la clase producto//
    Producto producto1 = new Producto("chanclas", 12);
    Producto producto2 = new Producto("plantita", 5);
    Producto producto3 = new Producto("zapatillas", 10);
    Producto producto4 = new Producto("mesa", 20);
    Producto producto5 = new Producto("Portátil pro", 15);

    //Crear una ArrayList de clase producto//
    ArrayList<Producto> productos=new ArrayList<Producto>();

    //Añadir los productos anteriores a la ArrayList//
    productos.add(0, producto1);
    productos.add(1, producto2);
    productos.add(2, producto3);
    productos.add(3, producto4);
    productos.add(4, producto5);

    //Visualiza el contenido del ArrayList con un foreach//
    System.out.println("\nContenido del ArrayList");
    System.out.println("---------------------------------");
    for(Producto listado: productos) {
      System.out.println("- "+listado);
    }
    System.out.println("---------------------------------");

    //Eliminar 2 elementos del ArrayList//
    productos.remove(3);
    productos.remove(0);
    System.out.println("\nSe han eliminado 2 elementos del ArrayList");

    //Insertar un nuevo producto en la ArrayList//
    productos.add(2, new Producto("cama confy", 25));
    System.out.println("\nSe ha insertado 1 nuevo elemento al ArrayList");

    //Visualizar de nuevo el contenido del ArrayList después de los cambios//
    System.out.println("\nArrayList modificado");
    System.out.println("---------------------------------");
    for(Producto listado: productos) {
        System.out.println("- "+listado);
      }
      System.out.println("---------------------------------");

    //Borrar todos los valores//
    productos.removeAll(productos);
    System.out.println("\nAhora se ha eliminado todo el contenido del ArrayList");

    System.out.println("\nContenido del ArrayList");
    System.out.println("---------------------------------");
    if (productos.isEmpty()) { //El ArrayList está vacío
      System.out.println(" El ArrayList no tiene contenido");
    }
    System.out.println("---------------------------------");

    
  }
}
