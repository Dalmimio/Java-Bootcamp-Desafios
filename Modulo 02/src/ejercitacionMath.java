import java.util.Random;
import java.util.Scanner;

public class ejercitacionMath {

	public static void main(String[] args) {
		
		//EJERCICIO 1
		System.out.println("Color RGB generado aleatoriamente:");
		
		int r = (int) (Math.random() * (255 - 0 + 1)) + 0;
		int g = (int) (Math.random() * (255 - 0 + 1)) + 0;
		int b = (int) (Math.random() * (255 - 0 + 1)) + 0;
		
		System.out.println("Color RGB: " + r + ", " + g + ", " + b);
		
		//EJERCICIO2
		System.out.println("Ingrese una palabra: ");
		Scanner teclado = new Scanner (System.in);
		
		String palabra;
		palabra = teclado.nextLine();
		
		char aleatorio = (char) (Math.random()* (122 - 97) + 97);
		
		System.out.println("El numero aleatorio representa la letra: " + aleatorio);
		
		
		if (palabra.indexOf(aleatorio) == (-1)) {
			System.out.println("La palabra no contiene " + aleatorio);
		}else {
			System.out.println("La palabra contiene " + aleatorio);
		}
		
		
		
		
		}
		
		
}

