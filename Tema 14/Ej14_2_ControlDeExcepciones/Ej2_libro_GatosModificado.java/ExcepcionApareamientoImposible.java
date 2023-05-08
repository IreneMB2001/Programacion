/* ExcepcionApareamientoImposible.java
 * Creación de la excepción para el apareamiento imposible en la clase Gato
 * @author Irene Martín
 */
public class ExcepcionApareamientoImposible extends Exception{
  public ExcepcionApareamientoImposible(){
    System.out.println("Los gatos pertenecen al mismo sexo, no pueden aparearse!");
  }
}
