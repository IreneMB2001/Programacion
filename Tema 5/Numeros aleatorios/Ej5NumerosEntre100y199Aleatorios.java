/*Ej5NumerosEntre100y199Aleatorios.java
*Programa que imprime 50 numeros aleatorios entre 100 y 199 ambos incluidos separados por espacios.
*Ademas tambien se muestra el maximo, el minimo y la media de esos numeros.
*@Irene Martin
*/

public class Ej5NumerosEntre100y199Aleatorios  {
  public static void main (String [] args) {
    System.out.println (" ");
    int maximo=100;
    int minimo=199;
    int sumatorio=0;
    int contador=0;
    int valor= 0;
    
    System.out.println (" 50 numeros aleatorios entre 100 y 199: ");
    System.out.println (" -----------------------------------------------------");
    
    //Bucle for principal para escribir los 50 numeros//
    for (int i=1; i<=50; i++) {
      valor=(int)(Math.random()*100+100);
      
      System.out.print( " " + valor + " "); 
      contador++;
      sumatorio=sumatorio+valor;
      
      //Bucle if para saber el maximo y el minimo//
      if (valor<minimo) {
        minimo=valor;
      }
      if (valor>maximo) {
        maximo=valor;
      }
    }
    int media=sumatorio/contador;
    System.out.println( " "); 
    System.out.println (" -----------------------------------------------------");
    System.out.println( " - El maximo de los numeros mostrados es: " +maximo); 
    System.out.println( " - El minimo de los numeros mostrados es: " +minimo); 
    System.out.println( " - La media de los numeros mostrados es: " +media);
  }
}

 
