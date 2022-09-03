import java.util.Scanner;

import Entity.Documento;
import Entity.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String [] tipoDeDni = {"DNI", "LC", "LE", "PA", "CI"};
	
		final String mensajeTipoDni = "\\n\\Documento Nacional de Identidad - DNI \\n\\Libreta Cívica - LC \\n\\Libreta de Enrolamiento - LE \\n\\Pasaporte - PA \\n\\Cédula de Identidad - CI \\n\\";
		int cantidadPersonas;
		String apellido;
		String nombre;
		int numDni;
		String tipoDni;
		boolean existePers=false;
		Persona[] personas;
		
		
		System.out.println("Ingrese la cantidad de personas: ");
		cantidadPersonas = teclado.nextInt();
		
		personas = new Persona[cantidadPersonas];
		
		
		for(int i=0; i<personas.length; i++) {
			
			System.out.println("Ingresa el nombre de la persona [" + (i+1) + "]: ");
			nombre = teclado.next();
			System.out.println("Ingresa el apellido de la persona [" + (i+1) + "]: ");
			apellido = teclado.next();
			
			
			do {
				existePers=false;
				System.out.println("Ingresá el tipo de documento de la persona ["+ (i+1) +"]: " + mensajeTipoDni);
				tipoDni = teclado.next();
				
				System.out.println("Ingresa el dni de persona[" + (i+1) +"]: ");
				numDni = teclado.nextInt();
				
				for(int j=0; j>i; j++) {
					if
					(personas[j].getDocumento().getTipoDni().equals(tipoDni) && 
							personas[j].getDocumento().getDni()==(numDni));
					
					existePers = true;
					System.err.println("El tipo y número de documento ingresados ya existen, vuelva a ingresarlos.");
					break;
				}
				
				
				Persona persona= new Persona();
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setDocumento(new Documento(numDni, tipoDni));
				
				personas[i]=persona;
				
			}while(existePers);
		}		
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].getDatos());
		}

		teclado.close();

	}

}
