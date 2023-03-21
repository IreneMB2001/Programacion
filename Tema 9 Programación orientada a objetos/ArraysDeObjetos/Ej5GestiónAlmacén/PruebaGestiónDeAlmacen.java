package ArraysDeObjetos.Ej5GestiónAlmacén;
/* PruebaGestiónDeAlmacen.java
 * Programa GESTISIMAL que pone a prueba la clase Artículo para la gestión de un almacén
 * Se mostrará un menú con las opciones a elegir sobre el almacen (baja, alta, modificación, entrada, salida, etc)
 * @Author Irene
 */
import java.util.Scanner;

import ArraysDeObjetos.Ej5GestiónAlmacén.Biblioteca_Funciones.FuncionesArrays;
public class PruebaGestiónDeAlmacen {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    Artículo[] artículo = new Artículo[100];

    //ponemos todos los artículos del array a 0, lo que significa que no se ha registrado ningún artículo
    for(int i=0; i<=99; i++){
      artículo[i]= new Artículo(0, "", 0.00, 0.00, 0);
    }

    //Creamos los primeros artículos//
    artículo[0]= new Artículo(1111, "estantería de pared doble, color negro", 45, 59.99, 10);
    artículo[1]= new Artículo(2222, "escritorio de caoba", 75, 89.99, 8);
    artículo[2]= new Artículo(3333, "centro de mesa con velas aromáticas", 15, 29.50, 18);
    artículo[3]= new Artículo(4444, "planta bonsai decorativa", 25, 39.50, 13);
    artículo[4]= new Artículo(5555, "jarrón decorativo con motivos griegos", 60, 79.99, 5);

    //Variables//
    int respuesta=0;
    int datoModificar;

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
      respuesta=s.nextInt();

      switch(respuesta){
        //---------------------------Listado de los productos del almacén//
        case 1:
          for(int i=0; i<=99; i++){
            if(artículo[i].getCodArticulo()!=0){ //solo se mostrarán los artículos que no estén a 0//
              System.out.println(artículo[i]);
            } 
          }
          break;
        //-----------------------------Alta de un nuevo artículo//
        case 2:
          System.out.println("Se va a proceder al registro de un nuevo articulo. Introduzca los siguientes datos por favor:");
          System.out.print("Codigo del articulo --> ");
          int código=s.nextInt();
          System.out.print("Descripcion del articulo --> ");
          String descripcion=System.console().readLine();
          System.out.print("Precio de compra del articulo --> ");
          int PC=s.nextInt();
          System.out.print("Precio de venta del articulo --> ");
          int PV=s.nextInt();
          System.out.print("Stock del articulo --> ");
          int stock=s.nextInt();

          //Buscamos la primera posición del Array que tenga el código 0, la cual sería la primera posición disponible//
          int posición= FuncionesArrays.primeraPosicionCodigo(artículo); 
          if(posición<0){
            System.out.println("Lo siento, no queda espacio disponible en el almacen");
          }

          //Creación del nuevo artículo//
          artículo[posición] = new Artículo(código, descripcion, PC, PV, stock);
          break;
        //-----------------------------Baja de uno de los artículos del almacén//
        case 3:
          System.out.println("Se va a proceder a la baja de un articulo. Introduzca el código del articulo que desea eliminar:");
          System.out.print("Codigo del articulo --> ");
          int códigoBaja=s.nextInt();

          for(int i=0; i<=99; i++){
            if(artículo[i].getCodArticulo()==códigoBaja){
              artículo[i].bajaArtículo();
            } 
          }
          break;
        //-----------------------------Modificación de alguno de los datos de un artículo//
        case 4:
          System.out.print("Se va a proceder a modificar uno de los articulos. Introduzca el codigo del articulo que desea modificar:");
          int articuloModificar=s.nextInt();
          System.out.println("Ahora indica que dato quiere modificar de los siguientes (1-4)");
          System.out.println("------------------------------------------");
          System.out.println("1. Codigo del articulo");
          System.out.println("2. Descripcion del artículo");
          System.out.println("3. Precio de compra del articulo");
          System.out.println("4. Precio de venta del articulo");
          System.out.println("------------------------------------------");
          System.out.print("eleccion --> ");
          datoModificar=s.nextInt();

          for(int i=0; i<=99; i++){
            if(artículo[i].getCodArticulo()==articuloModificar){
              //Switch con los diferentes datos a modificar del artículo//
              switch(datoModificar){
                case 1:
                  System.out.print("Introduce el nuevo dato --> ");
                  int nuevoCodigo=s.nextInt();
                  artículo[i].modificarCódigo(nuevoCodigo);
                  break;
                case 2:
                  System.out.print("Introduce el nuevo dato --> ");
                  String nuevaDescripción=System.console().readLine();
                  artículo[i].modificarDescripción(nuevaDescripción);
                  break;
                case 3:
                  System.out.print("Introduce el nuevo dato --> ");
                  double nuevoPC=s.nextDouble();
                  artículo[i].modificarPrecioCompra(nuevoPC);
                  break;
                case 4:
                  System.out.print("Introduce el nuevo dato --> ");
                  double nuevoPV=s.nextDouble();
                  artículo[i].modificarPrecioVenta(nuevoPV);
                  break;
                default:
              }
            } 
          }
          break;
        //-----------------------------Salida de mercancía del almacén//
        case 5:
          System.out.print("Se va a proceder la salida de mercancia. Introduzca el codigo del articulo del que se desea sacar unidades: ");
          int salidaArticulo=s.nextInt();
          System.out.print("Cuantas unidades quiere sacar del almacen? --> ");
          int numMercancia=s.nextInt();
          for(int i=0; i<=99; i++){
            if(artículo[i].getCodArticulo()==salidaArticulo){
              artículo[i].salidaUnidades(numMercancia);
            }
          }
          break;
        //-----------------------------Salida de mercancía del almacén//
        case 6:
          System.out.print("Se va a proceder la entrada de mercancia. Introduzca el codigo del articulo del que se desea aniadir unidades: ");
          int entradaArticulo=s.nextInt();
          System.out.print("Cuantas unidades quiere aniadir al almacen? --> ");
          int numMercanciaEntrada=s.nextInt();
          for(int i=0; i<=99; i++){
            if(artículo[i].getCodArticulo()==entradaArticulo){
              artículo[i].entradaUnidades(numMercanciaEntrada);
            }
          }
        break;
      }
    }
  }
}
