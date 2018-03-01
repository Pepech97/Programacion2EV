import utilidades.*;

public class Principal {

	public static void main(String[] args) {
		Fecha hoy = new Fecha(19, 2, 2018);
		boolean salir = false;
		Empleado empresa[] = new Empleado[20];

		Leer.mostrarEnPantalla("----- INICIO DEL PROGRAMA -----");
		Leer.mostrarEnPantalla("Creando primeros empleados...");
		crearEmpleado(empresa);

		do {
			Leer.mostrarEnPantalla("1-CREAR RESPONSABLE");
			Leer.mostrarEnPantalla("2-CREAR TECNICO");
			Leer.mostrarEnPantalla("3-CREAR ADMINISTRATIVO");
			Leer.mostrarEnPantalla("4-VISUALIZAR PLANTILLA");
			Leer.mostrarEnPantalla("5-CALCULAR NOMINA EMPRESA");
			Leer.mostrarEnPantalla("6-CAMBIAR BONOS");
			int opcion = Leer.pedirEntero("*****SELECCIONA UNA OPCION****");
			switch (opcion) {
			case 1:
				crearResponsable(empresa);
				break;
			case 2:
				crearTecnico(empresa);
				break;
			case 3:
				crearAdministrativo(empresa);
				break;
			case 4:
				Leer.mostrarEnPantalla("------JEFES------");
				for (int i = 0; i < empresa.length; i++) {
					if (empresa[i] instanceof Responsable) {
						empresa[i].visualizaTodo();
						Leer.mostrarEnPantalla("\n******");
					}
				}
				Leer.mostrarEnPantalla("-----------------");
				Leer.mostrarEnPantalla("------ADMINISTRATIVOS------");
				for (int i = 0; i < empresa.length; i++) {
					if (empresa[i] instanceof Administrativo) {
						empresa[i].visualizaTodo();
					}
				}
				Leer.mostrarEnPantalla("-----------------");
				Leer.mostrarEnPantalla("------TECNICOS------");
				for (int i = 0; i < empresa.length; i++) {
					if (empresa[i] instanceof Tecnico) {
						empresa[i].visualizaTodo();
					}
				}
				break;
			case 5:
				float suma = 0;
				Leer.mostrarEnPantalla("------JEFES------");
				for (int i = 0; i < empresa.length; i++) {
					if (empresa[i] instanceof Responsable) {
						Leer.mostrarEnPantalla(empresa[i].getNombre());
						Leer.mostrarEnPantalla(empresa[i].calculoNomina()+ "€");
						Leer.mostrarEnPantalla("\n******");
						suma = suma + empresa[i].calculoNomina();
					}
				}
				Leer.mostrarEnPantalla("-----------------");
				Leer.mostrarEnPantalla("------ADMINISTRATIVOS------");
				for (int i = 0; i < empresa.length; i++) {
					if (empresa[i] instanceof Administrativo) {
						Leer.mostrarEnPantalla(empresa[i].getNombre());
						Leer.mostrarEnPantalla(empresa[i].calculoNomina()+ "€");
						suma = suma + empresa[i].calculoNomina();

					}
				}
				Leer.mostrarEnPantalla("-----------------");
				Leer.mostrarEnPantalla("------TECNICOS------");
				for (int i = 0; i < empresa.length; i++) {
					if (empresa[i] instanceof Tecnico) {
						Leer.mostrarEnPantalla(empresa[i].getNombre());
						Leer.mostrarEnPantalla(empresa[i].calculoNomina()+ "€");
						suma = suma + empresa[i].calculoNomina();

					}
				}
				System.out.println();
				System.out.println("SUMA TOTAL EMPRESA******");
				Leer.mostrarEnPantalla(suma+"");
				break;
			case 6:
				modificarStatics();


			default:
				break;
			}

		} while (salir == false);

	}

	private static void modificarStatics() {
		Leer.mostrarEnPantalla("¿Quieres cambiar el salario base?");
		System.out.println("1-Si");
		System.out.println("0-N0");
		int opcion1 = Leer.pedirEntero("¿Quieres cambiar?");
		if (opcion1==1) {
			System.out.println(Empleado.getSalarioBase() + " Es el salario base actual ");
			Float salarioBase= Leer.pedirFloat("¿Cuanto quieres que sea el salario inicial?");
			Empleado.setSalarioBase(salarioBase);
		}

		Leer.mostrarEnPantalla("¿Quieres cambiar el el plus de responsabilidad?");
		System.out.println("1-Si");
		System.out.println("0-N0");
		int opcion2 = Leer.pedirEntero("¿Quieres cambiar?");
		if (opcion2==1) {
			System.out.println(Responsable.getPlusResponsabilidad() + " Es el plus de responsabilidad actual ");
			Float salarioBase= Leer.pedirFloat("¿Cuanto quieres que sea el plus de responsabilidad?");
			Responsable.setPlusResponsabilidad(salarioBase);
		}

		Leer.mostrarEnPantalla("¿Quieres cambiar el el plus de antiguedad?");
		System.out.println("1-Si");
		System.out.println("0-N0");
		int opcion3 = Leer.pedirEntero("¿Quieres cambiar?");
		if (opcion3==1) {
			System.out.println(Administrativo.getPlusAntiguedad() + " Es el plus de responsabilidad actual ");
			Float salarioBase= Leer.pedirFloat("¿Cuanto quieres que sea el plus de responsabilidad?");
			Administrativo.setPlusAntiguedad(salarioBase);
		}
	}

