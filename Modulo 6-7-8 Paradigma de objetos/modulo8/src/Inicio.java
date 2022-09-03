import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class Inicio {
	public static void main(String[] args) throws ParseException, IOException {

		Persona p = new Persona();
		p.setDireccion("Cramer 1653");
		p.setNombre("Ariel Mercado F.");
		p.setDni("33444555");
		p.mostrarDatos();

		Persona p1 = new Persona();
		p1.setDireccion("Tucuman 633");
		p1.setNombre("Pedro Gomez");
		p1.setDni("11222333");

		System.out.println("");

		Carrera c = new Carrera();
		c.setNombre("Programación .Net");
		c.setSede("Lavalle");

		Carrera c1 = new Carrera();
		c1.setNombre("Programación Java");
		c1.setSede("Lavalle");

		Carrera c2 = new Carrera();
		c2.setNombre("Programación FullStack PHP");
		c2.setSede("Lavalle");

		List<Carrera> listaDeCarreras = new ArrayList<Carrera>();
		listaDeCarreras.add(c);
		listaDeCarreras.add(c1);
		listaDeCarreras.add(c2);

		System.out.println("Carreras disponibles:");
		System.out.println(c.getNombre());
		System.out.println(c1.getNombre());
		System.out.println(c2.getNombre());

		for (Carrera carrera : listaDeCarreras) {
			System.out.println("Sede: " + carrera.getSede());
			System.out.println("Nombre: " + carrera.getNombre());
		}

		System.out.println("");

		Asignatura a = new Asignatura();
		a.setNombre("Introducci�n al Paradigma de objetos");
		a.setTipo("Obligatoria");
		a.setCuatrimestre(2);
		a.setHoras(9);
		a.setCarreras(listaDeCarreras);

		System.out.println("Datos de la Asignatura/Materia:");
		System.out.println("Nombre: " + a.getNombre());
		System.out.println("Tipo de cursada: " + a.getTipo());
		System.out.println("Cuatrimestre: " + a.getCuatrimestre());
		System.out.println("Carga horaria: " + a.getHoras());

		System.out.println("");

		Asignatura a1 = new Asignatura();
		a1.setNombre("Introducción a C# .Net");

		List<Asignatura> listaDeAsignaturas = new ArrayList<Asignatura>();
		listaDeAsignaturas.add(a);
		listaDeAsignaturas.add(a1);

		Alumno alu = new Alumno();
		alu.setDatos(p);
		alu.getDatos().setNombre("Ariel Mercado F.");
		alu.getDatos().setDireccion("Cramer 1653");
		alu.getDatos().setDni("33444555");
		alu.setId_alumno("101");
		alu.Materias = listaDeAsignaturas;
		alu.setCarrera(c);

		System.out.println("Datos del alumno: ");
		System.out.println("Nombre: " + alu.getDatos().getNombre());
		System.out.println("Codigo de alumno: " + alu.getId_alumno());
		System.out.println("Carrera: " + alu.getCarrera().getNombre());
		System.out.println("Lista de materias: ");
		System.out.println(a.getNombre());
		System.out.println(a1.getNombre());
		alu.mostrarDatos(1);

		System.out.println("");


		AsignaturaCursada ac = new AsignaturaCursada();
		ac.setAsignatura(a1);
		ac.setAlumno(alu);
		ac.setNota(7.50);
		ac.setNotaFinal((double) 8);

		System.out.println("Lista de materias cursadas: ");
		System.out.println(ac.getAsignatura().getNombre());
		System.out.println("Nota: " + ac.getNota());
		System.out.println("Nota final: " + ac.getNotaFinal());

		System.out.println("");

		Profesor prof = new Profesor();
		prof.setDatos(p1);
		prof.getDatos().setNombre("Pedro Gomez");
		prof.getDatos().setDni("11222333");
		prof.getDatos().setDireccion("Tucuman 633");
		prof.setDepartamento("Ingeniería");
		prof.setId_profesor("T021");

		System.out.println("Datos del Profesor: ");
		System.out.println("Nombre: " + prof.getDatos().getNombre());
		System.out.println("Codigo de profesor: " + prof.getId_profesor());
		System.out.println("Departamento: " + prof.getDepartamento());

		System.out.println("");

		Tramite t = new Tramite();
		t.setAlumno(alu);
		t.setEstado("Pendiente");
		t.setNumero(12345);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		t.setFecha((Data) sdf.parse("10-10-2020"));

		System.out.println("Datos del Tramite: ");
		System.out.println("Alumno: " + t.getAlumno().getDatos().getNombre());
		System.out.println("Estado: " + t.getEstado());
		System.out.println("Numero: " + t.getNumero());
		System.out.println("Fecha de inicio: " + t.getFecha());
	}
}
