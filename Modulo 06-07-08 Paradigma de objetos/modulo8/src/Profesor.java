public class Profesor extends Persona{
	private String id_profesor;
	private Persona Datos;
	private String Departamento;
	

	// get y set
	
	public String getId_profesor() {
		return id_profesor;
	}
	public void setId_profesor(String paramId_Profesor) {
		this.id_profesor = paramId_Profesor;
	}
	public Persona getDatos() {
		return Datos;
	}
	public void setDatos(Persona datos) {
		Datos = datos;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	
	
	
	
	
	
}
