/* Ej13NúmerosAleatorios.java
 * programa que simula la tirada de dos dados.
 * Se van tirando los dados en bucle hasta que los dos dados tengan los valores iguales.
 * Author @Irene Martín
 */
public class Ej13NúmerosAleatorios {
  public static void main(String[] args) {
    //Variables//
    int dado1;
    int dado2;
    int tirada=1;

    System.out.println("\nTirada al azar de 2 dados");
    System.out.println("-------------------------");
    //Bucle de tirada de dados//
    do {
      //Se establecen valores aleatorios para ambos dados desde el 1 hasta el 6//
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      //Se imprime cada tirada de dados//
      System.out.println("Tirada " +tirada);
      System.out.println("----------------------------");
      System.out.println("dado 1 --> " +dado1+ " | dado 2 --> " +dado2);
      System.out.println("****************************");
      tirada++;
    } while (dado1 != dado2); //El bucle permanece mientras los valores de ambos dados no coincidan
  }
}