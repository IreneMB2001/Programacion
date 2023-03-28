/* Ej16NúmerosAleatorios.java
 * programa que realiza un simulador de máquina tragaperras simplificada según las siguientes condiciones:
 * Hay 5 figuras posibles (corazón, diamante, herradura, campana y limón.) y la tirada es de 3 figuras
 * Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
 * Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
 * Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
 * Author @Irene Martín
 */
public class Ej16NúmerosAleatorios {
  public static void main(String[] args) { 
    //Variables//
    int númerofigura;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;

    System.out.println("\nMÁQUINA TRAGAPERRAS - Aquí tiene su tirada:");
    System.out.println("-------------------------------------------");
    //Bucle para establecer la tirada de las 3 figuras//
    for (int i=1; i<=3; i++){
      númerofigura = (int)(5 * Math.random());
      switch(númerofigura) {
        case 0:
          System.out.print("corazón | ");
          break;
        case 1:
          System.out.print("diamante | ");
          break;
        case 2:
          System.out.print("herradura | ");
          break;
        case 3:
          System.out.print("campana | ");
          break;
        case 4:
          System.out.print("limón | ");
          break;
        default:
      }
      //Switch según el número del contador para establecer cada figura//
      switch(i) {
        case 1:
        figura1=númerofigura;
        break;
        case 2:
        figura2=númerofigura;
        break;
        case 3:
        figura3=númerofigura;
        break;
        default:
      }
    }

    //Imprimir el resultado de la tirada
    System.out.println("\n-------------------------------------------");
    if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
      System.out.println("Lo siento, ha perdido.");
    } else if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.println("Enhorabuena, ha ganado 10 monedas. --> O O O O O O O O O O");
    } else {
      System.out.println("Bien, ha recuperado su moneda. --> O");
    }
    System.out.println();
  } 
}
