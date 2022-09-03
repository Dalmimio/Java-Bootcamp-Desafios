package Entidades;

public class Usuario {

		private String clave;
		private String correo;
		
		
		public Usuario() {
			super();
			
		}
		
		public Usuario(String clave, String correo) {
			super();
			this.clave=clave;
			this.correo=correo;
		}
		
		public String getDatos(){
			return "Usuario [Correo: " + correo +" clave: " + clave +"]";
		}
		
		public String getClave() {
			return clave;
		}
		public void setClave(String clave) {
			this.clave = clave;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}


}
