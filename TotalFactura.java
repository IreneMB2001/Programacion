/*TotalFactura.java
*Programa que muestra por pantalla el total de una factura a partir de la base imponible.
*@Irene Martin
*/

public class TotalFactura {
	public static void main (String [] args) {
		System.out.println (" Calculo del importe total de una factura:\n");
		double baseImponible = 77;
		System.out.println (" La base imponible de una factura es " + baseImponible + " euros.");
		
		double iva = 0.21;
		System.out.println (" El IVA es de un 21%");
		
		double importeIva= baseImponible * iva;
		double importeTotal= baseImponible + importeIva;
		
		System.out.println (" El importe total de la factura es de " +importeTotal+ " euros.");
		
	}
}
		
