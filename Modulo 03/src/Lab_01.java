import java.util.Scanner;
// laboratorio ejercicio 02
public class Lab_01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		char letra;
		System.out.println("�Gracias por contactarte con nosotros!");
		System.out.println("�En qu� podemos ayudarte?");
		System.out.println("A) Documentaci�n \nB) Cotizaci�n \nC) Asistencia \nD) Siniestros\nE) Informaci�n de pagos\nF) Otras consultas\nG) Anulaci�n");
		
		System.out.print("Escribe la letra de la opci�n elegida: ");
		letra = teclado.next().charAt(0);
		
		switch (letra){
			case 'A':
				System.out.println("Ha seleccionado Documentaci�n");
				break;
			case 'B':
				System.out.println("Ha seleccionado Cotizaci�n");
				break;
			case 'C':
				System.out.println("Ha seleccionado Asistencia");
				break;
			case 'D':
				System.out.println("Ha seleccionado Informaci�n de pagos");
				break;
			case 'E':
				System.out.println("Ha seleccionado Otras consultas");
				break;
			case 'G':
				System.out.println("Ha seleccionado Anulaci�n");
				break;
		}
	}

}
