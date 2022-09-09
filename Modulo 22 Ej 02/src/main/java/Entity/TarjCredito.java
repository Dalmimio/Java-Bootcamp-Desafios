package Entity;

import Utilidades.Formatos;

public class TarjCredito extends Producto{
	private Integer codigoSeguridad;

	public TarjCredito() {
		generarNumeroProducto();
	}

	public TarjCredito(Integer banco, Integer sucursal, Integer codigoSeguridad) {
		super(banco, sucursal);
		this.codigoSeguridad = codigoSeguridad;
		generarNumeroProducto();
	}

	@Override
	public String toString() {
		return "TarjetaCredito [Banco=" + Formatos.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formatos.getFormato(getSucursal(), "BANCO") + ", Numero=" + Formatos.getFormato(getNumero(), "TC")
				+ ", Codigo de Seguridad=" + Formatos.getFormato(getCodigoSeguridad(), "CS") + "]";
	}

	public Integer getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(Integer codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	private void generarNumeroProducto() {
		Integer numero = numeroTC++;
		setNumero(numero);

	}
}
