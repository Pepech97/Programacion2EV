import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		String nombre, departJefe;
		String nombresDepto[] = {"Contabilidad", "Ventas", "Almacen", "Logistica", "Marketing", "Informatica"};
		int edad;
		Empleado empleados[];
		Jefe jefes[];
		int numEmp, numJefes;
		// se crean los empleados
		
		//EmpleadoAbstracta eabs1 = new EmpleadoAbstracta("lolo", 20, 10);
		
		numEmp = Leer.pedirEntero("Indique los empleados que hay en la empresa: ");
		empleados = new Empleado[numEmp];
		
		//System.out.println("\nVamos a insertar los datos de " + numEmp + " empleado: ");
		for (int pos = 0; pos < numEmp; pos++){
			Empleado.indicaTipoPersonal();

			nombre = Leer.pedirCadena("\tNOMBRE: ");

			edad = Leer.pedirEntero("\tEDAD: ");
			empleados[pos] = new Empleado(nombre, edad, 10);
		}
		//se crean los jefes
		numJefes = Leer.pedirEntero("\nIndique el número de jefes que hay en la empresa: ");
		jefes = new Jefe[numJefes];
		
		//System.out.println("\nVamos a insertar los datos de " + numJefes + " jefes: ");
		for (int pos = 0; pos < numJefes; pos++){
			Jefe.indicaTipoPersonal();
			nombre = Leer.pedirCadena("\tNOMBRE: ");
			edad = Leer.pedirEntero("\tEDAD: ");
			//departJefe=Leer.pedirCadena("\tDEPARTAMENTO: ");
			jefes[pos] = new Jefe(nombre, edad,(int)(Math.random()*15+1), nombresDepto[(int)(Math.random()*nombresDepto.length)] );
			
		}
		visualtodosJefes(jefes);
		visualtodosEmpleados(empleados);
	}

	static void visualtodosEmpleados(Empleado empleados[]) {
		int pos;
		Leer.mostrarEnPantalla("\n***************************************************************");
		Leer.mostrarEnPantalla("Los datos de los empleados (que no son jefes) en la empresa son: ");
		Leer.mostrarEnPantalla("\n***************************************************************");
		for (pos = 0; pos < empleados.length; pos++) {
			empleados[pos].imprimeTodo();
			Leer.mostrarEnPantalla("___________________________");
			Leer.pedirCadena("Pulse una tecla para continuar con la ejecución del programa:\n");
			
		}
	}

	static void visualtodosJefes(Jefe jefes[]) {
		int pos;
		Leer.mostrarEnPantalla("\n**************************************************");
		Leer.mostrarEnPantalla("Los datos de los jefes que hay en la empresa son: ");
		Leer.mostrarEnPantalla("\n**************************************************");
		for (pos = 0; pos < jefes.length; pos++) {
			jefes[pos].imprimeTodo();
			Leer.mostrarEnPantalla("___________________________");
			Leer.pedirCadena("Pulse una tecla para continuar con la ejecución del programa:\n");			
		}
	}
}
