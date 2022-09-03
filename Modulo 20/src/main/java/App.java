import java.util.Arrays;
import java.util.Scanner;

import Entidades.Usuario;

public class App {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Usuario usuario = new Usuario();
		final String dominio="educacionit.com";
		String [] simbolos = {"*",".","-","_"};
		String correo, clave;
		
		
		//pedir correo
		do {
			System.out.println("Ingrese el correo del instituto: ");
			correo = teclado.nextLine().toLowerCase();
			
			if(correo.length()>dominio.length() && correo.endsWith(dominio)) {
				break;
			}
			System.out.println("Correo incorrecto, recuerde que el dominio debe ser: "+ dominio);
			
		}while(true);
		
		//pedir clave
		do {
			System.out.println("Ingrese su contraseña: ");
			clave = teclado.nextLine();
			
			String primeraLetra=clave.substring(0, 1);
			boolean primeraMayuscula = primeraLetra.toUpperCase().equals(primeraLetra);
			boolean contieneSimbolos=false;
			
			
			for(int i=0; i<=clave.length(); i++) {
				if(clave.contains(simbolos[i])) {
					contieneSimbolos=true;
					break;
				}
			}
			
			if(contieneSimbolos && primeraMayuscula) {
				break;
			}
			
			System.out.println("Formato de contraseña incorrecto, recordá que debe empezar con una mayï¿½scula y contener uno de estos simbolos: " + Arrays.toString(simbolos));
					
		}while(false);
		
		
		usuario.setCorreo(correo);
		usuario.setClave(clave);
		System.out.println(usuario.getDatos());

		teclado.close();

	}

}
