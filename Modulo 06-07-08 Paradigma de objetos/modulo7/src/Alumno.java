import java.util.List;

public class Alumno {
	private String id_alumno;
	private Persona Datos;
	public List<Asignatura> Materias;
	private Carrera Carrera;
	
	
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
	public void setCarrera(Carrera carrera) {
		Carrera = carrera;
	}
	
	// metodos
	
	public void inscribirMateria(){
		
	}
	
	public void iniciarTramite(){
		
	}
	
	public void inscribirCarrera(){
	
	}
    public void mostrarDatos(int i) {
    }
	
	
	
	
	
	
}
