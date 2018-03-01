import utilidades.Fecha;
import utilidades.Leer;

public class Responsable extends Empleado {
	private Float bono;
	private String departamento;
	private Integer personasACargo = 0;
	private static Float plusResponsabilidad = 200f;

	public Responsable(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso, Float bono,
			String departamento) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.bono = bono;
		this.departamento = departamento;
	}

	public Float calculoNomina() {
		return super.calculoNomina() + (plusResponsabilidad * personasACargo) + bono;
	}

	public void visualizaTodo() {

		super.visualizaTodo();
		Leer.mostrarEnPantalla("Departamento: " + departamento + "\n" + "BONO: " + bono + "\n" + "PERSONAS CARGO: "
				+ personasACargo + "\n" + "PLUS RESPONSABILIDAD: " + plusResponsabilidad);
	}
	
	public void empleadosACargo() {
		personasACargo++;
		
	}

	public static Float getPlusResponsabilidad() {
		return plusResponsabilidad;
	}

	public static void setPlusResponsabilidad(Float plusResponsabilidad) {
		Responsable.plusResponsabilidad = plusResponsabilidad;
	}

	
	

}
