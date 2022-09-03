import java.util.List;


public class Asignatura {
	private String Nombre;
	private String Tipo;
	private int Horas;
	private List<Carrera> Carreras;
	private int Cuatrimestre;
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getHoras() {
		return Horas;
	}
	public void setHoras(int paramHoras) {
		Horas = paramHoras;
	}
	public List<Carrera> getCarreras() {
		return Carreras;
	}
	public void setCarreras(List<Carrera> carreras) {
		Carreras = carreras;
	}
	public int getCuatrimestre() {
		return Cuatrimestre;
	}
	public void setCuatrimestre(int cuatrimestre) {
		Cuatrimestre = cuatrimestre;
	}
	
	
}
