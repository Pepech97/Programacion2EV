import utilidades.Leer;

public abstract class EmpleadoAbstracta {
	private static final String NOMBRE_EMPRESA="Electrica S.A.";
	private String nombre;
	private Integer edad;
	private Integer porcentajeIncremento;
	private static Double sueldoBase = 1000.0;

	public EmpleadoAbstracta(String nombre, Integer edad, Integer porcentajeIncremento) {
		this.nombre = nombre;
		this.edad = edad;
		this.porcentajeIncremento = porcentajeIncremento;
	}
	
	public abstract Double cobrar();
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getPorcentajeIncremento() {
		return porcentajeIncremento;
	}

	public void setPorcentajeIncremento(Integer porcentajeIncremento) {
		this.porcentajeIncremento = porcentajeIncremento;
	}

	public static Double getSueldoBase() {
		return sueldoBase;
	}

	public static void setSueldoBase(Double sueldoBase) {
		EmpleadoAbstracta.sueldoBase = sueldoBase;
	}



	public static String getNombreEmpresa() {
		return NOMBRE_EMPRESA;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre){	
		this.nombre=nombre;
		return;
	}
	
	public void pedirDatos() {
		System.out.println("\nVamos a insertar los datos del empleado: ");
		nombre = Leer.pedirCadena("\n\n\n\tNOMBRE: ");
		edad = Leer.pedirEntero("\n\n\tEDAD: ");
	}


	public static void indicaTipoPersonal() {
		Leer.mostrarEnPantalla("\tESTA PERSONA ES UN EMPLEADO DE LA EMPRESA.");
	}

	
	
	
	public void setTodo(String nombre,Integer edad){
		this.nombre=nombre;
		this.edad=edad;
		return;
	}
	public void imprimeNombre(){
		Leer.mostrarEnPantalla("\n\t\tNOMBRE " + nombre);
		return;
	}
	
	public void imprimeEdad(){
		Leer.mostrarEnPantalla("\n\t\tEDAD: " + edad);
		return;
	}
	public void imprimeTodo(){
		indicaTipoPersonal();
		Leer.mostrarEnPantalla(NOMBRE_EMPRESA);
		imprimeNombre();
		imprimeEdad();
		Leer.mostrarEnPantalla(""+porcentajeIncremento);
		Leer.mostrarEnPantalla(""+sueldoBase);
		return;
	}
}