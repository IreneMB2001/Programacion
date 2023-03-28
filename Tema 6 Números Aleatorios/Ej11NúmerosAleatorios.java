/* Ej11NúmerosAleatorios.java
 * programa que muestra 20 notas generadas al azar.
 * Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.
 * Al final aparecerán los números totales de cada nota.
 * Author @Irene Martín
 */
public class Ej11NúmerosAleatorios {
  public static void main(String[] args) {
    //Variables//
    int nota;
    int contadorSuspensos = 0;
    int contadorSuficientes = 0;
    int contadorBienes = 0;
    int contadorNotables = 0;
    int contadorSobresalientes = 0;
    int numNotas=20;

    System.out.println();
    System.out.println("20 NOTAS GENERADAS AL AZAR");
    System.out.println("----------------------------");
    //Bucle para mostrar 20 notas//
    for(int i = 0; i < numNotas; i++) {

      //Se le genera un número aleatorio a la nota//
      nota = (int)(Math.random()*5); //5 notas posibles

      //Switch de las notas que se establecen según el número obtenido//
      switch(nota) {
        case 0:
          System.out.print("suspenso | ");
          contadorSuspensos++;
          break;
        case 1:
          System.out.print("suficiente | ");
          contadorSuficientes++;
          break;
        case 2:
          System.out.print("bien | ");
          contadorBienes++;
          break;
        case 3:
          System.out.print("notable | ");
          contadorNotables++;
          break;
        case 4:
          System.out.print("sobresaliente | ");
          contadorSobresalientes++;
          break;
        default:
      }
    }
    //Imprimir los números totales de cada nota//
    System.out.println();
    System.out.println("----------------------------------------------------");
    System.out.println("Nº de suspensos: " +contadorSuspensos);
    System.out.println("Nº de suficientes: " +contadorSuficientes);
    System.out.println("Nº de bienes: " +contadorBienes);
    System.out.println("Nº de notables: " +contadorNotables);
    System.out.println("Nº de sobresalientes: " +contadorSobresalientes);
    System.out.println("----------------------------------------------------");
  }
}
