/*Ej15GeneradorMelodia.java
*Programa que genera una melodia al azar en compas de 4 notas separadas por |.
* La ultima nota es igual que la primera y la melodia termina en ||.
* La melodia se forma con numeros aleatorios de notas entre 4 y 28 y que sean multiplos de 4.
*@Irene Martin
*/

public class Ej15GeneradorMelodia  {
  public static void main (String [] args) {
    System.out.println (" ");
    
    //Declaracion de variables//
    int melodia = 0; //Almacena el numero total de notas//
    int numeroNota =0; //Almacena el numero al azar de la nota que toca//
    String nota =" "; //Variable nota musical//
    String primeraNota = " "; //Variable que almacena el valor de la primera nota//
    int compas=0; //Variable que almacena el resto de 4 para hacer los grupos del compas//
    
    //Primer bucle--> el numero de notas tiene que ser multiplo de 4//
    do {
      melodia = (int)(Math.random()*25 + 4);
    } while (melodia%4 !=0);
    
    System.out.println (" A continuacion se generara una melodia formada por " +melodia+ " notas:");
    System.out.println (" -----------------------------------------------------------------");
     
    //Bucle principal para crear la melodia//
    for (int contador=1; contador<=melodia; contador++) {
    numeroNota= (int)(Math.random() * 7);
		
      //Switch para establecer cada nota musical//
      switch(numeroNota) {
        case 0:
          nota="do";
          break;
        case 1:
          nota="re";
          break;
        case 2:
          nota="mi";
          break;
        case 3:
          nota="fa";
          break;
        case 4:
          nota="sol";
          break;
        case 5:
          nota="la";
          break;
        case 6:
          nota="si";
          break;
        default:
      }
      
      //Establecer la primera y ultima nota//
      if (contador == 1) {
        primeraNota=nota;
      }
      if (contador == melodia) { //El contador llega a la ultima nota//
        nota=primeraNota; //La nota tendra el valor de la primera nota//
      }
      
      System.out.print(" " + nota + " ");
      
      //Establecer las barras de cada compas//
      compas= contador%4;
      if ( contador == melodia ) { //Cuando llega el final de la melodia//
        System.out.print("||");
      } else if ( compas==0 ) { //Cuando hay un grupo de 4//
        System.out.print("| ");
      }  
    }
  }
}
