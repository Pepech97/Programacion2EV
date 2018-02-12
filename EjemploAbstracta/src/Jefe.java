import utilidades.Leer;

public class Jefe extends Empleado {
	private String departJefe;
	private static Integer plus = 250;

	public Jefe(String nombre, Integer edad, Integer porcentajeIncremento, String departJefe) {
		super(nombre, edad, porcentajeIncremento);
		this.departJefe = departJefe;
	}
	
	public Double cobrar(){
		Double cantidad = getSueldoBase() * (1 + (double)getPorcentajeIncremento()/100) +plus;
		return cantidad;
	}
	
	public static void indicaTipoPersonal() {
		System.out.println("\tESTE EMPLEADO ES RESPONSABLE DE UN DEPARTAMENTO.");
	}
	
	

	public void imprimeDepart(){
		System.out.println("\t\tEJERCE LA JEFATURA DE: " + departJefe);
		return;
	}

	public void imprimeTodo(){
		super.imprimeTodo();
		indicaTipoPersonal();
		imprimeDepart();
	}
	
}
