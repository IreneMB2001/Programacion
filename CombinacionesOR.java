/*CombinacionesOR.java
*Programa que te enseña todas las combinaciones posibles del operador OR.
*@Irene Martín
*/

public class CombinacionesOR {
	public static void main (String [] args) {
	int op1;
	int op2;
	int op3;
	op1=2;
	op2=7;
	op3=4;
	
	System.out.println ("True OR True: (2<7) OR (4>2)= " + ((op1<op2)||(op3>op1)));
	System.out.println ("True OR False: (7>4) OR (4<2)= " + ((op2>op3)|| (op3<op1)));
    System.out.println ("False OR True: (7<4) OR (2<4)= " + ((op2<op3)||(op1<op3)));
	System.out.println ("False OR False: (4>7) OR (2>7)= " + ((op3>op2)||(op1>op2)));

	} 
}
