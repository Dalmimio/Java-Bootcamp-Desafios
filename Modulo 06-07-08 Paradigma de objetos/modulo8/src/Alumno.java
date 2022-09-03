import java.util.List;

public class Alumno {
	private String id_alumno;
	private Persona Datos;
	public List<Asignatura> Materias;
	private Carrera Carrera;
	
	
	public void mostrarDatos(){
		mostrarDatos();
		System.out.println("Código de alumno: " + id_alumno);
		System.out.println("Carrera: " + getCarrera());
	}

	public void mostrarDatos(int paramDatosMaterias) {
		for (Asignatura asig : Materias) {
			System.out.println("Materia: " + asig.getNombre());
			System.out.println("Cuatrimestre: " + asig.getCuatrimestre());
		}
	}

	public String getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(String id_alumno) {
		this.id_alumno = id_alumno;
	}
	public Persona getDatos() {
		return Datos;
	}
	public void setDatos(Persona datos) {
		Datos = datos;
	}
	public List<Asignatura> getMaterias() {
		return Materias;
	}
	public void setMaterias(List<Asignatura> materias) {
		Materias = materias;
	}
	public Carrera getCarrera() {
		return Carrera;
	}
	public void setCarrera(Carrera paramcarrera) {
		Carrera = paramcarrera;
	}
	
	// metodos
	
	public void inscribirMateria(){
		
	}
	
	public void iniciarTramite(){
		
	}
	
	public void inscribirCarrera(){
	
	}
	
	
	
	
	
	
}
