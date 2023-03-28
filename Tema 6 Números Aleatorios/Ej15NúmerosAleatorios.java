/* Ej15NúmerosAleatorios.java
 * programa que realiza un generador de melodías al azar según las siguientes condiciones:
 * Las 7 notas son do, re, mi, fa, sol, la y si.
 * Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y es múltiplo de 4.
 * Cada grupo de 4 notas es un compás, por lo que se divide con |.
 * El final de la melodía se marcará con 2 barras ||.
 * La última nota de la melodía debe coincidir con la primera.
 * Author @Irene Martín
 */
public class Ej15NúmerosAleatorios {
  public static void main(String[] args) {
    //Variables//
    int melodía = 4 * (int)(Math.random() * 7 + 1);
    String nota=""; //se almacena el tipo de nota (o, re, mi, fa, sol, la y si)
    String primeraNota=""; //se almacena el valor de la primera nota

    System.out.println("\nMELODÍA AL AZAR");
    System.out.println("-----------------");
    //Bucle para establecer el número de notas según la melodía al azar obtenida//
    for (int contadorNota = 1; contadorNota <= melodía; contadorNota++) {
      int númeroNota=(int)(Math.random() * 7); //número al que equivale cada nota
      switch(númeroNota) {
        case 0:
          nota = "do";
          break;
        case 1:
          nota = "re";
          break;
        case 2:
          nota = "mi";
          break;
        case 3:
          nota = "fa";
          break;
        case 4:
          nota = "sol";
          break;
        case 5:
          nota = "la";
          break;
        case 6:
          nota = "si";
          break;
        default:
      }
      //Se almacena la primera nota//
      if (contadorNota == 1) {
        primeraNota=nota;
      }
      /* Cuando el contador llega al mismo número que la melodía, 
       * al ser el final se le establece a la nota que toca el valor de la primera.
       */
      if(contadorNota==melodía){
        nota=primeraNota;
      }
      System.out.print(nota + " ");
      //Cuando el contador llega al mismo número que la melodía, al ser el final se pone doble barra
      if(contadorNota==melodía){
        System.out.print("||");
      } else if ( contadorNota % 4 == 0 ) {
        System.out.print("| ");
      }
    } 
    System.out.println("\n");
  }    
}
