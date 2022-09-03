package modulo19;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1EnterosAleatorios {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		int numerosAleatorios[];
				
		
		System.out.println("Ingrese la cantidad de valores: ");
		cantidad = teclado.nextInt();
		
		numerosAleatorios = new int[cantidad];
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			numerosAleatorios[i]=(int) (Math.random()*cantidad+1);
		}
		
		System.out.println(Arrays.toString(numerosAleatorios));
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			int numero=numerosAleatorios[i];
			boolean divisible3 = numero%3==0;
			boolean divisible5 = numero%5==0;
			String resultado = "";
			
			if(divisible3) {
				resultado="Fizz";
			}
			if(divisible5) {
				resultado="Buzz";
			}
			
			if(divisible3 && divisible5) {
				resultado="FizzBuzz";
			}
			System.out.println(resultado.length()>0?resultado : numero);
			
		}
		teclado.close();
		
	}
}
