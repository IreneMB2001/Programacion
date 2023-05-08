
/* Gato.java
 * Subclase de "Mamífero" llamada "Gato"
 * Se añade el método comer, en el cual se introducirá el número de sardinas que se le quiere dar de comer al gato
 * Se añade un nuevo atributo de la clase llamado "sardinasTotales" que recoge la cantidad total de sardinas que tenemos
 * 
 * Se ha añadido un nuevo método apareaCon para que se apareen los gatos de diferente sexo,
 * En el caso contrario lanza una excepción creada exclusivamente para dicho método.
 * @author Irene Martín
 */
public class Gato extends Mamífero {
  //Atributos de la clase//
  private static int sardinasTotales = 10;

  //Atributos de instancia//
  private String personalidad;
  private String nombre;
  private String raza;  
    
  //Constructor//
  public Gato(String nombre, String sexo, int edad, String pelaje, String raza, String personalidad) {
    super(sexo, edad, pelaje);
    this.personalidad=personalidad;
    this.nombre=nombre;
    this.raza=raza;
  }
    
  //Métodos//
  @Override
  public void hacerSonido() {
    System.out.println("                               /\\  /\\");  
    System.out.println("Soy un gatito y hago miauuuu  (=* T *=)");  
  }
  @Override
  public void comer(int numSardinas) {
    /* Método "comer" que según un número determinado de sardinas imprime "ñam ñam" el mismo número de veces
     * Una vez se acaben las sardinas, se imprimirá un mensaje diciendo que ya no quedan sardinas
     */
    System.out.print(getNombre() + ": ");
    for(int i=1;i<=numSardinas; i++){
      if(Gato.sardinasTotales>0){
        System.out.print("Ñam...");
        Gato.sardinasTotales--;
      } else if (Gato.sardinasTotales==0) {
        System.out.println("ya no quedan sardinas :(");
        Gato.sardinasTotales--;
      } else {
      }
    }
    System.out.println();
  }

  public void ronronear() {
    System.out.println("                      /\\   /\\");  
    System.out.println(" purrrr purr purrrr  (=^ T ^=)");  
  }
  public void escalar() {
    System.out.println("Soy un gatito intrépido al que le encanta escalar");  
    System.out.println("                              @@@@ "); 
    System.out.println("                            @@@@@@@@");  
    System.out.println("                          @@@@@@@@@@@@");  
    System.out.println("                           @@@@@@@@@@");  
    System.out.println("                      /\\   /\\ @@@@");  
    System.out.println("                     (=* T *=)|  |");  
    System.out.println("                   (  |     |D|  |");  
    System.out.println("                    \\ (_____|D|  |");  
    System.out.println("                              |  |");  
    System.out.println("                              |  |");  
    System.out.println("                             _|__|_");  
  }
  public String toString(){
    if (this.getSexo()==Sexo.macho) {
    return "Hola me llamo " +this.nombre+ ", soy un gatito de raza " +this.raza+ " con pelaje " +this.getPelaje()+ 
    ". Tengo " +this.getEdad()+ " añitos y soy " +this.personalidad;
    } else {
      return "Hola me llamo " +this.nombre+ ", soy una gatita de raza " +this.raza+ " con pelaje " +this.getPelaje()+ 
      ". Tengo " +this.getEdad()+ " añitos y soy " +this.personalidad;
    }
  }
  public void apareaCon(Gato gato) throws ExcepcionApareamientoImposible{
    if (this.getSexo()==gato.getSexo()){
      throw new ExcepcionApareamientoImposible();
    } else {
      if(this.getSexo()==Sexo.hembra){
        System.out.println("Los gatos se han apareado. Ahora " + this.nombre + " está embarazada :)\n");
      } else {
        System.out.println("Los gatos se han apareado. Ahora " + gato.getNombre() + " está embarazada :)\n");
      }
    }
  }


  //Getters//
  public String getNombre(){
    return this.nombre;
  }
  public static int getSardinasTotales(){
    return Gato.sardinasTotales;
  }
  //Setters//
  public void setPersonalidad(String personalidad) {
    this.personalidad=personalidad;
  }

  public void setNombre(String nombre) {
    this.nombre=nombre;
  }
  public void setRaza(String raza) {
    this.raza=raza;
  }
}
  