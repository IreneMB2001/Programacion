/*Ej1Array12Num.java
*Programa que muestra un array con 12 numeros y muestra que ocurre cuando solo se asignan valores a unas cuantas posiciones.
*Irene Martin
*/
public class Ej1Array12Num {
  public static void main (String [] args) {
    
    System.out.println(" ");
    
    int[] num=new int[12];
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    System.out.println(" El array num contiene los siguientes elementos:");
    System.out.println(" -----------------------------------------------");
    for (int i=0; i<12; i++) {
      System.out.println(" num " +i+ " --> " + num[i]);
    }
    // Los elementos no inicializados del array se les asigna automáticamente 0.//
  }
}
