package Entity;

public class ProductoPerecedero extends Producto {
	
	

		private int diasVencer;

		public ProductoPerecedero() {

		}

		public ProductoPerecedero(String descripcion, Float precio, Integer cantInventario, int diasVencer) {
			super(descripcion, precio, cantInventario);
			this.diasVencer = diasVencer;
		}

		@Override
		public String toString() {
			return "ProductoPerecedero [toString()=" + super.toString() + ", diasPorVencer=" + diasVencer + "]";
		}

		public int getDiasPorVencer() {
			return diasVencer;
		}

		public void setDiasPorVencer(int diasPorVencer) {
			this.diasVencer = diasPorVencer;
		}

		public Float getPrecioInventario() {

			if (diasVencer > 10) {
				return super.getPrecioInventario();
			}

			return ((getPrecio() - (getPrecio() * (DESCUENTO / 100))) * getCantInventario());
		}

}
