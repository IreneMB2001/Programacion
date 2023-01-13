/*TablaColores.java
*Programa que muestra en pantalla una tabla con los colores disponibles y sus respectivos codigos.
*@Irene Martin
*/

public class TablaColores {
  public static void main (String [] args) {
	System.out.println (" ________________________________________________");
	System.out.println ("| codigo |   Color   | Codigo |	    Color       |");
	System.out.println ("|--------|-----------|--------|-----------------|");
	System.out.println ("|   30   |\033[30m  negro\033[39;49m    |   90   |\033[90m  negro claro\033[39;49m    |");
	System.out.println ("|________|___________|________|_________________|");
	System.out.println ("|   31   | \033[31m rojo\033[39;49m     |   91   | \033[91m Rojo claro  \033[39;49m   |");
	System.out.println ("|________|___________|________|_________________|");
	System.out.println ("|   32   | \033[32m verde\033[39;49m    |   92   | \033[92m verde claro  \033[39;49m  |");
	System.out.println ("|________|___________|________|_________________|");
	System.out.println ("|   33   |\033[33m amarillo\033[39;49m  |   93   |\033[93m amarillo claro \033[39;49m |");
	System.out.println ("|________|___________|________|_________________|");
	System.out.println ("|   34   | \033[34m  azul \033[39;49m   |   94   |  \033[94m azul claro  \033[39;49m  |");
	System.out.println ("|________|___________|________|_________________|");
	System.out.println ("|   35   | \033[35m morado \033[39;49m  |   95   | \033[95m morado claro  \033[39;49m |");
	System.out.println ("|________|___________|________|_________________|");
	System.out.println ("|   36   | \033[36m  cian \033[39;49m   |   96   | \033[96m  cian claro  \033[39;49m  |");
	System.out.println ("|________|___________|________|_________________|");
	System.out.println ("|   37   | \033[37m  blanco \033[39;49m |   97   | \033[97m blanco claro \033[39;49m  |");
	System.out.println ("|________|___________|________|_________________|");
	}
}
