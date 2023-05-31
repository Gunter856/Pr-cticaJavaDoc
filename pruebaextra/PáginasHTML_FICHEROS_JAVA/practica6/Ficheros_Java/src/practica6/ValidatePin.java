package practica6;

import java.util.Scanner;
/**
 * Se valida el PIN que el usuario introduzca por el teclado
 * @author Iker Ortega
 *
 */
public class ValidatePin {

	/**
	 * Se solicita un PIN por teclado y se valida, dependiendo de si es correcto o no, se desplega un mensaje u otro.
	 * @param pin, El PIN que insertemos por teclado
	 */
    public static void main(String[] args) {
        
    	Scanner console = new Scanner(System.in);
    	
    	System.out.print("Introduce un PIN: ");
    	int pin = console.nextInt();
    	
    	int pinCheck = 9999;
    	
    	// Mientras que pin sea diferente del PIN correcto '9999', saltará el siguiente mensaje.
    	while (pin != pinCheck) {
    		System.out.println("Se ha introducido el pin " + pin + " y no es válido, introduce otro.");
    		System.out.println("Introduce un PIN: ");
    		pin = console.nextInt();
    	}
    	
        System.out.print("Se ha introducido el PIN " + pin + " correcto, ya puedes acceder a su cuenta.");
        console.close();

    }
    
}
