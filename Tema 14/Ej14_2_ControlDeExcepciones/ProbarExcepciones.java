/* ProbarExcepeciones.java
 * Programa que muestra un menú con 5 opciones. Cada una de ellas muestra un tipo de excepción.
 * Para cada excepción se utilizarán 5 funciones específicas que la provoquen.
 * Cuando se produzca el error se mostrará un mensaje por pantalla con el tipo de error y qué la ha provocado.
 * El menú de excepciones continuará apareciendo hasta que no se seleccione la opción de salir.
 * Author @Irene Martin
 */
import java.util.Scanner;
//importaciones para la lectura de un fichero
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ProbarExcepciones {
  //---------------------------------------Funciones necesarias para el funcionamiento del programa//
  public static int divide(int x, int y) throws ArithmeticException {
    return x/y;
  }
  public static int factorial (int num) throws StackOverflowError{
    if (num==0) {
      return 1;
    } else {
      return num * factorial(num + 1); //aquí está el error
    }
  }
  public static int[] crearArray(int t) {
    //Creación del array//
    int[] num=new int[t];

    for (int i=0; i<t; i++) {
      num[i]=(int)(Math.random()*11);
    }
    return num;
  }
  public static void MostrarArray(int x[])throws Exception{ //puede tener más de un error
    Scanner s = new Scanner (System.in);
    System.out.print("\nSeñala la posición del array que quieres mostrar --> ");
    int posición = Integer.parseInt(s.nextLine());
    System.out.println(" num " +posición+ " --> " + x[posición] + "\n");
  }
  public static void leerFichero() throws FileNotFoundException{
    BufferedReader br = new BufferedReader(new FileReader("malaga.txt"));
  }
  //---------------------------------------------------------------------------Main//
  public static void main (String [] args){
    Scanner s = new Scanner (System.in);

    //Declaración de variables//
    int opción=0;
    boolean datoVálido=false; //Dato para que el programa no termine si se produce el error

    //Creación del menú//
    do {
      try {
          System.out.println("Menú de Excepciones");
          System.out.println("----------------------");
          System.out.println("Elige una de las siguientes opciones (1-3) ");
          System.out.println("--------------------------------------------------------------------");
          System.out.println("1. Provoca un error StackOverFlowError");
          System.out.println("2. Provoca una excepción NumberFormatException o ArithmeticException");
          System.out.println("3. Provoca una excepción ArrayIndexOutOfBoundsException");
          System.out.println("4. Provoca una excepción FileNotFoundException");
          System.out.println("5. Salir");
          System.out.println("--------------------------------------------------------------------");
          System.out.print("--> ");
          opción = Integer.parseInt(s.nextLine());

          //Switch de opciones//
          switch(opción){
            case 1:
              System.out.println("\nERROR NumberFormatException Y StackOverFlowError");
              System.out.println("---------------------------------------------------");
              System.out.print("Introduce un número para hacer su factorial --> ");
              int número=Integer.parseInt(s.nextLine());
              System.out.println(factorial(número));
              datoVálido= true;
              break;
            case 2:
              System.out.println("\nERROR NumberFormatException Y ArithmeticException");
              System.out.println("---------------------------------------------------");
              System.out.print("Introduce el dividendo --> ");
              int dividendo=Integer.parseInt(s.nextLine());
              System.out.print("Introduce el dividendo --> ");
              int divisor=Integer.parseInt(s.nextLine());
              System.out.print("El resultado de la división es --> ");
              System.out.println(divide(dividendo, divisor));
              System.out.println();
              datoVálido= true;
              break;
            case 3:
              System.out.println("\nERROR NumberFormatException Y ArrayIndexOutOfBoundsException");
              System.out.println("----------------------------------------------------------------");
              System.out.print("Introduce un tamaño para hacer un array de números aleatorios --> ");
              int t=Integer.parseInt(s.nextLine());
              int[] array = crearArray(t);
              System.out.println("El array ya ha sido creado");
              MostrarArray(array);
              datoVálido= true;
              break;
            case 4:
              System.out.println("\nERROR FileNotFoundException");
              System.out.println("-----------------------------");
              leerFichero();
              datoVálido= true;
              break;
            case 5:
              break;
            default:
              System.out.println("La opción seleccionada no es válida, prueba otra vez\n");
              break;
          }
        //Mensajes de error según la excepción que se ejecute//
      } catch (NumberFormatException e) { 
        System.out.println("O------------------------------------------------------------------- ");
        System.out.println("| Has introducido un valor que no corresponde con el formato entero |");
        System.out.println(" -------------------------------------------------------------------O");
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
      } catch (ArithmeticException e) {
        System.out.println("\nO--------------------------------------- ");
        System.out.println("| No se puede dividir un número entre 0 |");
        System.out.println(" ---------------------------------------O");
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("O------------------------------------------------------------- ");
        System.out.println("| La posición establecida está fuera de los límites del array |");
        System.out.println(" -------------------------------------------------------------O");
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
      } catch (FileNotFoundException e) {
        System.out.println("O---------------------------- ");
        System.out.println("| No se encuentra el fichero |");
        System.out.println(" ----------------------------O");
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
      } catch (StackOverflowError e) {
        System.out.println("\nO----------------------------------------------------------------------- ");
        System.out.println("| Se ha producido un error StackOverFlow, revisa la función del programa |");
        System.out.println(" ------------------------------------------------------------------------O");
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
      } catch (Exception e) {
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
      }
    } while (!datoVálido && opción!=5);
  }
}
