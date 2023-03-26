package ArraysDeObjetos.TareaC9_3.Ej3Mascotas;



import ArraysDeObjetos.Ej1y2Gatos.Sexo;

public class Canario extends Ave{
  //Atributos de instancia//
  private String color;
  private boolean canta;

  //Constructor//
  public Canario(int código, String nombre, int edad, String fechaNacimiento, String sexo, String pico, boolean vuela, String color){
    super(código, nombre, edad, fechaNacimiento, sexo, pico, vuela);
    this.color=color;
    //Las hembras canario normalmente no cantan, son los machos los que lo hacen//
    if (this.getSexo()==Sexo.hembra){
      this.canta=false;
    } else {
      this.canta=true;
    }
    this.setTipo("Canario");
  }

  //Métodos//
  @Override
  public void muestra(){
    super.muestra();
    System.out.println("|         color         | " + this.color);
    System.out.println("|-----------------------|-----------------------");
    System.out.println("|     ¿Suele cantar?    | " + this.canta);
    System.out.println("|-----------------------|-----------------------");


  }
  @Override
  public void volar(){
    if (this.getVuela()==true){
      System.out.println("Estoy volando fiunnnn");
      System.out.println("               __         ");
      System.out.println("             _/ '>           ");
      System.out.println("      __ _.-'(   )'-._ __   ");
      System.out.println("      '=._.=-(  )-=._.='    ");
      System.out.println("             /||\\            ");
      System.out.println("            / ^^ \\        ");
      System.out.println("            `'``'`             ");
    } else {
      System.out.println(this.getNombre()+" no puede volar");
    }
  }
  @Override
  public void habla(){
    System.out.println("               __              ");  
    System.out.println("             _/ '<    pio pio!      ");  
    System.out.println("            / )  )                ");  
    System.out.println("           /_,' /              ");  
    System.out.println("             \\ /                ");  
    System.out.println("        =====m''m=====          ");  
  }
  @Override
  public void bajaMascota(){
    /* El método bajaMascota elimina la mascota del array estableciendo todos sus datos a 0 o vacíos
     * @ param void
     */
    super.bajaMascota();
    this.color="";
    this.canta=false;
  }

  //Getters//
  public String getColor(){
    return this.color;
  }
  public boolean getCanta(){
    return this.canta;
  }

}
