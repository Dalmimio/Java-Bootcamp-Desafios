package modulo19;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int factor1, factor2, producto=0;
		
		System.out.println("Ingrese Factor 1: ");
		factor1 = teclado.nextInt();
		
		System.out.println("Ingrese Factor 2: ");
		factor2 = teclado.nextInt();
		
		
		for(int i=0; i<factor1; i++) {
			producto+=factor2;
		}
		
		System.out.println("El producto es: "+ producto);
		System.out.println("Hola\nMundo");
	}

	

}
