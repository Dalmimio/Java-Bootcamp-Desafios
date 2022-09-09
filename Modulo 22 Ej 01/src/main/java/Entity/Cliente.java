package Entity;

public class Cliente {

		private String nombre;
		private String apellido;
		private Documento documento;

		public Cliente(long id, String string, String string2, Documento documento2) {

		}

		public Cliente(String nombre, String apellido, Documento documento) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.documento = documento;
		}

		@Override
		public String toString() {
			return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + "]";
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Documento getDocumento() {
			return documento;
		}

		
		public void setDocumento(Documento documento) {
			this.documento = documento;
		}
}
