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
    if (this.vuela==true){
      System.out.println("Estoy volando fiunnnn");
    } else {
      System.out.println(this.getNombre()+" no puede volar");
    }
  }

  @Override
  public void bajaMascota(){
    /* El método bajaMascota elimina la mascota del array estableciendo todos sus datos a 0 o vacíos
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
}
