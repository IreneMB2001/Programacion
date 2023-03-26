package ArraysDeObjetos.TareaC9_3.Biblioteca_Funciones;
/* FuncionesArrays.java
 * Funciones específicas utilizadas para el ejercicio 3 de Mascotas
 * @Author Irene Martín
 */
import ArraysDeObjetos.TareaC9_3.Ej3Mascotas.*;
public class FuncionesArrays {
  public static int primeraPosicionCodigo(Mascota [] array){
    /* Según el array introducido la función devuelve la primera posición cuyo código se encuentre a 0.
     * @ param array del que se quiere averiguar la posción
     * @ return int i, el valor de la primera posición con código 0.
     */
    for (int i=0; i<=99; i++){
      if (array[i].getCódigo()==0){
        return i;
      }
    }
    return -1;
  }

  public static void listadoAnimales(Mascota [] array){
    /* Según la clase Mascota, muestra todos los animales registrados en el array cuyo código sea diferente a 0.
     * @ param array que se quiere mostrar
     */
    for (int i=0; i<=19; i++){
      if(array[i].getCódigo()!=0){
        System.out.println(array[i].getCódigo()+ ". " +array[i].getNombre());
      }
    }
  }
}