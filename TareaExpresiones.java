/*TareaExpresiones.java
*Programa que te muestra en pantalla el resultado de las expresiones que se muestran a continuacion.
*@Irene Martín
*/

public class TareaExpresiones {
	public static void main (String [] args) {
	int entero1;
	int entero2;
	entero1=5;
	entero2=7;
	System.out.println (" Tarea de expresiones");
	System.out.println (" Expresion A");
	boolean a;
	a= (entero1>5)&&(entero2+3<10);
	System.out.println ("(entero1>5) AND (entero2 + 3 < 10)= " + a);
	
	System.out.println (" Expresion B");
	boolean b;
	b=(10!=entero1+5)||(20>(entero2+5)*entero1+5);
	System.out.println ("(10<>entero1+5) OR (20>(entero2+5)*entero1+5)= " + b);
	
	System.out.println (" Expresion C");
	int c;
	c=entero1*entero2+10+4/2-2*4+2;
	System.out.println (" entero1 * entero2 + 10 + 4/2 - 2*4 +2= " + c);
	
	System.out.println (" Expresion D");
	boolean d;
	d=(10/2-1==entero1)&&(20>entero2+13);
	System.out.println ("(10/2-1=entero1) AND (20>entero2+13)= " + d);
	
	System.out.println (" Expresion E");
	boolean e;
	e=5-2>4&&!(5==25/5);
	System.out.println (" 5-2>4 AND NOT5==25/5= " + e);
	
	System.out.println (" Expresion F");
	boolean f;
	f= 'J'=='J'||'S'=='s';
	System.out.println ("'J'=='J' OR 'S'=='s'= " + f);
	
	System.out.println (" Expresion G");
	boolean g;
	g=4*2<=8||2*2<5&&4>3+1;
	System.out.println ("4*2<=8 OR 2*2<5 AND 4>3+1= " + g);
	
	System.out.println (" Expresion H");
	boolean h;
	h=10+4<15-3||2*5+1>14-2*2;
	System.out.println ("10+4<15-3 OR 2*5+1>14-2*2= " + h);
	
	
	
	} 
}
	
	
