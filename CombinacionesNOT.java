/*CombinacionesNOT.java
*Programa que te enseña los resultados del operador NOT para los valores true y false.
*@Irene Martín
*/

public class CombinacionesNOT {
	public static void main (String [] args) {
	int op1;
	int op2;
	int op3;
	op1=1;
	op2=5;
	op3=4;
	
	System.out.println ("NOT True: NOT(4>1)= " + !(op3>op1));
	System.out.println ("NOT False: NOT(5<4)= " + !(op2<op3));

	} 
}
