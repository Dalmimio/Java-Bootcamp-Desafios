package Entity;

import Utilidades.Formatos;

public class Cuenta extends Producto {
	private String tipo;

	public Cuenta() {
		setNumero(getNumeroGenerado());
	}

	public Cuenta(Integer banco, Integer sucursal, String tipo) {
		super(banco, sucursal);
		this.tipo = tipo;

	}

	@Override
	public String toString() {
		return "Cuenta [Banco=" + Formatos.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formatos.getFormato(getSucursal(), "BANCO") + ", Numero=" + Formatos.getFormato(getNumero(), tipo)
				+ ", Tipo=" + tipo + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
