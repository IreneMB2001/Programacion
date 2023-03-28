/* Ej9NúmerosAleatorios.java
 * programa que va generando números aleatorios pares entre 0 y 100 
 * No termina de generar números hasta sacar un 24
 * Se debe decir al final cuántos números se han generado
 * Author @Irene Martín
 */
public class Ej9NúmerosAleatorios {
  public static void main(String[] args) {
    //Variables//
    int número = 0;
    int contador = 0;

    //Bucle para generar los números aleatorios hasta sacar un 24//
    while (número != 24) { //El bucle se mantiene mientras el número sea diferente a 24//

      //Se genera el número aleatorio entre 0 y 100 de forma que salgan números pares//
      número = (int)(Math.random() * 51) * 2;
      System.out.print(número + " ");
      contador++;
    }
    System.out.println("\n------------------------------------------------------------------");
    System.out.println(" Números totales generados --> " + contador);
  }
}
    