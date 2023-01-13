/*Ej9CuentaNumerosHasta24Aleatorio.java
*Programa que genera numeros aleatorios pares entre 0 y 100 y no termina hasta que saque un 24.
*Tambien se muestra el total de numeros generados.
*@Irene Martin
*/

public class Ej9CuentaNumerosHasta24Aleatorio {
  public static void main (String [] args) {
    System.out.println (" ");
    
    //Declaracion de variables//
    int num=0;
    int contador= 0;
    int resto=0;
    
    //Bucle aleatorios con limite 24//
    while(num!=24) {
      num= (int)(Math.random()* 101); //Al poner 101 el 100 cuenta//
      resto=num%2; //El resto se utiliza para sacar los pares//
      
      if (resto==0) {
        System.out.print(" ");
        System.out.print(num + " ");
        contador++;
      }
    }
    System.out.println(" ");
    System.out.println(" Se han generado " + contador + " numeros en total.");
  }
}
