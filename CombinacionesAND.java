/*CombinacionesAND.java
*Programa que te enseña todas las combinaciones posibles del operador AND.
*@Irene Martín
*/

public class CombinacionesAND {
	public static void main (String [] args) {
	int op1;
	int op2;
	int op3;
	op1=4;
	op2=6;
	op3=5;
	
	System.out.println ("True AND True: (4<6) AND (5>4)= " + ((op1<op2)&&(op3>op1)));
	System.out.println ("True AND False: (4<6) AND (4>5)= " + ((op1<op2)&&(op1>op3)));
    System.out.println ("False AND True: (5>6) AND (4<5)= " + ((op3>op2)&&(op1<op3)));
	System.out.println ("False AND False: (6<4) AND (4>5)= " + ((op2<op1)&&(op1>op3)));

	} 
}
