package Ej8Terminal;
/* Movil.java
 * Subclase de la clase Terminal
 * Tiene una 3 tipos de tarifas: rata(coste 0.06), mono (coste 0.12) y bisonte(coste 0.30)
 * El coste de la llamada afecta a la terminal que realiza la llamada y se cobra por minuto
 */

public class Movil extends Terminal {
  //Atributos de Movil//
  private String tipoTarifa;
  private double costeTotal;

  //Constructor//
  public Movil(String numeroTarifa, String tipoTarifa) {
    super(numeroTarifa);
    this.tipoTarifa=tipoTarifa;
    this.costeTotal=0;
  }
  //Métodos de móvil//
  @Override 
  public void llama(Terminal terminal, int segundosLlamada) {
    /* El método es igual que en la clase principal pero se le añade el cálculo del coste de la llamada
     * con el super, se llama al método de la clase principal para que realice la misma función
     */
    super.llama(terminal, segundosLlamada);
    double minutos=(double)segundosLlamada/60;

    //Aplicación de los costes de llamada en la tarifa de la terminal//
    switch (this.tipoTarifa) { //El coste se le aplica a this porque es la terminal que llama
      case "rata":
        this.costeTotal = this.costeTotal+(minutos*0.06);
        break;
      case "mono":
        this.costeTotal = this.costeTotal+(minutos*0.12);
        break;
      case "bisonte":
        this.costeTotal = this.costeTotal+(minutos*0.30);
        break;
      default:
    }
  }
  public String toString() {
    return "Nº " +this.getNumeroTarifa()+ " - " +this.getTiempoConversacion()+ "s de conversación - tarificados "
    +this.costeTotal+ " euros";
  } 
}
