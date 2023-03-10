package Ej11TarjetasRegalo;
/* TarjetaRegalo.java
 * Clase "TarjetaRegalo" con los métodos y atributos necesarios para la gestión de tarjetas regalos de una empresa
 * Las tarjetas regalo tienen asignado un saldo y un numero de tarjeta (5 dígitos aleatorios)
 * Si se intenta gastar de una tarjeta más dinero de la cuenta debe aparecer un mensaje de error
 * Dos tarjetas se pueden fusionar creando una nueva tarjeta con el saldo de las anteriores 
 * (las originales deben quedarse a 0 euros)
 * @Irene Martín
 */
import java.text.DecimalFormat; //sirve para establecer los decimales//

public class TarjetaRegalo {

  //Atributos de instancia//
  public double saldo;
  public String numTarjeta; //es String porque tiene que generarse una serie de números aleatorios//

  //variables//
  double saldoNuevo=0;

  //Constructor//
  public TarjetaRegalo(double saldo) {
    this.saldo=saldo;
    this.numTarjeta="";
    for(int i=0; i<5; i++) { //cada dígito está formado por un número aleatorio (hasta llegar a 5)
      this.numTarjeta= this.numTarjeta+(int)(Math.random()*10); 
    }
  }
  //Métodos//
  public double getSaldo(){
    return this.saldo;
  }
  public String numTarjeta(){
    return this.numTarjeta;
  }
  public void gastar(double dinero) {
    /* Método para disminuir el saldo de una tarjeta según un dinero establecido para gastar.
     * Se tiene que informar si el saldo está agotado o si es inferior al dinero que se quiere gastar.
     * @param double dinero a gastar
     * @return void
     */
    if(saldo==0){
      System.out.println("Lo siento, ya has agotado el saldo de tu tarjeta");
    } else if(saldo<dinero){
      System.out.printf("No tienes suficiente saldo para gastar %.2f euros. Te quedan %.2f euros\n", dinero, this.getSaldo());
    } else {
      saldo=saldo-dinero;
    }
  }
  TarjetaRegalo fusionarCon(TarjetaRegalo segundaTarjeta) {
    /* Método para fusionar dos tarjetas regalo en una nueva cuyo saldo será la suma de ambas.
     * Como se tiene que devolver una nueva tarjeta, las dos anteriores quedarán sin saldo(hay que ponerlas a 0).
     * @param TarjetaRegalo segundaTarjeta con la que se quiere fusionar
     * @return new TarjetaRegalo con el saldo de las anteriores
     */
    saldoNuevo=this.saldo+segundaTarjeta.saldo;
    this.saldo=0;
    segundaTarjeta.saldo=0;
    return new TarjetaRegalo(saldoNuevo);
  }
  public String toString() {
    DecimalFormat decimales = new DecimalFormat("0.00");
    return "Tarjeta nº " + numTarjeta + " - Saldo " + decimales.format(saldo) + " euros";
  }
}
