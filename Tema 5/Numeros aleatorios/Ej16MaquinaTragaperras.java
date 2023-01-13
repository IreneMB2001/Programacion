/*Ej16MaquinaTragaperras.java
*Programa simulador de maquina tragaperras que muestra 5 figuras al azar de 5 posibles.
*Si las 3 figuras son iguales ganas 10 monedas, si solo 2 son iguales recuperas tu moneda y sino pierdes.
*@Irene Martin
*/

public class Ej16MaquinaTragaperras  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    //Declaracion de variables//
    int valor=0; 
    int ronda=0; //variable contador de cada ronda--> 1 por figura//
    int figura1=0;
    int figura2=0;
    int figura3=0;
    
    System.out.println (" Resultado de la maquina tragaperras: ");
    System.out.println (" --------------------------------------");
    
    //Bucle principal//
    for (ronda=0; ronda<3; ronda++) {
      valor= (int)(Math.random()*5); //5 figuras posibles//
    
      //Switch para establecer el nombre de cada figura//
      switch (valor) {
        case 0:
          System.out.print (" | corazon ");
          break;
        case 1:
          System.out.print (" | diamante ");
          break;
        case 2:
          System.out.print (" | herradura ");
          break;
        case 3:
          System.out.print (" | campana ");
          break;
        case 4:
          System.out.print (" | limon ");
          break;
        default:
      }
    
      //Switch para establecer el valor de cada figura segun el contador//
      switch(ronda) {
        case 0:
          figura1=valor;
          break;
        case 1:
          figura2=valor;
          break;
        case 2:
          figura3=valor;
          break;
        default:
      }
    }
    System.out.print ("| ");
    System.out.println (" "); 
            
    //Condicional para saber si pierdes, recuperas o ganas monedas//
    System.out.println (" --------------------------------------");
    if ((figura1!=figura2) && (figura1!=figura3) && (figura2!=figura3)) {
      System.out.println (" Lo siento, ha perdido.");
    } else if ((figura1==figura2) && (figura2==figura3) && (figura1==figura3)) {
      System.out.println (" Enhorabuena, ha ganado 10 monedas! --> + O O O O O O O O O O");
    } else {
      System.out.println (" Bien, ha recuperado su moneda --> + O");
    }
  }
}
      
        
        
        
