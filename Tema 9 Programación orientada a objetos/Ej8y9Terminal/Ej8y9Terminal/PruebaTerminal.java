package Ej8y9Terminal;

/* PruebaTerminal.java
 * Prueba del funcionamiento de la clase Terminal para la gestión de llamadas entre ellas
 * @Irene Martín
 */
public class PruebaTerminal {
  public static void main (String [] args) {
    //Declaración de objetos//
    Terminal t1 = new Terminal("678 11 22 33");
    Terminal t2 = new Terminal("644 74 44 69");
    Terminal t3 = new Terminal("622 32 89 09");
    Terminal t4 = new Terminal("664 73 98 18");

    //Resultado //
    System.out.println();
    System.out.println("GESTIÓN DE TERMINALES");
    System.out.println("---------------------");
    System.out.println(t1);
    System.out.println(t2);
    System.out.println();
    t1.llama(t2, 320); //llamada entre t1 y t2
    t1.llama(t3, 200); //llamada ente t1 y t3
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);
  }
}
