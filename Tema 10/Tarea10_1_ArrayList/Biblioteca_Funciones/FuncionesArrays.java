package Tarea10_1_ArrayList.Biblioteca_Funciones;
import java.util.ArrayList;
import java.util.Scanner;
import Tarea10_1_ArrayList.*;
import Tarea10_1_ArrayList.Parte1.Artículo;
public class FuncionesArrays {
  public static int primeraPosicionCodigo(Artículo [] array){
    /* Según el array introducido la función devuelve la primera posición cuyo código se encuentre a 0.
     * @ param array del que se quiere averiguar la posción
     * @ return int i, el valor de la primera posición con código 0.
     */
    for (int i=0; i<=99; i++){
      if (array[i].getCodArticulo()==0){
        return i;
      }
    }
    return -1;
  }
  public static int devolverPosición(ArrayList<Artículo>artículo, int código) {
    /* Devuelve la posición de uno de los artículos de la ArrayList según un código determinado.
     * @ param ArrayList de tipo artículo para recorrer
     * @ return int num, número al que corresponde la posición encontrada.
     */
    int num = -1; //valor por defecto, en caso de que el código no exista
    for (int i=0; i<artículo.size(); i++) {
      if (artículo.get(i).getCodArticulo()==código){
        num=i;
      }
    }
    return num;
  }
  public static void opcionesModificarArtículo(ArrayList<Artículo>artículo){
    /* Función que implementa un menú con las diferentes opciones para modificar un artículo determinado
     * Este trozo de código se ha introducido en una función para acortar el código del main
     * @ param ArrayList de tipo artículo (clase que se implementa en el programa principal)
     */
    Scanner s= new Scanner (System.in);
    int datoModificar;
      System.out.print("\nSe va a proceder a modificar uno de los articulos. Introduzca el codigo del articulo que desea modificar:");
      int articuloModificar=FuncionesArrays.comprobarExcepcionesInt(s);
      int posiciónArtículo = FuncionesArrays.devolverPosición(artículo, articuloModificar);
      if (posiciónArtículo!=-1) {
        System.out.println("\nAhora indica que dato quiere modificar de los siguientes (1-4)");
        System.out.println("------------------------------------------");
        System.out.println("1. Codigo del articulo");
        System.out.println("2. Descripcion del artículo");
        System.out.println("3. Precio de compra del articulo");
        System.out.println("4. Precio de venta del articulo");
        System.out.println("------------------------------------------");
        System.out.print("eleccion --> ");
        datoModificar=FuncionesArrays.comprobarExcepcionesInt(s);
  
        for(int i=0; i<artículo.size(); i++){
          if(artículo.get(i).getCodArticulo()==articuloModificar){
            //Switch con los diferentes datos a modificar del artículo//
            switch(datoModificar){
              case 1:
                System.out.print("\nIntroduce el nuevo dato --> ");
                int nuevoCodigo=FuncionesArrays.comprobarExcepcionesInt(s);
                artículo.get(i).modificarCódigo(nuevoCodigo);
                System.out.println("El artículo ha sido modificado con éxito");
                break;
              case 2:
                System.out.print("\nIntroduce el nuevo dato --> ");
                String nuevaDescripción=System.console().readLine();
                artículo.get(i).modificarDescripción(nuevaDescripción);
                System.out.println("El artículo ha sido modificado con éxito");
                break;
              case 3:
                System.out.print("\nIntroduce el nuevo dato --> ");
                double nuevoPC=FuncionesArrays.comprobarExcepcionesDouble(s);
                artículo.get(i).modificarPrecioCompra(nuevoPC);
                System.out.println("El artículo ha sido modificado con éxito");
                break;
              case 4:
                System.out.print("\nIntroduce el nuevo dato --> ");
                double nuevoPV=FuncionesArrays.comprobarExcepcionesDouble(s);
                artículo.get(i).modificarPrecioVenta(nuevoPV);
                System.out.println("El artículo ha sido modificado con éxito");
                break;
              default:
                System.out.println("La opción seleccionada no es válida");
                break;
            }
          } 
        }
      } else {
        System.out.println("El artículo introducido no existe");
      }  
  }
  public static int comprobarExcepcionesInt(Scanner s){
    /* Función que comprueba que un dato introducido es de tipo entero
     * En el caso de que el dato no sea de ese formato se lanzará un mensaje de error 
     * Se le pedirá al usuario en bucle que introduzca otro valor hasta que el formato sea el correcto
     * @ param Scanner para introducir el dato que se quiere comprobar por teclado
     * @ return int, devuelve el dato correcto
     */
    int datoInt=0;
    boolean sinExcepción=false;
    do {
      try {
        datoInt=Integer.parseInt(s.next());
        sinExcepción=true;
      } catch (Exception e) {
        System.out.println("El valor introducido no es válido. Debes de introducir un valor de tipo integer");
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
        System.out.print("Vuelve a introducir el dato --> ");
      }
    } while(!sinExcepción);
    return datoInt;
  }
  public static double comprobarExcepcionesDouble(Scanner s){
    /* Función que comprueba que un dato introducido es de tipo double
     * En el caso de que el dato no sea de ese formato se lanzará un mensaje de error 
     * Se le pedirá al usuario en bucle que introduzca otro valor hasta que el formato sea el correcto
     * @ param Scanner para introducir el dato que se quiere comprobar por teclado
     * @ return double, devuelve el dato correcto
     */
    double datoDouble=0;
    boolean sinExcepción=false;
    do {
      try {
        datoDouble=Double.parseDouble(s.next());
        sinExcepción=true;
      } catch (Exception e) {
        System.out.println("El valor introducido no es válido. Debes de introducir un valor de tipo decimal");
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
        System.out.print("Vuelve a introducir el dato --> ");
      }
    } while(!sinExcepción);
    return datoDouble;
  }
}
