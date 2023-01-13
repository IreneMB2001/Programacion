/*HorarioClaseColores.java
*Programa que muestra por pantalla el horario de clase con colores en cada asignatura.
*@Irene Martin
*/

public class HorarioClaseColores {
  public static void main (String [] args) {
	System.out.println (" Horario de Clase con colores\n");
	System.out.println (" BBDD = Base de datos");
	System.out.println (" SSII = Sistemas Informaticos");
	System.out.println (" LLMM = Lenguajes de Marcas");
	System.out.println (" PROG. = Programacion");
	System.out.println (" EEDD = Entornos de Desarrollo\n");
	System.out.printf ("  ---------------------------------------------------------------------------------\n");
    System.out.printf (" | %-10s | %-10s | %-10s  | %-10s  | %-10s  | %-10s  |\n", " ", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s     | %-10s      | %-10s      | %-10s      | %-10s      |\n", "15:15", "\033[90m nada \033[39;49m", "\033[94m BBDD \033[39;49m", "\033[94m BBDD \033[39;49m", "\033[92m SSII \033[39;49m", "\033[93m LLMM \033[39;49m");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s     | %-10s      | %-10s      | %-10s      | %-10s      |\n", "16:15", "\033[90m nada \033[39;49m", "\033[94m BBDD \033[39;49m", "\033[94m BBDD \033[39;49m", "\033[92m SSII \033[39;49m", "\033[93m LLMM \033[39;49m");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s     | %-10s     | %-10s      | %-10s     | %-10s     |\n", "17:15", "\033[90m nada \033[39;49m", "\033[95m PROG. \033[39;49m", "\033[94m BBDD \033[39;49m", "\033[95m PROG. \033[39;49m", "\033[95m PROG. \033[39;49m");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s  %-10s   %-10s   %-10s   %-10s      |\n", "18:15 ", "", " ", "Descanso ", " ", " ");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s     | %-10s     | %-10s      | %-10s     | %-10s     |\n", "18:30", "\033[96m EEDD \033[39;49m", "\033[95m PROG. \033[39;49m", "\033[94m BBDD \033[39;49m", "\033[95m PROG. \033[39;49m", "\033[95m PROG. \033[39;49m");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s     | %-10s     | %-10s      | %-10s     | %-10s     |\n", "19:30", "\033[92m SSII \033[39;49m", "\033[93m LLMM  \033[39;49m", "\033[96m EEDD \033[39;49m", "\033[95m PROG. \033[39;49m", "\033[92m SSII  \033[39;49m");
    System.out.printf (" |---------------------------------------------------------------------------------|\n");
    System.out.printf (" | %-10s | %-10s     | %-10s     | %-10s      | %-10s     | %-10s     |\n", "19:30", "\033[92m SSII \033[39;49m", "\033[93m LLMM  \033[39;49m", "\033[96m EEDD \033[39;49m", "\033[95m PROG. \033[39;49m", "\033[92m SSII  \033[39;49m");
    System.out.printf ("  ---------------------------------------------------------------------------------\n");
  }
}
