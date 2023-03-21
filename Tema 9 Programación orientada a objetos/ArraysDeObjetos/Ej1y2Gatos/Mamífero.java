package ArraysDeObjetos.Ej1y2Gatos;
/* Mamífero.java
 * Subclase de "Animal" llamada "Mamífero", siendo una extensión de la clase principal
 * @Author Irene Martín
*/
public class Mamífero extends Animal {
    //Atributos//
    private String pelaje;  

    //Constructor//
    public Mamífero (String sexo, int edad, String pelaje) {
      super(sexo, edad); //hace una llamada a los atributos y métodos de la clase principal
      this.pelaje=pelaje;
    }
  
    //Métodos del Mamífero//
    public String getPelaje(){
      return this.pelaje;
    }
    
    @Override   
    public void desplazarse() {
      System.out.println("Soy un mamífero y me desplazo caminando");  
    }
    public void hacerSonido() {
      System.out.println("Soy un mamífero y hago un sonido");  
    }
    public void darDeMamar() {
      if (this.getSexo()==Sexo.macho) {
        System.out.println ("Soy un macho, las hembras son las que dan de mamar");
      } else {
        System.out.println("                                                   /\\ /\\");  
        System.out.println("toma mi querida cría, aquí tienes un poco de leche (*w*) ");  
        System.out.println("                                                    uu_)/ "); 
      }
    }
  
    //Setters//
    public void setPelaje(String pelaje) {
      this.pelaje=pelaje;
    }
  }
  
