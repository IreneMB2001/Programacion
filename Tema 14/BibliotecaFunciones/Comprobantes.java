package BibliotecaFunciones;

public class Comprobantes {

public static boolean isNumeric (String str){
    // comprueba si la cadena es un número
        return str != null && str.matches("[0-9.]+");
}

}
