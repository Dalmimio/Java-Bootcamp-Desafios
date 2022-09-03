package Facilitador;

import Entity.Cliente;
import Entity.Producto;
import Entity.ProductoPerecedero;

public class TextoOfertas {
	
	public static void ofertas(Cliente[] clientes, ProductoPerecedero[] productos) {

		for (int i = 0; i < clientes.length; i++) {

			String mensaje = "Hola {nombre}: \nEsta semana tenemos las siguientes ofertas para ti:\n";
			mensaje = mensaje.replace("{nombre}", clientes[i].getNombre());

			for (int j = 0; j < productos.length; j++) {
				if (productos[j].getDiasPorVencer() <= 10) {
					String oferta = "\t- {descripcion_producto}, Antes: {precio} Después: {oferta}.\n";
					oferta = oferta.replace("{descripcion_producto}", productos[j].getDescripcion());
					oferta = oferta.replace("{precio}", String.format("%.2f", productos[j].getPrecio()));
					oferta = oferta.replace("{oferta}", String.format("%.2f",
							(productos[j].getPrecio() - (productos[j].getPrecio() * (Producto.DESCUENTO / 100)))));
					mensaje += oferta;
				}
			}
			System.out.println(mensaje);
		}

	}

}
