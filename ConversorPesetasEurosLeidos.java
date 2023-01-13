/*ConversorPesetasEurosLeidos.java
*Programa que muestra en pantalla un conversor de pesetas a euros, leyendo el dato de pesetas.
*@Irene Martin
*/

public class ConversorPesetasEurosLeidos {
	public static void main (String [] args) {
		String linea;
		System.out.print (" Dame un numero de pesetas, por favor: ");
		linea = System.console().readLine();
		int pesetas;
		pesetas = Integer.parseInt( linea );
		
		System.out.println (" Ahora transformaremos las " +pesetas+ " pesetas a euros\n");
		System.out.println (" 1 peseta equivale a 0.0060 euros, por lo tanto:"); 
		
		double pesetaDouble;
		pesetaDouble= (double) pesetas;
		
		double conversion = pesetaDouble * 0.0060;
		
		System.out.println (" " +pesetas+ " pesetas equivalen a " +conversion+ " euros.");
		
	}
}
