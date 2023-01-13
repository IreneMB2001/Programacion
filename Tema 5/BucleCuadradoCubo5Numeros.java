/*BucleCuadradoCubo5Numeros.java
*Programa que te pide un numero y segun ese, muestra por teclado el cuadrado y el cubo de los 5 primeros.
*@Irene Martin
*/
import java.util.Scanner;

public class BucleCuadradoCubo5Numeros {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    System.out.println (" ");
    
    System.out.print (" Introduce un numero: ");
    //Declaracion de variables//
    int num= s.nextInt();
    int cuadrado1= num*num; //Variable int que calcula el cuadrado del numero introducido//
    int cubo1=num*num*num; //Variable int que calcula el cubo del numero introducido//
    int cuadradoN=0; //Variable int que calcula el cuadrado de los numeros siguientes//
    int cuboN=0; //Variable int que calcula el cubo de los numeros siguientes//
    
    //Impresion del resultado del numero introducido//
    System.out.println (" ");
    System.out.println (" 5 primeros numeros enteros");
    System.out.println (" ------------------------------------");
    System.out.printf (" | %-10s | %-10s | %-10s\n", "Numero", "Cuadrado", "Cubo");
    System.out.println (" ------------------------------------");
    System.out.printf (" | %-10s | %-10s | %-10s\n", num, cuadrado1, cubo1);
    
    //Bucle para establecer los 4 numeros siguientes//
    for (int i=1; i<=4; i++) {
    num++;
    cuadradoN= num*num;
    cuboN=num*num*num;
    System.out.printf (" | %-10s | %-10s | %-10s\n", num, cuadradoN, cuboN);
    }
  }
}
