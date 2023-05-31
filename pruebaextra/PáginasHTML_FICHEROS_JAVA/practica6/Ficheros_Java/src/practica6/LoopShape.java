package practica6;

public class LoopShape {
    
	/**
	 * Lo que hace el método es crear un rectangulo con almohadillas, dependiendo de la altura y ancho que le insertemos
	 * @param width, que es el ancho del rectángulo
	 * @param height, que es el alto del rectángulo
	 */
    static void createRectangle(int width, int height){
        
    	// Bucle for, imprime la primera línea horizontal
    	for (int i = 1 ; i <= width; i++) {
            System.out.print("#");
         }
    	
    	 System.out.println("");
    	
    	 // Líneas intermedias del triángulo, vamos restando 2 a la altura y ancho, dependiendo de la cantidad de espacios
        for (int i = 1; i <= (height - 2); i++) {
           	System.out.print("#");
           	for (int k = 1; k <= (width - 2); k++) {
	           	System.out.print(" ");
           	}
           	
	        System.out.print("#");
           	System.out.println("");
        }
        
    	// Bucle for, imprime la última línea horizontal
        for (int i = 1; i <= width; i++) {
            System.out.print("#");
         }
        
    }
    /**
	 * Lo que hace el método es crear un triángulo isósceles con almohadillas dependiendo del valor de la variable leg
	 * @param leg, longitud de los catetos
	 */
    static void createTriangle(int leg){
    	// Evitar formas inferiores o iguales a 1
    if (leg >= 1) {
       	System.out.println("");
       	System.out.println("");

       	System.out.println("#");
    }
       	
       	// Líneas intermedias del triángulo
       	for (int i = 1; i <= (leg - 2); i++) {
       		System.out.print("#");
       		for (int k = 1; k < i; k++) {
       			System.out.print(" ");
       		}
       		
       		System.out.print("#");
       		System.out.println(" ");
       	
       	}
       	
       	//Línea final del triángulo
       	for (int k = 1; k <= leg; k++) {
               System.out.print("#");
        }
    }}

