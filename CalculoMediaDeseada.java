import java.util.Scanner; //declaramos el Scanner//
/*CalculoMediaDeseada.java
*Programa que calcula cuanto se debe obtener en el segundo examen de la asignatura para conseguir la media deseada.
*@Irene Martin
*/

public class CalculoMediaDeseada {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in); //creamos el objeto Scanner y quedará abreviado con una s.//
    
    System.out.print ("\n"); //Salto de linea para que el texto no quede pegado hacia arriba de la ventana.//
    
    System.out.print (" Introduce la nota del primer examen: ");
    double nota1= s.nextDouble(); //variable double que almacena la nota leida del primer examen.//
    
    System.out.print (" Que nota quieres sacar en el primer trimestre?: ");
    double notaTrimestre= s.nextDouble(); //variable double que almacena la nota deseada del trimestre.//
    
    double porcentaje1= nota1*0.40; //El primer examen cuenta un 40% de la nota, por eso se multiplica por 0,40.//
    double nota2= (notaTrimestre-porcentaje1)/0.60;  
    //La nota deseada se resta con el porcentaje del primer examen y se divide entre 0,60 porque el segundo examen cuenta un 60%.//
    
    System.out.println (" Para tener un " +notaTrimestre+ " en el trimestre necesitas sacar un " +nota2+ " en el segundo examen.");
    //Se imprime el resultado de la nota del segundo examen para obtener la media deseada del trimestre.//
    
  }
}
