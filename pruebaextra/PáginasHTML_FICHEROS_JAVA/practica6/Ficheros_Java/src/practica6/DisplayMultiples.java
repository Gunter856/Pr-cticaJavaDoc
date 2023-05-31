package practica6;

import java.util.Scanner;
/**
 * Esta clase muestra los múltiplos del número que insertemos
 * @author Iker Ortega
 *
 */
public class DisplayMultiples {
	/**
	 * Se solicita un número al usuario con el scanner y muestra los múltiplos de ese número.
	 * @param num, Serán los que insertemos por teclado
	 */
    public static void main(String args[]) {
    	
       Scanner console = new Scanner(System.in);
       System.out.println("Elija un numero: ");
       int num = console.nextInt();
       for ( int i = 1; i <= 12; i++) {
       	System.out.println(num + "x" + i + "= " + num * i);
         
       }
       console.close();
    }

}
