import javax.xml.crypto.Data;

public class Tramite {

	private int Numero;
	private Data Fecha;
	private Alumno Alumno;
	private String Estado;
	
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public Data getFecha() {
		return Fecha;
	}
	public void setFecha(Data paramFec) {
		Fecha = paramFec;
	}
	public Alumno getAlumno() {
		return Alumno;
	}
	public void setAlumno(Alumno alumno) {
		Alumno = alumno;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}

	
}
