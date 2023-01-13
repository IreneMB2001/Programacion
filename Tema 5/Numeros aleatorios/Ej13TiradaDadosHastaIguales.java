/*Ej13TiradaDadosHastaIguales.java
*Programa que realiza una tirada de 3 dados (valores del 1 al 6) y su suma.
*@Irene Martin
*/

public class Ej13TiradaDadosHastaIguales  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    System.out.println (" Tirada de 2 dados hasta que ambos den el mismo valor: ");
    System.out.println (" -----------------------------------------------------");
    
    //Declaracion de variables//
    int dado1=0; //Variable para el dado 1//
    int dado2=0; //Variable para el dado 2//
    int tirada=0;
    
    //Bucle para los dados//
    do {
      tirada++;
      dado1= (int)(Math.random()*6 + 1);
      dado2= (int)(Math.random()*6 + 1);
      System.out.print(" Tirada " + tirada + " : ");
      System.out.println(" D1--> " + dado1 + " ; D2--> " + dado2);
      
    } while(dado1!=dado2);
    
  }
}
      
