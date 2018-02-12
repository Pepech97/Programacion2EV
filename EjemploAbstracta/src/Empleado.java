import utilidades.Leer;

public class Empleado extends EmpleadoAbstracta{
	
	public Empleado(String nombre, Integer edad, Integer porcentajeIncremento) {
		super(nombre, edad, porcentajeIncremento);
		// TODO Auto-generated constructor stub
	}
	public Double cobrar(){
		Double cantidad = getSueldoBase() * (1 + (double)getPorcentajeIncremento()/100);
		return cantidad;
	}
	public void pedirDatos() {
		System.out.println("\nVamos a insertar los datos del empleado: ");
		setNombre (Leer.pedirCadena("\n\n\n\tNOMBRE: "));
		setEdad (Leer.pedirEntero("\n\n\tEDAD: "));
	}

	public static void indicaTipoPersonal() {
		Leer.mostrarEnPantalla("\tESTA PERSONA ES UN EMPLEADO DE LA EMPRESA.");
	}

	public void imprimeNombre(){
		Leer.mostrarEnPantalla("\n\t\tNOMBRE " + getNombre());
		return;
	}
	
	public void imprimeEdad(){
		Leer.mostrarEnPantalla("\n\t\tEDAD: " + getEdad());
		return;
	}
	
}