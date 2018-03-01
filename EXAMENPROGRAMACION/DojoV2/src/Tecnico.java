import utilidades.Fecha;
import utilidades.Leer;

public class Tecnico extends Empleado {
	private String especialidad;
	private Float plusEspecialidad;
	private Responsable jefe;

	public Tecnico(String nombre, Fecha fechaNacimiento , Fecha fechaIngreso,
			String especialidad, Float plusEspecialidad, Empleado jefe) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.especialidad = especialidad;
		this.plusEspecialidad = plusEspecialidad;
		this.jefe = (Responsable) jefe;
		this.jefe.empleadosACargo();
	}

	public Float calculoNomina() {
		return super.calculoNomina() * (plusEspecialidad+1);
	}

	public void visualizaTodo() {

		super.visualizaTodo();
		Leer.mostrarEnPantalla(
				"Especialidad: " + especialidad + "\n" + "Plus Especialidad: " + plusEspecialidad + "\nJEFE: " + jefe.getNombre());
	}

}
