package ArraysDeObjetos.Ej5GestiónAlmacén;
/* FuncionesArrays.java
 * Funciones específicas utilizadas para el ejercicio 5
 * @Author Irene
 */
import ArraysDeObjetos.Ej5GestiónAlmacén.*;
public class FuncionesArrays {
  public static int primeraPosicionCodigo(Artículo [] array){
    /* Según el array introducido la función devuelve la primera posición cuyo código se encuentre a 0.
     * @ param array del que se quiere averiguar la posción
     * @ return int i, el valor de la primera posición con código 0.
     */
    for (int i=0; i<=99; i++){
      if (array[i].getCodArticulo()==0){
        return i;
      }
    }
    return -1;
  }
}
