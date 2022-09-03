import java.util.Scanner;
// laboratorio ejercicio 02
public class Lab_02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, opcion;
		
		System.out.print("Ingrese un n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Ingrese otro n�mero: ");
		num2 = teclado.nextInt();
		
		System.out.println("�Qu� quieres hacer?:\n1) Suma\n2) Resta\n3) Producto\n4) Divisi�n");
		System.out.print("Ingrese opci�n: ");
		opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1: System.out.print("Resultado de la suma: " + (num1+num2));
			break;
		case 2: System.out.print("Resultado de la resta: " + (num1-num2));
			break;
		case 3: System.out.print("Resultado del producto: " + (num1*num2));
			break;
		case 4: System.out.print("Resultado de la divisi�n: "+ (num1/num2));
			break;
		}
	}
}
