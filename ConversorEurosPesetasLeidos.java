/*ConversorEurosPesetasLeidos.java
*Programa que muestra en pantalla un conversor de euros a pesetas, leyendo el dato de euros.
*@Irene Martin
*/

public class ConversorEurosPesetasLeidos {
	public static void main (String [] args) {
		String linea;
		System.out.print (" Dame un numero de euros, por favor: ");
		linea = System.console().readLine();
		double euros;
		euros = Double.parseDouble( linea );
		
		System.out.println (" Ahora transformaremos los " +euros+ " euros a pesetas\n");
		System.out.println (" 1 euro equivale a 166.386 pesetas, por lo tanto:"); 
		
		double pesetas = euros * 166.386;
		int pesetasint;
		pesetasint = (int)pesetas;
		
		System.out.println (" " +euros+ " euros equivalen a " +pesetasint+ " pesetas.");
		
	}
}
