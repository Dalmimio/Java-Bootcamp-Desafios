import java.util.Scanner;

public class desafios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//E J E R C I C I O 1
		//Dado el siguiente código: int nro1 = 100, nro2 = 500, nro3 = 250; Informar cuál de los tres números es mayor.
		int num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Ingrese el segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.print("Ingrese el tercer número: ");
		num3 = teclado.nextInt();
				
		if (num1>num2 && num1>num3)
			System.out.print("El mayor es: " + num1);
		if (num2>num1 && num2>num3)
			System.out.print("El mayor es: " + num2);
		if (num3>num1 && num3>num2)
			System.out.print("El mayor es: " + num3);
		
		
		// E J E R C I C I O 2
		
		System.out.print("\nIngrese el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Ingrese el segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.print("Ingrese el tercer número: ");
		num3 = teclado.nextInt();
		
		if (num1 > 0 && num2 >0) 
			System.out.print("los positivos son: " + num1 + "y " + num2 + ", el producto es: " + (num1*num2));
		if (num1 > 0 && num3 >0) 
			System.out.print("los positivos son: " + num1 + "y " + num3 + ", el producto es: " + (num1*num3));
		if (num2 > 0 && num3 >0) 
			System.out.print("los positivos son: " + num2 + "y " + num3 + ", el producto es: " + (num2*num3));
		
		// E J E R C I C I O 3
		
		
		String usuario, clave;
		
		System.out.print("Ingresa tu usuario: ");
		usuario = teclado.next();
		
		System.out.print("Ingresa tu clave: ");
		clave = teclado.next();
		
		if (usuario.equals("Pepito") && clave.equals("1234"))
			System.out.print("Bienvenido Pepito");
		
		if (usuario.equals("Pepito"))
			System.out.print("Contraseña incorrecta");
		
		if (clave.equals("1234"))
			System.out.print("Usuario incorrecto");
	
		
		
	}

}
