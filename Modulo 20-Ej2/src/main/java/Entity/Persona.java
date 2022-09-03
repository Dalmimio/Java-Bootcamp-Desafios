package Entity;

public class Persona {
	private String nombre;
	private String apellido;
	private Documento documento;
	
	
	public Persona(String nombre, String apellido, Documento documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	
	public Persona() {
		super();
	}

	public String getDatos() {
		return "Persona :[Nombre: " + nombre + ", apellido: " + apellido + ", " + documento.getDatos();
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
