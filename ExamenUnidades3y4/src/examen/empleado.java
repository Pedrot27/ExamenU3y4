package examen;

public class empleado extends persona{
	public String nss;
	public int noEmpleado;
	public float sueldo;
	public String puesto;
	public empleado(String nombre, String apellido, String email, long celular, String nss, int noEmpleado,
			float sueldo, String puesto) {
		super(nombre, apellido, email, celular);
		this.nss = nss;
		this.noEmpleado = noEmpleado;
		this.sueldo = sueldo;
		this.puesto = puesto;
	}
	public String cambioPuesto(String puesto,float sueldo) {
		return puesto;
	}

}
