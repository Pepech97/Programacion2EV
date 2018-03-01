import utilidades.Fecha;
import utilidades.Leer;

public class Empleado {
	

	private String nombre;
	private Fecha fechaNacimiento;
	private Integer numeroEmpleado;
	private static Integer siguiente = 0;
	private static Float salarioBase = 1000f;
	public static void setSalarioBase(Float salarioBase) {
		Empleado.salarioBase = salarioBase;
	}

	private Fecha fechaIngreso;

	public Empleado(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		siguiente++;
		this.numeroEmpleado = siguiente;
		this.fechaIngreso = fechaIngreso;
	}

	public static Integer getSiguiente() {
		return siguiente;
	}
	

	public Integer getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer edadEmpleado() {
		Fecha hoy = new Fecha(19, 2, 2018);

		return (fechaNacimiento.difFechas(hoy)) / 365;
	}

	public Integer aniosAntiguedad() {
		Fecha hoy = new Fecha(19, 2, 2018);
		return (fechaIngreso.difFechas(hoy)) / 365;
	}

	public Float calculoNomina() {
		return salarioBase;
	}

	public void visualizaTodo() {
		Leer.mostrarEnPantalla("Nombre: " + nombre + "\nNacimiento: " + fechaNacimiento + "\n" + "Edad: " + edadEmpleado() + " años\n"+ "Antigüedad: " + aniosAntiguedad() + " años\n"
				+ numeroEmpleado + "\nSalario Base: " + salarioBase + "\ningreso: " + fechaIngreso + "\n");
	}

	public static Float getSalarioBase() {
		return salarioBase;
	}
}
