/*HorarioDeClase.java
*Programa que muestra por pantalla el horario de clase.
*@Irene Martin
*/

public class HorarioDeClase {
  public static void main (String [] args) {
	System.out.println (" Horario de Clase\n");
	System.out.println (" BBDD = Base de datos");
	System.out.println (" SSII = Sistemas Informaticos");
	System.out.println (" LLMM = Lenguajes de Marcas");
	System.out.println (" PROG. = Programacion");
	System.out.println (" EEDD = Entornos de Desarrollo\n");
	System.out.printf ("  ---------------------------------------------------------------------------------\n");
    System.out.printf (" | %-10s | %-10s | %-10s  | %-10s  | %-10s  | %-10s  |\n", " ", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s | %-10s  | %-10s  | %-10s  | %-10s  |\n", "15:15", "nada", "BBDD", "BBDD", "SSII", "LLMM");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s | %-10s  | %-10s  | %-10s  | %-10s  |\n", "16:15", "nada", "BBDD", "BBDD", "SSII", "LLMM");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s | %-10s  | %-10s  | %-10s  | %-10s  |\n", "17:15", "nada", "PROG.", "BBDD", "PROG.", "PROG.");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s  %-10s   %-10s   %-10s   %-10s      |\n", "18:15 ", "", " ", "Descanso ", " ", " ");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s | %-10s  | %-10s  | %-10s  | %-10s  |\n", "18:30", "EEDD", "PROG.", "BBDD", "PROG.", "PROG.");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s | %-10s  | %-10s  | %-10s  | %-10s  |\n", "19:30", "SSII", "LLMM", "EEDD", "PROG.", "SSII");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s | %-10s  | %-10s  | %-10s  | %-10s  |\n", "19:30", "SSII", "LLMM", "EEDD", "PROG.", "SSII");
    System.out.printf ("  ---------------------------------------------------------------------------------\n");
  }
}
