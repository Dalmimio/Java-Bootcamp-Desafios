package Facilitador;

import Entity.Cliente;
import Entity.Producto;
import Entity.ProductoPerecedero;

public final class TextoOfertas {
	
	public static void ofertas(Cliente[] clientes, ProductoPerecedero[] productos) {

		for(Cliente cliente : clientes) {

			String mensaje = "Hola {nombre}: \nEsta semana tenemos las siguientes ofertas para ti:\n";
			mensaje =  mensaje.replace("{nombre}",  cliente.getNombre());

			for(ProductoPerecedero productoPerecedero : productos) {
				if (productoPerecedero.getDiasPorVencer() <= 10) {
					String oferta = "\t- {descripcion_producto}, Antes: {precio} Después: {oferta}.\n";
					oferta = oferta.replace("{descripcion_producto}", productoPerecedero.getDescripcion());
					oferta = oferta.replace("{precio}", String.format("%.2f", productoPerecedero.getPrecio()));
					oferta = oferta.replace("{oferta}", String.format("%.2f",
							(productoPerecedero.getPrecio() - (productoPerecedero.getPrecio() * (Producto.DESCUENTO / 100)))));
					mensaje += oferta;
				}
			}
			System.out.println(mensaje);
		}

	}

}
