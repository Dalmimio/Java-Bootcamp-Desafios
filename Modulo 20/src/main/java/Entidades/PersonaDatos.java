package Entidades;

public class PersonaDatos {
	String nombre;
	String apellido;
	Documento documento;
	
	
	
	
	public PersonaDatos(String nombre, String apellido, Documento documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	
	public PersonaDatos() {
    }

    public String getDatos() {
		return "Persona [nombre: " + nombre + ", apellido: " + apellido + ", " + documento.getDatos() + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	
}
