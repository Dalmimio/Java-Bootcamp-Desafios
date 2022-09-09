package Entity;

import Interface.Autoincrementable;

public abstract class Producto implements Autoincrementable {

	private Long id;
	public static Float DESCUENTO = 30f;
	private String descripcion;
	private Float precio;
	private Integer cantInventario;

	public Producto() {

	}

	public Producto(Long id, String descripcion, Float precio, Integer cantInventario) {
		super();
		this.id=id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantInventario = cantInventario;
	}

	@Override
	public String toString() {
		return "Producto [id= "+ id + "descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantInventario + "]";
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public abstract Float getPrecioInventario();

	
}
