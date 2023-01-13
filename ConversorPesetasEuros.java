/*ConversorPesetasEuros.java
*Programa que muestra en pantalla un conversor de pesetas a euros, almacenando la cantidad de euros en una variable.
*@Irene Martin
*/

public class ConversorPesetasEuros {
	public static void main (String [] args) {
		double euros= 50;
		System.out.println (" Tenemos " +euros+ " euros");
		
		double pesetas = 166.386;
		System.out.println (" 1 euro equivale a " +pesetas+ " pesetas");
		
		double conversion= euros * pesetas;
		int conversionint;
		conversionint = (int)conversion;
		System.out.println (" Los " +euros+ " euros equivalen a " +conversionint+ " pesetas");
		
		
		
		
	}
}
