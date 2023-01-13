/*AreaRectanguloLeido.java
*Programa que muestra en pantalla el area de un rectangulo introduciendo los datos por teclado.
*@Irene Martin
*/

public class AreaRectanguloLeido {
  public static void main (String [] args) {
    String linea;
    System.out.print (" Vamos a calcular el area de un rectangulo, para ello dame su base: ");
    linea= System.console().readLine();
    double base;
    base= Double.parseDouble( linea );
		
    System.out.print (" Ahora dame su altura: ");
    linea= System.console().readLine();
    double altura;
    altura= Double.parseDouble( linea );
		
    System.out.print ("\n");
		
    double area;
    area= base*altura;
    System.out.print (" El area del rectangulo es de: " + area);
	
	}
}
