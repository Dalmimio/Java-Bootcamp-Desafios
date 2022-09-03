import java.text.DecimalFormat;
import java.util.Scanner;

public class desafios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DESAFIO 1
		/*generar un programa que permita al usuario ingresar 
		por consola en la misma línea el primer nombre y 
		primer apellido y realice las siguientes operaciones:
		1. Mostrar el nombre y apellido por separado.
		2. Mostrar las iniciales en mayúsculas*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su primer nombre y primer apellido: ");
		
		String nomYApe;
		nomYApe = teclado.nextLine();
		
		int largo = nomYApe.length();
		int indice = nomYApe.indexOf(" ");
		
		System.out.println("Largo del nom y apellido: " + largo);
		System.out.println("indice donde se encuentra el espacio: " + indice);
		
		String nombre = nomYApe.substring(0,indice);
		String apellido = nomYApe.substring(indice+1,largo);
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apeliido: " + apellido);
		
		// DESAFIO 2
		/*
		Realizar un programa que permita al usuario ingresar 
		por consola dos números y realice las siguientes 
		operaciones:
		1. El usuario debe poder ingresar la cantidad de 
		decimales que desea ver en el resultado.
		2. Sacar la potencia de los números ingresados*/
		
		int cantidadDecimales;
		float base, exponente;
		double resultado;
		
		System.out.print("Indique un numero base: ");
		base = teclado.nextFloat();
		
		System.out.print("Indique un numero exponente: ");
		exponente = teclado.nextFloat();

		System.out.print("Indique cuantos decimales quiere mostrar: ");
		cantidadDecimales = teclado.nextInt();

		resultado = Math.pow(base, exponente);
		System.out.println(String.format("La potencia con " + cantidadDecimales + " decimales: %." + cantidadDecimales + "f ", resultado));
		
		
		
		
	
		
		
		
		
		// DESAFIO 3
		/*
 		Se pide que ingrese por consola dos letras y realice
		la siguiente operación:
		1. Mostrar la representación ASCII de las letras en 
		minúsculas y mayúsculas
		*/
		String letra1;
		String letra2;
		char Num1, Num2;
		int ascii1, ascii2;
		
		System.out.println("Ingrese una letra: ");
		letra1 = teclado.next();
		
		System.out.println("Ingrese otra letra: ");
		letra2 = teclado.next();
		
		Num1 = letra1.toLowerCase().charAt(0);
		ascii1 = Num1;
		Num2 = letra2.toLowerCase().charAt(0);
		ascii2=Num2;
		System.out.println("Valor en minuscula de " + letra1+ ": " + ascii1);
		System.out.println("Valor en minuscula de " + letra2+ ": " + ascii2);
		
		System.out.println("Valor en mayuscula: ");
		Num1 = letra1.toUpperCase().charAt(0);
		ascii1 = Num1;
		Num2 = letra2.toUpperCase().charAt(0);
		ascii2=Num2;
		System.out.println("Valor en mayuscula de " + letra1+ ": " + ascii1);
		System.out.println("Valor en mayuscula de " + letra2+ ": " + ascii2);
		
		}

}
