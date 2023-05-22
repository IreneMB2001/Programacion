/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Irene Martín Barea
 */
public class Gato {
    //atributos
    private String nombre;
    private String imagen;
    private String bocadillo;
    //Constructor
    public Gato(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }
    //Métodos
    public String getNombre() {
        return nombre;
    }
    public String getImagen() {
        return imagen;
    }
    public String getBocadillo(){
        return bocadillo;
    }
    public void setBocadillo(String bocadillo){
        this.bocadillo=bocadillo;
    }
    @Override
    public String toString() {
        return "<img src='" + imagen + "' width='130'><div class='"+bocadillo+"'><br><br><p class=\"nombre\">"+nombre+"</p><p class='contenido'>Hola, soy " + nombre + "</p></div><br>";
    }
}

