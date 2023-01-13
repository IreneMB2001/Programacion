/*Ej2Array10Simbolos.java
*Programa que muestra un array con 10 caracteres y muestra que ocurre cuando solo se asignan valores a unas cuantas posiciones.
*Irene Martin
*/
public class Ej2Array10Simbolos {
  public static void main (String [] args) {
    
    System.out.println(" ");
    
    char[] simbolo=new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    System.out.println(" El array num contiene los siguientes elementos:");
    System.out.println(" -----------------------------------------------");
    for (int i=0; i<10; i++) {
      System.out.println(" simbolo " +i+ " --> " + simbolo[i]);
    }
    // Los elementos no inicializados del array se muestran en vacio.//
  }
}
