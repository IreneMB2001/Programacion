package Tarea10_1_ArrayList.Parte1;
/* PruebaGestiónDeAlmacen.java
 * Programa GESTISIMAL que pone a prueba la clase Artículo para la gestión de un almacén
 * Se mostrará un menú con las opciones a elegir sobre el almacen (baja, alta, modificación, entrada, salida, etc)
 * Este ejercicio ha sido modificado para utilizar ArrayList en vez de Arrays.
 * También se introduce el manejo de la excepciones para comprobar si los datos introducidos son erróneos.
 * @Author Irene Martín
 */
import java.util.Scanner;

import Tarea10_1_ArrayList.Biblioteca_Funciones.*;

import java.util.ArrayList;
public class PruebaGestiónDeAlmacen {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    ArrayList<Artículo> artículo = new ArrayList<Artículo>();
    
    //Creamos los primeros artículos con la función add//
    artículo.add(0, new Artículo(1111, "estantería de pared doble, color negro", 45, 59.99, 10));
    artículo.add(1, new Artículo(2222, "escritorio de caoba", 75, 89.99, 8));
    artículo.add(2, new Artículo(3333, "centro de mesa con velas aromáticas", 15, 29.50, 18));
    artículo.add(3, new Artículo(4444, "planta bonsai decorativa", 25, 39.50, 13));
    artículo.add(4, new Artículo(5555, "jarrón decorativo con motivos griegos", 60, 79.99, 5));

    //Variables//
    int respuesta=0;

    //Menu de opciones del almacén//
    while (respuesta!=7) {
      System.out.println("\nGESTISIMAL ALMACÉN");
      System.out.println("-------------------");
      System.out.println("Elige una de las siguientes opciones (1-7)");
      System.out.println("----------------------------------------------");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Salida de mercancia");
      System.out.println("6. Entrada de mercancia");
      System.out.println("7. Salir");
      System.out.println("----------------------------------------------");
      System.out.print("Respuesta --> ");
      respuesta=FuncionesArrays.comprobarExcepcionesInt(s);

      switch(respuesta){
        //---------------------------Listado de los productos del almacén//
        case 1:
          System.out.println("\n LISTADO DE PRODUCTOS");
          System.out.println("\033[94m-------------------------------------------------------------------------------------------------------");
          System.out.printf("| %-7s | %-45s | %-11s | %-11s | %-13s |\n", "Código", "Descripción", "PC", "PV", "Stock");
          System.out.println("-------------------------------------------------------------------------------------------------------\033[39;49m");
          for(Artículo lista: artículo) {
            System.out.println(lista);
            System.out.println("-------------------------------------------------------------------------------------------------------");
          }
          break;
        //-----------------------------Alta de un nuevo artículo//
        case 2:
          System.out.println("\nSe va a proceder al registro de un nuevo articulo. Introduzca los siguientes datos por favor:");
          System.out.print("Codigo del articulo --> ");
          int código=FuncionesArrays.comprobarExcepcionesInt(s);

          System.out.print("Descripcion del articulo --> ");
          String descripcion=System.console().readLine();

          System.out.print("Precio de compra del articulo --> ");
          double PC=FuncionesArrays.comprobarExcepcionesDouble(s);

          System.out.print("Precio de venta del articulo --> ");
          double PV=FuncionesArrays.comprobarExcepcionesDouble(s);

          System.out.print("Stock del articulo --> ");
          int stock=FuncionesArrays.comprobarExcepcionesInt(s);

          //Creación del nuevo artículo//
          artículo.add(new Artículo(código, descripcion, PC, PV, stock));
          break;
        //-----------------------------Baja de uno de los artículos del almacén//
        case 3:
          System.out.println("\nSe va a proceder a la baja de un articulo. Introduzca el código del articulo que desea eliminar:");
          System.out.print("Codigo del articulo --> ");
          int códigoBaja=FuncionesArrays.comprobarExcepcionesInt(s);
          int posición = FuncionesArrays.devolverPosición(artículo, códigoBaja);
          if (posición!=-1) {
            artículo.remove(posición);
          } else {
            System.out.println("El artículo introducido no existe");
          }  
          break;
        //-----------------------------Modificación de alguno de los datos de un artículo//
        case 4:
          FuncionesArrays.opcionesModificarArtículo(artículo);
          break;
        //-----------------------------Salida de mercancía del almacén//
        case 5:
          System.out.print("\nSe va a proceder la salida de mercancia. Introduzca el codigo del articulo del que se desea sacar unidades: ");
          int salidaArticulo=FuncionesArrays.comprobarExcepcionesInt(s);
          System.out.print("Cuantas unidades quiere sacar del almacen? --> ");
          int numMercancia=FuncionesArrays.comprobarExcepcionesInt(s);
          int posición1 = FuncionesArrays.devolverPosición(artículo, salidaArticulo);
          if (posición1!=-1) {
            artículo.get(posición1).salidaUnidades(numMercancia);
          } else {
            System.out.println("El artículo introducido no existe");
          }  
          break;
        //-----------------------------Entrada de mercancía al almacén//
        case 6:
          System.out.print("\nSe va a proceder la entrada de mercancia. Introduzca el codigo del articulo del que se desea aniadir unidades: ");
          int entradaArticulo=FuncionesArrays.comprobarExcepcionesInt(s);
          System.out.print("Cuantas unidades quiere añadir al almacen? --> ");
          int numMercanciaEntrada=FuncionesArrays.comprobarExcepcionesInt(s);
          int posición2 = FuncionesArrays.devolverPosición(artículo, entradaArticulo);
          if (posición2!=-1) {
            artículo.get(posición2).entradaUnidades(numMercanciaEntrada);
          } else {
            System.out.println("El artículo introducido no existe");
          }  
        break;
      }
    }
  }
}
