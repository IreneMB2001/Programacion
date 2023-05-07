/* Ej3_libro_lanzarExcepcion.java
 * Este programa genera una excepción de forma aleatoria entre las siguientes
 * NumberFormatException, IndexOutOfBoundsException, ArithmeticException, IOException y FileNotFoundException
 * @author Irene Martín
 */
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ej3_libro_lanzarExcepcion {
    public static void main (String [] args){

        System.out.println("\n Se va a proceder a lanzar una excepción aleatoria");
        System.out.println("--------------------------------------------------");
        //Creamos un número aleatorio del 1 al 5//
        int indexAleatorio=(int)(Math.random() * 5 + 1);

        //Con un switch, según el número aleatorio mostramos una determinada excepción//
        switch (indexAleatorio){
            case 1:
                try {
                    throw new NumberFormatException();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    throw new IndexOutOfBoundsException();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    throw new ArithmeticException();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    throw new IOException();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                try {
                    throw new FileNotFoundException();
                } catch (Exception e) {
                    e.printStackTrace();
                } 
                break;
        }
    }
}
