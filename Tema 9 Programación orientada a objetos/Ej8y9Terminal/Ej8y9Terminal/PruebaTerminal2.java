package Ej8y9Terminal;
public class PruebaTerminal2 {
/* PruebaTerminal.java
 * Prueba del funcionamiento de la clase Terminal para la gestión de llamadas entre ellas
 * @Irene Martín
 */
    public static void main (String [] args) {
      //Declaración de objetos//
      Movil m1 = new Movil("678 11 22 33", "rata");
      Movil m2 = new Movil("644 74 44 69", "mono");
      Movil m3 = new Movil("622 32 89 09", "bisonte");
      
  
      //Resultado //
      System.out.println();
      System.out.println("GESTIÓN DE TERMINALES");
      System.out.println("---------------------");
      System.out.println(m1);
      System.out.println(m2);
      System.out.println();
      m1.llama(m2, 320);
      m1.llama(m3, 200);
      m2.llama(m3, 550);
      System.out.println(m1);
      System.out.println(m2);
      System.out.println(m3);
      
    }   
}
