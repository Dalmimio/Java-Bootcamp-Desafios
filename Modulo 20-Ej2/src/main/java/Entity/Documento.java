package Entity;

public class Documento {
	
	private int dni;
	private String tipoDni;
	
	
	public Documento() {
		super();
	}

	public Documento(int dni, String tipoDni) {
		super();
		this.dni = dni;
		this.tipoDni = tipoDni;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getTipoDni() {
		return tipoDni;
	}
	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
	}
	
	public String getDatos() {
		return "Tipo de documento: " + tipoDni + " numero: " + dni;
	}
	
}
