package Ej2VehículosModificado;
/* PruebaVehículos.java
 * Prueba de la clase Vehículos con sus diferentes subclases
 * Se debe establecer un bucle para que aparezca siempre el menú principal hasta que se selecciona la opción "salir"
 * Este programa ha sido modificado para que cuando se introduzca un valor erróneo el programa muestre un mensaje de error
 * @Author Irene Martin
 */
import java.util.Scanner;

import BibliotecaFunciones.*;

public class PruebaVehículos {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);

    //Declaración de variables//
    String respuesta="";
    int respuestaNum;
    int kilómetros;

    //Declaración de objetos//
    Bicicleta Holandesa1 = new Bicicleta("amarillo", "BTWINX", 10);
    Coche turismo2 = new Coche("Ford", "1234BCD", "rojo", 180);

    //Menu de opciones de vehículos//
    do {
      System.out.println("\nPRUEBA DE VEHÍCULOS");
      System.out.println("-------------------");
      System.out.println("Elige una de las siguientes opciones (1-8)");
      System.out.println("----------------------------------------------");
      System.out.println("1. Desplazarse con la bicicleta");
      System.out.println("2. Hacer el caballito con la bicicleta");
      System.out.println("3. Desplazarse con el coche");
      System.out.println("4. Quemar ruedas con el coche");
      System.out.println("5. Tocar el claxon del coche");
      System.out.println("6. Ver kilometraje de la bicicleta");
      System.out.println("7. Ver kilometraje del coche");
      System.out.println("8. Ver kilometraje total");
      System.out.println("9. Ver número total de vehículos creados");      
      System.out.println("10. Salir");
      System.out.println("----------------------------------------------");
      System.out.print("Respuesta --> ");
      respuesta=s.nextLine();

      //Comprobar que la respuesta es válida//
      if (Comprobantes.isNumeric(respuesta)) {
        respuestaNum=Integer.parseInt(respuesta);
      } else {
        respuestaNum=0;
      }

      switch(respuestaNum) {
        case 1:
          System.out.print("Cuantos kilómetros quieres recorrer? --> ");
          kilómetros=s.nextInt();
          Holandesa1.desplazarse(kilómetros);
          System.out.println("     -__T ");
          System.out.println("...(@)-/(@)");
          System.out.println("La Holandesa1 acaba de recorrer " +kilómetros+ " km\n");
          break;
        case 2:
          Holandesa1.hacerCaballito();
          break;
        case 3:
          System.out.print("Cuantos kilómetros quieres recorrer? --> ");
          kilómetros=s.nextInt();
          turismo2.desplazarse(kilómetros);
          System.out.println("         _______");
          System.out.println("     ___/___|___\\___");
          System.out.println("..../-@----------@--/");
          System.out.println("El turismo2 acaba de recorrer " +kilómetros+ " km\n");
          break;
        case 4:
          turismo2.quemarRuedas();
          break;
        case 5:
          turismo2.tocarClaxon();
          break;
        case 6:
          System.out.println("La Holandesa1 lleva recorridos " +Holandesa1.getKmRecorridos()+ " km\n");
          break;
        case 7:
          System.out.println("El turismo2 lleva recorridos " +turismo2.getKmRecorridos()+ " km\n");
          break;
        case 8:
          System.out.println("Los vehículos llevan recorridos " +Vehículo.getKmTotales()+ " km totales.\n");
          break;
        case 9:
          System.out.println("En total han sido creados " +Vehículo.getVehículosCreados()+ " vehículos.\n");
          break;
        default:
          System.out.println("La opción seleccionada no es válida, prueba otra vez");
          break;
      }
    } while (respuestaNum!=10);
  }
}
