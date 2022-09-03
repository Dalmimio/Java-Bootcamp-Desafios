import Entity.Cliente;
import Entity.Documento;
import Entity.ProductoPerecedero;
import Facilitador.TextoOfertas;

public class App {

	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[3];
		ProductoPerecedero[] productos = new ProductoPerecedero[10];

		clientes[0] = new Cliente("Pepe", "Roblez", new Documento("DNI", "09563142"));
		clientes[1] = new Cliente("Leo", "Dan", new Documento("DNI", "28569352"));
		clientes[2] = new Cliente("Chaqueño", "Palavecino", new Documento("DNI", "33002145"));

		productos[0] = new ProductoPerecedero("Leche de soja", 7.6f, 10, 5);
		productos[1] = new ProductoPerecedero("Queso azul", 10.6f, 11, 10);
		productos[2] = new ProductoPerecedero("Panceta", 6.6f, 2, 51);
		productos[3] = new ProductoPerecedero("Pollo", 54.6f, 4, 15);
		productos[4] = new ProductoPerecedero("Atun", 57.6f, 10, 2);
		productos[5] = new ProductoPerecedero("Bife de Chorizo", 52.6f, 9, 8);
		productos[6] = new ProductoPerecedero("Tomate cherry", 8.6f, 8, 11);
		productos[7] = new ProductoPerecedero("Cebolla de verdeo", 100.6f, 25, 18);
		productos[8] = new ProductoPerecedero("Queso Crema ligth", 50.6f, 38, 36);
		productos[9] = new ProductoPerecedero("Hamburguesa vegana", 22.6f, 11, 4);

		TextoOfertas.ofertas(clientes, productos);

	}

}
