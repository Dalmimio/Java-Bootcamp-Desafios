import java.util.Scanner;

import Entidades.Documento;
import Entidades.PersonaDatos;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String [] documentos = {"DNI", "LC", "LE", "PA", "CI"};
		String mensajeDocumentos="\n Documento Nacional de Identidad -DNI (1) \n Libreta Cívica - LC (2) \n Libreta de Enrolamiento - LE (3) \n Pasaporte - PA (4) \n Cédula de Identidad -CI (5)";

		int indiceTipoDocumento;
		String tipoDocumento;
		String numeroDocumento;
		String nombre;
		String apellido;
		int cantidadPersonas;
		boolean existePersona = false;
		PersonaDatos[] personas;

		System.out.println("Indicá la cantidad de personas que vas a ingresar: ");
		cantidadPersonas=teclado.nextInt();
		personas = new PersonaDatos[cantidadPersonas];

		for(int i=0; i<personas.length;i++){
			System.out.println("Persona:["+(i+1)+"]");

			System.out.println("Ingresa el nombre ");
			nombre=teclado.next();

			System.out.println("Ingresa el apellido ");
			apellido=teclado.next();

			do{
				existePersona=false;
				System.out.println("Documento de " + nombre + " " + apellido + mensajeDocumentos +": ");

				System.out.println("Tipo: ");
				indiceTipoDocumento = teclado.nextInt();
				tipoDocumento = documentos[indiceTipoDocumento-1];

				System.out.println("Número: ");
				numeroDocumento = teclado.next().toUpperCase();

				// existe?

				for (int j = 0; j < i; j++) {
					if (personas[j].getDocumento().getTipoDoc().equals(tipoDocumento)
							&& personas[j].getDocumento().getNumDoc().equals(numeroDocumento)) {
						existePersona = true;
						System.err.println(
								"El tipo y numero de documento ingresados ya existen, vuelva a ingresarlos...");
						break;
					}
				}

			} while (existePersona);

			PersonaDatos persona = new PersonaDatos();
			persona.setNombre(nombre);
			persona.setApellido(apellido);
			persona.setDocumento(new Documento(tipoDocumento, numeroDocumento));

			personas[i]=persona;
		}
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].getDatos());
		}

		teclado.close();
		
	}

}