	public static void crearEmpleado(Empleado empleados[]) {
		String nombres[] = { "Luis", "Pepe", "Diego", "Christian" };
		String departamentos[] = { "IT", "Marketing", "Ventas", "Peluqueria", "lolo" };
		String especialidades[] = { "Redes", "Programacion", "Bases de datos", "Maquillar", "Front end" };
		Float especialidadesPlus[] = { 0.1f, 0.2f, 0.3f, 0.4f, 0.5f };
		for (int i = 0; i < 1; i++) {
			Fecha newFecha;
			Fecha newFechaing;
			do {
				newFecha = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
						(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
				newFechaing = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
						(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
			} while ((newFechaing.getAnio() - newFecha.getAnio()) < 18);
			empleados[i] = new Responsable(nombres[(int) (Math.random() * 4)], newFecha, newFechaing,
					(float) (Math.random() * 4), departamentos[(int) (Math.random() * 5)]);
		}
		for (int i = 1; i < 4; i++) {
			Fecha newFecha;
			Fecha newFechaing;
			do {
				newFecha = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
						(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
				newFechaing = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
						(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
			} while ((newFechaing.getAnio() - newFecha.getAnio()) < 18);
			empleados[i] = new Administrativo(nombres[(int) (Math.random() * 4)], newFecha, newFechaing,
					departamentos[(int) (Math.random() * 5)], empleados[0]);
		}

		for (int i = 4; i < 8; i++) {
			int plus = (int) (Math.random() * 5);
			Fecha newFecha;
			Fecha newFechaing;
			do {
				newFecha = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
						(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
				newFechaing = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
						(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
			} while ((newFechaing.getAnio() - newFecha.getAnio()) < 18);
			empleados[i] = new Tecnico(nombres[(int) (Math.random() * 4)], newFecha, newFechaing,
					especialidades[plus], especialidadesPlus[plus], empleados[0]);
		}
	}

	public static void crearResponsable(Empleado empleados[]) {
		String nombres[] = { "Luis", "Pepe", "Diego", "Christian" };
		String departamentos[] = { "IT", "Marketing", "Ventas", "Peluqueria", "lolo" };
		Fecha newFecha;
		Fecha newFechaing;
		do {
			newFecha = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
			newFechaing = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
		} while ((newFechaing.getAnio() - newFecha.getAnio()) < 18);
		empleados[Empleado.getSiguiente()] = new Responsable(nombres[(int) (Math.random() * 4)], newFecha,
				newFechaing, (float) Math.random() * 4,
				departamentos[(int) Math.random() * 5]);
	}

	public static void crearTecnico(Empleado empleados[]) {
		String nombres[] = { "Luis", "Pepe", "Diego", "Christian" };
		String departamentos[] = { "IT", "Marketing", "Ventas", "Peluqueria", "lolo" };
		String especialidades[] = { "Redes", "Programacion", "Bases de datos", "Maquillar", "Front end" };
		Float especialidadesPlus[] = { 0.1f, 0.2f, 0.3f, 0.4f, 0.5f };
		int plus = (int) (Math.random() * 5);
		Fecha newFecha;
		Fecha newFechaing;
		do {
			newFecha = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
			newFechaing = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
		} while ((newFechaing.getAnio() - newFecha.getAnio()) < 18);
		Leer.mostrarEnPantalla("****JEFES****\n");
		for (int i = 0; i < empleados.length; i++) {

			if (empleados[i] instanceof Responsable) {
				empleados[i].visualizaTodo();
				Leer.mostrarEnPantalla("\n\n");

			}
		}
		int jefeNumero = Leer.pedirEntero("¿Que jefe quieres asignarle?");

		Boolean salir = false;
		for (int i = 0; i < empleados.length && salir == false; i++) {

			if (empleados[i] instanceof Responsable && empleados[i].getNumeroEmpleado().equals(jefeNumero)) {
				empleados[Empleado.getSiguiente()] = new Tecnico(nombres[(int) (Math.random() * 4)], newFecha,
						newFechaing, especialidades[plus], especialidadesPlus[plus],
						empleados[i]);
				salir = true;
			}

		}
	}

	public static void crearAdministrativo(Empleado empleados[]) {
		String nombres[] = { "Luis", "Pepe", "Diego", "Christian" };
		String departamentos[] = { "IT", "Marketing", "Ventas", "Peluqueria", "lolo" };
		Fecha newFecha;
		Fecha newFechaing;
		do {
			newFecha = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
			newFechaing = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
		} while ((newFechaing.getAnio() - newFecha.getAnio()) < 18);

		for (int i = 0; i < empleados.length; i++) {

			if (empleados[i] instanceof Responsable) {
				empleados[i].visualizaTodo();
			}
		}
		int jefeNumero = Leer.pedirEntero("¿Que jefe quieres asignarle?");

		Boolean salir = false;
		for (int i = 0; i < empleados.length && salir == false; i++) {

			if (empleados[i] instanceof Responsable && empleados[i].getNumeroEmpleado().equals(jefeNumero)) {
				empleados[Empleado.getSiguiente()] = new Administrativo(nombres[(int) (Math.random() * 4)], newFecha,
						newFechaing, departamentos[(int) (Math.random() * 5)], empleados[i]);
				salir = true;

			}

		}



	}
}	