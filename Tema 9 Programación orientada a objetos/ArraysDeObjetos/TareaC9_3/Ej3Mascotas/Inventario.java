package ArraysDeObjetos.TareaC9_3.Ej3Mascotas;
/* Inventario.java
 * Programa "Inventario" para la gestión de una tienda de animales.
 * Se probarán los diferentes métodos y atributos de la clase Mascota y sus subclases por medio de un menu
 * de opciones.
 * @Author Irene Martín
 */
import java.util.Scanner;
import ArraysDeObjetos.TareaC9_3.Biblioteca_Funciones.*;
public class Inventario {
  public static void main (String [] args) {
    Scanner s = new Scanner(System.in);

    //Creación del Array mascota//
    Mascota[] mascota = new Mascota[20];

    //ponemos todas las mascotas a 0 (como mascota es abstracta se utiliza por ejemplo Gato)
    for(int i=0; i<=19; i++){
      mascota[i]= new Gato(0, "", 0, "", "", "", false);
    }

    //Insertar las mascotas principales en el inventario//
    mascota[0]= new Canario(1111, "Piolina", 2, "19-04-2021", "hembra", "blanco", true, "amarillo");
    mascota[1] = new Loro(2222, "Blue", 3, "18-03-2020", "macho", "naranja", false, "Río de Janeiro", false);
    mascota[2] = new Perro(3333, "Nymeria", 5, "20-12-2018", "hembra", "Husky Siberiano", false);
    mascota[3] = new Gato(4444, "Velvet", 4, "09-05-2019", "hembra", "negro", false);
    
    //Variables//
    int respuesta=0;
    int elección;
    boolean si;
    boolean puede;
    int posición;
    
    //Menu de opciones del Inventario//
    while (respuesta!=8) {
      System.out.println("\nINVENTARIO DE MASCOTAS");
      System.out.println("------------------------");
      System.out.println("Elige una de las siguientes opciones (1-7)");
      System.out.println("----------------------------------------------");
      System.out.println("1. Lista de mascotas disponibles");
      System.out.println("2. Mostrar datos de una mascota");
      System.out.println("3. Mostrar datos de todas las mascotas");
      System.out.println("4. Insertar mascota en el inventario");
      System.out.println("5. Eliminar mascota del inventario");
      System.out.println("6. Vaciar inventario");
      System.out.println("7. Acciones de las mascotas");
      System.out.println("8. Salir");
      System.out.println("----------------------------------------------");
      System.out.print("Respuesta --> ");
      respuesta=s.nextInt();
      System.out.println();

      switch(respuesta){
        //----------------------------Lista de mascotas disponibles//
        case 1:
          System.out.println("NÚMERO DE MASCOTAS TOTALES = " +Mascota.getNumMascotas());
          System.out.println("|-------------------------------------------|");
          System.out.printf("| %-19s | %-19s | \n" , "Tipo", "Nombre");
          System.out.println("|===========================================|");
          for(int i=0; i<=19; i++){
            if(mascota[i].getCódigo()!=0){ //solo se mostrarán los artículos que no estén a 0//
              System.out.printf("| %-19s | %-19s | \n" , mascota[i].getTipo(), mascota[i].getNombre());
              System.out.println("|---------------------|---------------------|");
            } 
          }
          break;

        //-----------------------------Mostrar datos de una mascota//
        case 2:
          System.out.println("Indica de qué mascota quieres mostrar sus datos (Seleccione el código)");
          System.out.println("------------------------------------------");
          FuncionesArrays.listadoAnimales(mascota);
          System.out.println("------------------------------------------");
          System.out.print("elección --> ");
          elección=s.nextInt();

          for (int i=0; i<=19; i++) {
            if (elección==mascota[i].getCódigo()){
              mascota[i].muestra();
            }
          }
          System.out.println();
          break;

        //-----------------------------Mostrar todos los datos de todas las mascotas//
        case 3:
          for (int i=0; i<=19; i++) {
            if (mascota[i].getCódigo()!=0){
              mascota[i].muestra();
              System.out.println();
            }
          }
          
          break;
        //-----------------------------Insertar mascota en el inventario//
        case 4:
          System.out.println("Vamos a registrar a una nueva mascota, para ello selecciona el tipo de animal (1-4)");
          System.out.println("------------------------------------------");
          System.out.println("1. Gato");
          System.out.println("2. Perro");
          System.out.println("3. Loro");
          System.out.println("4. Canario");
          System.out.println("------------------------------------------");
          System.out.print("elección --> ");
          int tipo=s.nextInt();
          System.out.println();
          
          //Según el animal elegido se creará un objeto diferente//
          switch(tipo){
            case 1: //----------------------------------------------------------Gato//
              System.out.println("Ahora introduzca los datos del gato");
              System.out.print("código --> ");
              int códigoGato=s.nextInt();
              System.out.print("Nombre --> ");
              String nombreGato=System.console().readLine();
              System.out.print("Edad --> ");
              int edadGato=s.nextInt();
              System.out.print("Fecha de nacimiento --> ");
              String fechaNacimientoGato=System.console().readLine();
              System.out.print("Sexo --> ");
              String sexoGato=System.console().readLine();
              System.out.print("Color del pelaje --> ");
              String colorGato=System.console().readLine();
              System.out.print("¿Tiene el pelo largo? --> ");
              String peloLargo=System.console().readLine();
              if (peloLargo=="si"){
                si=true;
              } else {
                si=false;
              }

              //Buscamos la primera posición del Array que tenga el código 0, la cual sería la primera posición disponible//
              posición= FuncionesArrays.primeraPosicionCodigo(mascota); 
              if(posición<0){
                System.out.println("Lo siento, no queda espacio disponible en el inventario");
              }

              //Creación de la nueva mascota//
              mascota[posición] = new Gato(códigoGato, nombreGato, edadGato, fechaNacimientoGato, sexoGato, colorGato, si);
              break;

            case 2: //----------------------------------------------------------Perro//
              System.out.println("Ahora introduzca los datos del perro");
              System.out.print("código --> ");
              int códigoPerro=s.nextInt();
              System.out.print("Nombre --> ");
              String nombreP=System.console().readLine();
              System.out.print("Edad --> ");
              int edadP=s.nextInt();
              System.out.print("Fecha de nacimiento --> ");
              String fechaNacimientoP=System.console().readLine();
              System.out.print("Sexo --> ");
              String sexoP=System.console().readLine();
              System.out.print("Raza --> ");
              String raza=System.console().readLine();
              System.out.print("¿Tiene pulgas? --> ");
              String pulgas=System.console().readLine();
              if (pulgas=="si"){
                si=true;
              } else {
                si=false;
              }

              //Buscamos la primera posición del Array que tenga el código 0, la cual sería la primera posición disponible//
              posición=FuncionesArrays.primeraPosicionCodigo(mascota); 
              if(posición<0){
                System.out.println("Lo siento, no queda espacio disponible en el inventario");
              }

              //Creación de la nueva mascota//
              mascota[posición] = new Perro(códigoPerro, nombreP, edadP, fechaNacimientoP, sexoP, raza, si);
              break;

            case 3: //----------------------------------------------------------Loro//
              System.out.println("Ahora introduzca los datos del Loro");
              System.out.print("código --> ");
              int códigoL=s.nextInt();
              System.out.print("Nombre --> ");
              String nombreL=System.console().readLine();
              System.out.print("Edad --> ");
              int edadL=s.nextInt();
              System.out.print("Fecha de nacimiento --> ");
              String fechaNacimientoL=System.console().readLine();
              System.out.print("Sexo --> ");
              String sexoL=System.console().readLine();
              System.out.print("Tipo de pico --> ");
              String picoL=System.console().readLine();
              System.out.print("¿Puede volar? --> ");
              String vuela=System.console().readLine();
              if (vuela=="si"){
                puede=true;
              } else {
                puede=false;
              }
              System.out.print("Origen --> ");
              String origen=System.console().readLine();
              System.out.print("¿Puede imitar el habla? --> ");
              String habla=System.console().readLine();
              if (habla=="si"){
                si=true;
              } else {
                si=false;
              }

              //Buscamos la primera posición del Array que tenga el código 0, la cual sería la primera posición disponible//
              posición=FuncionesArrays.primeraPosicionCodigo(mascota); 
              if(posición<0){
                System.out.println("Lo siento, no queda espacio disponible en el inventario");
              }

              //Creación de la nueva mascota//
              mascota[posición] = new Loro(códigoL, nombreL, edadL, fechaNacimientoL, sexoL, picoL, puede, origen, si);
              break;
            case 4: //----------------------------------------------------------Canario//
            System.out.println("Ahora introduzca los datos del Canario");
              System.out.print("código --> ");
              int códigoC=s.nextInt();
              System.out.print("Nombre --> ");
              String nombreC=System.console().readLine();
              System.out.print("Edad --> ");
              int edadC=s.nextInt();
              System.out.print("Fecha de nacimiento --> ");
              String fechaNacimientoC=System.console().readLine();
              System.out.print("Sexo --> ");
              String sexoC=System.console().readLine();
              System.out.print("Tipo de pico --> ");
              String picoC=System.console().readLine();
              System.out.print("¿Puede volar? --> ");
              String vuelaC=System.console().readLine();
              if (vuelaC=="si"){
                puede=true;
              } else {
                puede=false;
              }
              System.out.print("Color --> ");
              String color=System.console().readLine();

              //Buscamos la primera posición del Array que tenga el código 0, la cual sería la primera posición disponible//
              posición=FuncionesArrays.primeraPosicionCodigo(mascota); 
              if(posición<0){
                System.out.println("Lo siento, no queda espacio disponible en el inventario");
              }

              //Creación de la nueva mascota//
              mascota[posición] = new Canario(códigoC, nombreC, edadC, fechaNacimientoC, sexoC, picoC, puede, color);
            break;
          }
          break;

        //-----------------------------Eliminar mascota del inventario//
        case 5:
          System.out.println("Vamos a eliminar a una mascota: Indica qué mascota quieres eliminar");
          System.out.println("------------------------------------------");
          //Mostrar los animales disponibles//
          FuncionesArrays.listadoAnimales(mascota);
          System.out.println("------------------------------------------");
          System.out.print("elección --> ");
          elección=s.nextInt();
          
          //Según el código elegido se procede a la baja de la mascota//
          for (int i=0; i<=19; i++) {
            if (elección==mascota[i].getCódigo()){
              mascota[i].bajaMascota();
            }
          }
          System.out.println();
          break;
        //-----------------------------Vaciar inventario//
        case 6:
        System.out.print("Se va a proceder a vaciar el inventario. ¿Seguro que quieres continuar? --> ");
        String respuesta2=System.console().readLine();
        if (respuesta2.equals("si")){
          for (int i=0; i<=19; i++){
            if(mascota[i].getCódigo()!=0){
              mascota[i].bajaMascota();
            }
          }
          System.out.println("El inventario ha sido vaciado");
        } else {
          System.out.println("El inventario no ha sido vaciado");
        }
        break;
        case 7:
        System.out.println("Los animales pueden realizar las siguientes acciones. Elige una de ellas (1-3)");
        System.out.println("1. Celebrar cumpleaños");
        System.out.println("2. morir");
        System.out.println("3. hablar");
        System.out.println("4. Saludar (sólo los loros)");
        System.out.println("5. volar   (sólo las aves)");
        System.out.println("----------------------------------------------");
        System.out.print("Respuesta --> ");
        int respuesta3=s.nextInt();

        switch(respuesta3){
          case 1: //-------------------------------------------------Cumpleaños//
            System.out.println("¿Cuál de los animales va a cumplir años?");
            //Mostrar animales disponibles//
            FuncionesArrays.listadoAnimales(mascota);
            System.out.println("------------------------------------------");
            System.out.print("elección --> ");
            elección=s.nextInt();

            //Realizar la acción según el código del animal//
            for (int i=0; i<=19; i++) {
              if (elección==mascota[i].getCódigo()){
                mascota[i].cumpleaños();
              }
            }
            System.out.println();
            break;

          case 2: //-------------------------------------------------Morir//
            System.out.println("¿Cuál de los animales va a morir?");
            //Mostrar animales disponibles//
            FuncionesArrays.listadoAnimales(mascota);
            System.out.println("------------------------------------------");
            System.out.print("elección --> ");
            elección=s.nextInt();

            //Realizar la acción según el código del animal//
            for (int i=0; i<=19; i++) {
              if (elección==mascota[i].getCódigo()){
                mascota[i].morir();
              }
            }
            System.out.println();
            break;

          case 3: //-------------------------------------------------Hablar//
            System.out.println("¿Cuál de los animales va a hablar?");
            //Mostrar animales disponibles//
            FuncionesArrays.listadoAnimales(mascota);
            System.out.println("------------------------------------------");
            System.out.print("elección --> ");
            elección=s.nextInt();

            //Realizar la acción según el código del animal//
            for (int i=0; i<=19; i++) {
              if (elección==mascota[i].getCódigo()){
                mascota[i].habla();
              }
            }
            System.out.println();
            break;

          case 4: //-------------------------------------------------Saludar//
            System.out.println("¿Cuál de los loros va a saludar?");
            //Mostrar animales disponibles (en este caso sólo los loros)//
            for (int i=0; i<=19; i++) {
              if ((mascota[i].getCódigo()!=0)||(mascota[i].getTipo()=="Loro")){
                System.out.println(mascota[i].getCódigo()+ ". " +mascota[i].getNombre());
              }
            }
            System.out.println("------------------------------------------");
            System.out.print("elección --> ");
            elección=s.nextInt();

            //Realizar la acción según el código del animal//
            for (int i=0; i<=19; i++) {
              if (elección==mascota[i].getCódigo()){
                ((Loro) mascota[i]).saluda();
              }
            }
            System.out.println();
            break;
          case 5: //-------------------------------------------------Volar//
            System.out.println("¿Cuál de las aves va a volar?");
            //Mostrar animales disponibles (en este caso sólo las aves)//
            for (int i=0; i<=19; i++) {
              if ((mascota[i].getCódigo()!=0)&&((mascota[i].getTipo()=="Loro")||(mascota[i].getTipo()=="Canario"))){
                System.out.println(mascota[i].getCódigo()+ ". " +mascota[i].getNombre());
              }
            }
            System.out.println("------------------------------------------");
            System.out.print("elección --> ");
            elección=s.nextInt();

            //Realizar la acción según el código del animal//
            for (int i=0; i<=19; i++) {
              if (elección==mascota[i].getCódigo()&&(mascota[i].getTipo()=="Loro")){
                ((Loro) mascota[i]).volar();
              } else if (elección==mascota[i].getCódigo()&&(mascota[i].getTipo()=="Canario")){
                ((Canario) mascota[i]).volar();
              }
            }
            System.out.println();
            break;
          default:
        }
      }
    }
  }
}
