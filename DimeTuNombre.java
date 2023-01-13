/*DimeTuNombre.java
*Programa que pregunta cual es tu nombre, lee el dato introducido y después te saluda.
*@IreneMartin
*/

public class DimeTuNombre {
	public static void main (String [] args) {
		String nombre;
		System.out.println (" Por favor, dime como te llamas: ");
		nombre = System.console().readLine();
		System.out.println (" Hola " + nombre + ", encantado de conocerte :)");
	}
}
