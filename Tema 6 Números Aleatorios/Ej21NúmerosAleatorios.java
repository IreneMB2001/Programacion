/* Ej21NúmerosAleatorios.java
 * programa que genera una secuencia de cinco monedas lanzadas al aire.
 * Monedas diponibles (1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros)
 * Las dos posiciones posibles son cara y cruz.
 * Author @Irene Martín
 */
public class Ej21NúmerosAleatorios {
  public static void main(String[] args) {
    //Variables//
    String moneda="";
    String posición="";
    int numMoneda; //número al que equivale cada tipo de moneda
    int numPosición; //número al que equivale la posición cara y cruz
    int t=5;
    
    System.out.println("\nTIRADA DE " +t+ " MONEDAS");
    System.out.println("---------------------------");
    //Bucle para establecer las 5 monedas//
    for (int i = 0; i<t; i++) {
      numMoneda=(int)(Math.random() * 8); //8 tipos de moneda
      numPosición=(int)(Math.random() * 2); //2 posiciones
      //Switch para establecer el tipo de moneda según el número//
      switch(numMoneda) {
        case 0:
          moneda="1 céntimo";
          break;
        case 1:
          moneda="2 céntimos";
          break;
        case 2:
          moneda="5 céntimos";
          break;
        case 3:
          moneda="10 céntimos";
          break;
        case 4:
          moneda="20 céntimos";
          break;
        case 5:
          moneda="50 céntimos";
          break;
        case 6:
          moneda="1 euro";
          break;
        case 7:
          moneda="2 euros";
        default:
      }
      //Switch para establecer la posición//
      switch(numPosición) {
        case 0:
          posición="cara";
          break;
        case 1:
          posición="cruz";
          break;
        default:
      }
      System.out.println(moneda+ " --> " +posición);
    }  
    System.out.println();  
  }
}
