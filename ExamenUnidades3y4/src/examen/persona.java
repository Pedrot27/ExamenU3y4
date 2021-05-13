package examen;

public class persona {
	public String nombre;
	public String apellido;
	public String email;
	public long celular;
	
	public persona(String nombre, String apellido, String email, long celular) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.celular = celular;
	}
	public String toString() {
		return "persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular
				+ "]";
	}
}

