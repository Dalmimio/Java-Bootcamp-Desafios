
public class Persona {
	
	private String Dni;
	private String Nombre;
	private String Direccion;
	
	
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	public void mostrarDatos() {
		System.out.println("Datos de la Persona:");
		System.out.println("Numero de documento: " + getDni());
		System.out.println("Nombre: " + Nombre);
		System.out.println("Dirección: " + Direccion);
		}
	
}
