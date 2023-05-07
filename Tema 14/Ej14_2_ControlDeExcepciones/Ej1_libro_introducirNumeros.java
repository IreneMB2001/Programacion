/* Ej1_libro_introducirNumeros.java
 * Programa que pide 6 números por teclado e indica cual es el máximo
 * Si se introduce un dato que no pertenece al formato entero, el programa lo notificará y pedirá un nuevo dato
 * @author Irene Martín
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Ej1_libro_introducirNumeros{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        //Declaración de variables//
        int máximo = Integer.MIN_VALUE;
        ArrayList<Integer> números = new ArrayList<Integer>();

        System.out.println("\nVamos a introducir 6 números y a averiguar cuál es el máximo");
        System.out.println("------------------------------------------------------------");
        //Establecemos el bucle for para introducir 6 números exactos//
        for (int i = 1; i < 7; i++) {
            boolean datoCorrecto = false; //variable booleana para mantener en bucle el try-catch
            int numero = 0; //número introducido por teclado
            do {
                try {
                    System.out.print("Introduce el número " +i+ " --> ");
                    numero = Integer.parseInt(s.nextLine());
                    números.add(numero);
                    datoCorrecto = true; //si no hay error sale del bucle
                } catch (Exception e) {
                    System.out.println("O------------------------------------------------------------------- ");
                    System.out.println("| Has introducido un valor que no corresponde con el formato entero |");
                    System.out.println(" -------------------------------------------------------------------O");
                    System.out.println("Excepción: " + e.getClass());
                    System.out.println("Error: " + e.getMessage() +"\n");
                    System.out.print("Prueba otra vez con el formato indicado por favor\n");
                }
            } while (!datoCorrecto);
        }
        //Mostrar el resultado--------------------------------------------------//
        //Mostrar el contenido del ArrayList
        System.out.print("Los números introducidos son los siguientes: ");
        for(int num: números){
            //Muestra de los números uno a uno//
            System.out.print(num + ", ");
            //Establecemos el valor de máximo//
            if(num>máximo){
                máximo=num;
            }
        }
        //Mostrar cuál es el máximo de los números
        System.out.println();
        System.out.println("El valor máximo introducido es " + máximo);
    }
}