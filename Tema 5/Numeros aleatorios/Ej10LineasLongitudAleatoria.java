/*Ej10LineasLongitudAleatoria.java
*Programa que genera 10 lineas con una longitud aleatoria pintadas con caracteres aleatorios.
*La longitud de la linea generada se establece entre 1 y 40 caracteres.
*@Irene Martin
*/

public class Ej10LineasLongitudAleatoria {
  public static void main (String [] args) {
    System.out.println (" ");
    System.out.println(" 10 Lineas creadas entre 1 y 40 caracteres aleatorios:\n");
    
    //Declaracion de variables//
    int longitud=0; //Variable para establecer la longitud aleatoriamente//
    int relleno=0; //Variable para establecer el relleno aleatoriamente//
    String caracter=""; //Variable con el caracter aleatorio escogido//
    
    //Bucle principal//
    for (int i=1; i<=10; i++) {
      longitud = (int)(Math.random()*40 + 1); //Longitud entre 1 y 40 caracteres//
      relleno = (int)(Math.random() * 6); //Son 6 caracteres en total//
      
      //Switch para los caracteres//
      switch(relleno) {
        case 0:
          caracter = "*";
          break;
        case 1:
          caracter = "-";
          break;
        case 2:
          caracter = "=";
          break;
        case 3:
          caracter = ".";
          break;
        case 4:
          caracter = "|";
          break;
        case 5:
          caracter = "@";
          break;
        default:
      }
      
      //Bucle para pintar las lineas//
      for (int l=1; l<=longitud; l++) {
        System.out.print(" ");
        System.out.print(caracter);
      }
      //Margenes//
      System.out.println(" ");
      System.out.println(" ");
    }
  }
}
    
