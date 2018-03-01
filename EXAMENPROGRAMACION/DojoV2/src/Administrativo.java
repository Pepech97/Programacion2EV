import utilidades.Fecha;
import utilidades.Leer;

public class Administrativo extends Empleado{
	private static Float plusAntiguedad=10f;
	private String departamento;
	private Responsable jefe;
	public Administrativo(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso,
			String departamento, Empleado empleados) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.departamento = departamento;
		this.jefe = (Responsable) empleados;
		this.jefe.empleadosACargo();
	}
	
	public Float calculoNomina(){
		return super.calculoNomina() + (aniosAntiguedad()*plusAntiguedad); // calcular años antiguesada
	}
	public void visualizaTodo(){
		
		super.visualizaTodo();
		Leer.mostrarEnPantalla( "Departamento:" +departamento+  "\n" + "Plus Antiguedad:"+plusAntiguedad +  "\nJEFE:"+ jefe.getNombre() );
	}

	public static Float getPlusAntiguedad() {
		return plusAntiguedad;
	}

	public static void setPlusAntiguedad(Float plusAntiguedad) {
		Administrativo.plusAntiguedad = plusAntiguedad;
	}
	
	
	
	
















}
