/*PiramideHuecaColor.java
*Programa que muestra en pantalla una piramide hueca con asteriscos y coloreada.
*@Irene Martin
*/

public class PiramideHuecaColor {
  public static void main (String [] args) {
	System.out.println ("Esto es una piramide hueca con color:\n");
    System.out.println ("  \033[95m   * \033[39;49m   ");
    System.out.println ("  \033[95m  * * \033[39;49m ");
    System.out.println (" \033[95m  *   * \033[39;49m ");
    System.out.println ("\033[95m  *     * \033[39;49m");
    System.out.println ("\033[95m ********* \033[39;49m");
    
    
    
  }
}
