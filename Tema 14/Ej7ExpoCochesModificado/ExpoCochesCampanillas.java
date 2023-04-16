package Ej7ExpoCochesModificado;
/* ExpocochesCampanillas.java
 * Programa de gestion de ventas de entradas de Expocoches campanillas 
 * Tiene 3 zonas disponibles: salaPrincipal(1000 entradas), compraVenta(200 entradas) y VIP(25 entradas)
 * Se tiene que implementar la clase Zona y hay que controlar que existen entradas antes de venderlas
 * Este programa ha sido modificado para que cuando se introduzca un valor erróneo el programa muestre un mensaje de error
 * @Author Irene Martin
 */
import java.util.Scanner;
public class ExpoCochesCampanillas {
  public static void main (String [] args){
    Scanner s = new Scanner (System.in);
    boolean datoVálido= false; //Dato para que el programa no termine si se produce el error

    //Declaración de objetos//
    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    //Declaración de variables//
    int opción1=0;
    int opción2=0;
    
    int numEntradas = 0;
    
    do{ //bucle para que el programa no pare aunque se notifique de un error
      try {
        do { //bucle para que el menú siga apareciendo hasta que se le de a la opción de salir
          System.out.println();
          System.out.println("EXPOCOCHES CAMPANILLAS");
          System.out.println("----------------------");
          System.out.println("Elige una de las siguientes opciones (1-3) ");
          System.out.println("-----------------------------------------------");
          System.out.println("1. Mostrar número de entradas libres");
          System.out.println("2. Vender entradas");
          System.out.println("3. Salir");
          System.out.println("-----------------------------------------------");
          System.out.print("--> ");
          opción1 = Integer.parseInt(s.nextLine());
          datoVálido = true;
          //cambiamos el switch a false para comprobar los demás datos que puedan dar error
          datoVálido = false;

          //Switch de opciones//
          switch(opción1){
            case 1:
              System.out.println("NUMERO DE ENTRADAS LIBRES");
              System.out.println("--------------------------------");
              System.out.println("- Sala Principal --> " +salaPrincipal.getEntradasPorVender());
              System.out.println("- Zona CompraVenta --> " +compraVenta.getEntradasPorVender());
              System.out.println("- Zona VIP --> " +vip.getEntradasPorVender());
              System.out.println("--------------------------------");
              break;
            case 2:
              System.out.println("VENTA DE ENTRADAS");
              System.out.println("-----------------");
              System.out.println("Elige entre una de las siguientes zonas (1-3) ");
              System.out.println("-----------------------------------------------");
              System.out.println("1. Sala Principal");
              System.out.println("2. Zona CompraVenta");
              System.out.println("3. Zona VIP");
              System.out.println("-----------------------------------------------");
              System.out.print("--> ");
              opción2=Integer.parseInt(s.nextLine());
              datoVálido = true;
              //cambiamos el switch a false para comprobar los demás datos que puedan dar error
              datoVálido = false;

              System.out.println("Cuántas entradas quieres? ");
              System.out.print("--> ");
              numEntradas=Integer.parseInt(s.nextLine());
              datoVálido = true;

              //Segundo switch para la venta de entradas//
              switch(opción2){
                case 1:
                  salaPrincipal.vender(numEntradas);
                  break;
                case 2:
                  compraVenta.vender(numEntradas);
                  break;
                case 3:
                  vip.vender(numEntradas);
                  break;
                default:
                  System.out.println("La zona seleccionada no es válida ");
                  break;
              }
              break;
            case 3:
              break;
            default:
              System.out.println("La opción seleccionada no es válida, prueba otra vez\n");
              break;
          }
        } while(opción1!=3);
      } catch (Exception e) { 
        System.out.println("O------------------------------------------------------------------- ");
        System.out.println("| Has introducido un valor que no corresponde con el formato entero |");
        System.out.println(" -------------------------------------------------------------------O");
        System.out.println("Excepción: " + e.getClass());
        System.out.println("Error: " + e.getMessage() +"\n");
      } 
    } while (!datoVálido && opción1!=3);
  }
}
