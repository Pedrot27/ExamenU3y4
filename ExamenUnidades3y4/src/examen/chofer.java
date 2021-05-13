package examen;

public class chofer extends empleado{
	public String rutas;
	public int noAutobus;
	public chofer(String nombre, String apellido, String email, long celular, String nss, int noEmpleado, float sueldo,
			String puesto, String rutas, int noAutobus) {
		super(nombre, apellido, email, celular, nss, noEmpleado, sueldo, puesto);
		this.rutas = rutas;
		this.noAutobus = noAutobus;
	}
	public String agregaRuta(String rutas) {
		return rutas;
	}
	public boolean eliminaRuta(boolean rutas) {
		return rutas;
	}

}
