package Entity;

public class ProductoNoPerecedero extends Producto{
	
	public ProductoNoPerecedero() {
		super();
	}

	public ProductoNoPerecedero(String descripcion, Float precio, Integer cantInventario) {
		super(descripcion, precio, cantInventario);
	}

	@Override
	public String toString() {
		return "ProductoNoPerecedero [toString()=" + super.toString() + "]";
	}
}
