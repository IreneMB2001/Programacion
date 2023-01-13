/*Ej1AleatorioTiradaDados.java
*Programa que realiza una tirada de 3 dados (valores del 1 al 6) y su suma.
*@Irene Martin
*/

public class Ej1AleatorioTiradaDados  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    System.out.println (" Tirada de 3 dados y su suma: ");
    System.out.println (" ---------------------------------------");
    
    //Declaracion de variables//
    int dado=0; //Variable para indicar cada uno de los dados//
    int valor=0; //Variable que almacena el valor random//
    int sumatorio=0; //Variable que suma el valor de los tres dados//
    
    //Bucle para los dados//
    for (int i=1; i<=3; i++) {
      dado++;
      System.out.println (" Dado " +dado);
      valor=(int)(Math.random()*6 + 1);
      System.out.println(" " + valor);
      sumatorio=sumatorio+valor;   
    }
    System.out.println (" ---------------------------------------");
    System.out.println (" La suma del valor de los 3 dados es: " +sumatorio);
    System.out.println (" ---------------------------------------");
  }
}
      
