/*Ej11NotasAlAzar.java
*Programa que genera 20 notas al azar y al final aparecen las cantidades totales de cada nota.
*@Irene Martin
*/

public class Ej11NotasAlAzar {
  public static void main (String [] args) {
    System.out.println (" ");
    System.out.println(" A continuacion se mostraran 20 notas al azar:\n");
    
    //Declaracion de variables//
    int nota; 
    int contSobresaliente = 0;
    int contNotable = 0;
    int contBien = 0;
    int contSuficiente = 0;
    int contSuspenso = 0;
    
    //Bucle principal//
    for(int i = 1; i <= 20; i++) {
      nota = (int)(Math.random() * 5); //hay 5 notas en total//
      
      //Switch para establecer cada nota//
      switch(nota) {
        case 0:
          System.out.print(" suspenso ");
          contSuspenso++;
          break;
        case 1:
          System.out.print(" suficiente ");
          contSuficiente++;
          break;
        case 2:
          System.out.print(" Bien ");
          contBien++;
          break;
        case 3:
          System.out.print(" Notable ");
          contNotable++;
          break;
        case 4:
          System.out.print(" Sobresaliente ");
          contSobresaliente++;
          break;
        default:
      }
    }
    //Cantidades totales de cada nota//
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" Resultado final:");
    System.out.println(" ------------------------");
    System.out.println(" Total de suspensos: " + contSuspenso);
    System.out.println(" Total de suficientes: " + contSuficiente);
    System.out.println(" Total de bienes: " + contBien);
    System.out.println(" Total de notables: " + contNotable);
    System.out.println(" Total de sobresalientes: " + contSobresaliente);
  }
}
  
