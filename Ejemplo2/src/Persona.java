import utilidades.Leer;

public class Persona extends Mamifero {

	private String profesion;

	public Persona(String profesion, int numhuesos, int numextremidades, int numcrias) {
		super(numhuesos, numextremidades, numcrias);
		System.out.print(" y persona");
	}

	void insertarDatosPers() {

		insertarDatosMamif();
		System.out.print("\t\tProfesión de esta persona: ");
		profesion = Leer.pedirCadena();
	}

	public void visualizarDatos() {

		visDatosMamif();
		System.out.println("\n\t profesión: " + profesion);
	}
}
