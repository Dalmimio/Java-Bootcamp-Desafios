package Entity;

public class ProductoNoPerecedero extends Producto{
	
	public ProductoNoPerecedero() {
		super();
	}

	public ProductoNoPerecedero(Long id, String descripcion, Float precio, Integer cantInventario) {
		super(id, descripcion, precio, cantInventario);
	}

	@Override
	public Float getPrecioInventario() {
		return getPrecio() * getCantInventario();
	}
}
