/*DatosVariables.java
*Programa que muestra por pantalla mi nombre, direccion y telefono en forma de variables.
*@Irene Martin
*/

public class DatosVariables {
	public static void main (String [] args) {
		System.out.println (" \033[36mMis datos personales son:\033[39;49m\n");
		String nombre = "Irene Martin Barea";
		System.out.println (" Nombre: " +nombre);
		
		String direccion = "Calle inventada, Num 99";
		System.out.println (" Direccion: " +direccion);
		
		String telefono = "642323224";
		System.out.println (" Numero de telefono: " +telefono);
	
	}
}
