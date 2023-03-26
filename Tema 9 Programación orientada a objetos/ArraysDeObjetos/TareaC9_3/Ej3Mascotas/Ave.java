package ArraysDeObjetos.TareaC9_3.Ej3Mascotas;



public abstract class Ave extends Mascota {

  //Atributos de instancia//
  private String pico;
  private boolean vuela;

  //Constructor//
  public Ave(int código, String nombre, int edad, String fechaNacimiento, String sexo, String pico, boolean vuela){
    super(código, nombre, edad, fechaNacimiento, sexo);
    this.pico=pico;
    this.vuela=vuela;
  }

  //Métodos//
  @Override
  public void muestra(){
    super.muestra();
    System.out.println("|         pico          | " + this.pico);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|     ¿Puede volar?     | " + this.vuela);
    System.out.println("|-----------------------|-----------------------");
  }

  public void volar(){
    System.out.println("Estoy volando fiunnnn");
  }

  @Override
  public void bajaMascota(){
    /* El método bajaArtículo elimina el artículo del array estableciendo todos sus datos a 0 o vacíos
     * @ param void
     */
    super.bajaMascota();
    this.pico="";
    this.vuela=false;
  }


  //Getters//
  public String getPico(){
    return this.pico;
  }
  public boolean getVuela(){
    return this.vuela;
  }

  //setters//
  public void setPico(String pico){
    this.pico=pico;
  }
  public void setVuela(boolean vuela){
    this.vuela=vuela;
  }
}
