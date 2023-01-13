/*TotalFacturaLeida.java
*Programa que muestra por pantalla el total de una factura a partir de la base imponible, introducida por teclado.
*@Irene Martin
*/

public class TotalFacturaLeida {
  public static void main (String [] args) {
    System.out.println (" Calculo del importe total de una factura:\n");
    String linea;
    System.out.print (" Dame la base imponible de la factura: ");
    linea= System.console().readLine();
    double baseImponible;
    baseImponible= Double.parseDouble( linea );
		
    double iva = 0.21;
		
    double importeIva= baseImponible * iva;
    double importeTotal= baseImponible + importeIva;
		
    System.out.println (" La base imponible de una factura es " + baseImponible + " euros.");
    System.out.println (" El IVA es de un 21%");
    System.out.println (" El importe total de la factura es de " +importeTotal+ " euros.");
		
	}
}
	
