package ArraysDeObjetos.TareaC9_3.Ej3Mascotas;

public class Gato extends Mascota{
  //Atributos de la clase//
  private static int numGatos = 0;

  //Atributos de instancia//
  private String color;
  private boolean peloLargo;

  //Constructor//
  public Gato(int código, String nombre, int edad, String fechaNacimiento, String sexo, String color, boolean peloLargo){
    super(código, nombre, edad, fechaNacimiento, sexo);
    this.color=color;
    this.peloLargo=peloLargo;
    this.setTipo("Gato");
    numGatos++;
  }

  //Métodos//
  @Override
  public void muestra(){
    super.muestra();
    System.out.println("|         color         | " + this.color);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|   ¿Tiene pelo largo?  | " + this.peloLargo);
    System.out.println("|-----------------------|-----------------------");


  }
  @Override
  public void habla(){
    System.out.println("                               /\\  /\\");  
    System.out.println("Soy un gatito y hago miauuuu  (=* T *=)");
  }

  @Override
  public void bajaMascota(){
    /* El método bajaArtículo elimina el artículo del array estableciendo todos sus datos a 0 o vacíos
     * @ param void
     */
    super.bajaMascota();
    this.color="";
    this.peloLargo=false;
  }

  //Getters//
  public String getColor(){
    return this.color;
  }
  public boolean getPeloLargo(){
    return this.peloLargo;
  }
  public static int getNumGatos(){
    return Gato.numGatos;
  }

  //setters//
  public void setColor(String color){
    this.color=color;
  }
  public void setPeloLargo(boolean peloLargo){
    this.peloLargo=peloLargo;
  }  
}
