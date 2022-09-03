package Entidades;

public class Documento {
	private String tipoDoc;
	private String numDoc;
	
	
	public Documento(String tipoDoc, String numDoc) {
		super();
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
	}
	
	public String getDatos() {
		return "Documento [tipo: " + tipoDoc + ", numero:" + numDoc + "]";
	}
	
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	
	
}
