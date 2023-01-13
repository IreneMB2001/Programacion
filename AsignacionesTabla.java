/*AsignacionesTabla.java
*Programa que te muestra en pantalla los valores de las variables a, b y c.
*@Irene Martín
*/

public class AsignacionesTabla {
	public static void main (String [] args) {
	int a;
	int b;
	int c;
	a=1;
	b=2;
	c=3;
	System.out.println ("Asignaciones valores a, b y c");
	System.out.println ("a= " + a + ", " + "b= " + b + ", " + "c= " + c);
	
	System.out.println ("Instruccion1");
	a=b;
	System.out.println ("a=b: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion2");
	c=a;
	System.out.println ("c=a: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion3");
	b=(a+b+c)/2;
	System.out.println ("b=(a+b+c)/2: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion4");
	a=a+c*2;
	System.out.println ("a=a+c*2: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion5");
	c=b-a;
	System.out.println ("c=b-a: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion6");
	a=b*c;
	System.out.println ("a=b*c: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion7");
	b=a+b*2;
	System.out.println ("b=a+b*2: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion8");
	c=c-2;
	System.out.println ("c=c-2: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion9");
	a=b;
	System.out.println ("a=b: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	
	System.out.println ("Instruccion10");
	c=a/b;
	System.out.println ("c=a/b: " + "a= " + a + " , "+ "b= "+ b + ", " + "c= " + c);
	} 
}
	
