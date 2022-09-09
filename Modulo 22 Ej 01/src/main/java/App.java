import Entity.Cliente;
import Entity.Documento;
import Entity.ProductoPerecedero;
import Facilitador.TextoOfertas;

public class App {

	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[3];
		ProductoPerecedero[] productos = new ProductoPerecedero[10];

		clientes[0] = new Cliente(1L, "Pepe", "Roblez", new Documento("DNI", "09563142"));
		clientes[1] = new Cliente(2L, "Leo", "Dan", new Documento("DNI", "28569352"));
		clientes[2] = new Cliente(3L, "Chaqueño", "Palavecino", new Documento("DNI", "33002145"));

		productos[0] = new ProductoPerecedero(1L, "Leche de soja", 7.6f, 10, 5);
		productos[1] = new ProductoPerecedero(2L, "Queso azul", 10.6f, 11, 10);
		productos[2] = new ProductoPerecedero(3L, "Panceta", 6.6f, 2, 51);
		productos[3] = new ProductoPerecedero(4L, "Pollo Vegano", 54.6f, 4, 15);
		productos[4] = new ProductoPerecedero(5L, "Lomitos de Atun", 57.6f, 10, 2);
		productos[5] = new ProductoPerecedero(6L, "Bife de Chorizo", 52.6f, 9, 8);
		productos[6] = new ProductoPerecedero(7L, "Tomate", 8.6f, 8, 11);
		productos[7] = new ProductoPerecedero(8L, "Cebolla de verdeo", 100.6f, 25, 18);
		productos[8] = new ProductoPerecedero(9L, "Queso sin sal", 50.6f, 38, 36);
		productos[9] = new ProductoPerecedero(10L,"Hamburguesa vegana", 22.6f, 11, 4);

		TextoOfertas.ofertas(clientes, productos);

	}

}
