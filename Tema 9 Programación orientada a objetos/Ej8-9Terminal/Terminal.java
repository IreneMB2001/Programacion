package Ej8Terminal;
/* Terminal.java
 * Clase Terminal con sus atributos y métodos necesarios para la gestión de llamadas entre terminales
 * Cada terminal tiene un numero asociado y el tiempo de conversación afectará a las dos terminales que se llaman
 * @Irene Martín
 */
public class Terminal {
  //Atributos de instancia//
  private String numeroTarifa; //numero de la terminal
  private int tiempoConversacion; // tiempo de conversación en segundos

  //Constructor//
  Terminal(String numeroTarifa) {
    this.numeroTarifa = numeroTarifa;
    this.tiempoConversacion = 0; //el contador del tiempo de conversación de cada terminal
  }

  //Métodos de la Terminal//
  public String getNumeroTarifa() {
    return numeroTarifa;
  }
  public int getTiempoConversacion() {
    return tiempoConversacion;
  }
  public void llama(Terminal terminal, int segundosLlamada) {
    /*Método para llamar entre terminales
     *El tiempo de conversación de las 2 terminales que se llaman sumarán los segundos de la llamada a su contador
     * @param void
     */
    this.tiempoConversacion = this.tiempoConversacion+segundosLlamada;
    terminal.tiempoConversacion = terminal.tiempoConversacion+segundosLlamada;
  }  
  public String toString() {
    /*Método para establecer lo que aparecerá cuando le hagamos print al objeto
     * @param String (numero de la terminal + tiempo de conversación total)
     */
    return "Nº " +numeroTarifa+ " - " +this.tiempoConversacion+ "s de conversación ";
  } 
}
