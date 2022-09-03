package Entity;

public class Producto {

	
	public static Float DESCUENTO = 30f;
	private String descripcion;
	private Float precio;
	private Integer cantInventario;

	public Producto() {

	}

	public Producto(String descripcion, Float precio, Integer cantInventario) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantInventario = cantInventario;
	}

	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantInventario + "]";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getCantInventario() {
		return cantInventario;
	}

	public void setCantInventario(Integer cantidad) {
		this.cantInventario = cantidad;
	}

	public Float getPrecioInventario() {
		return precio * cantInventario;
	}

	
}
