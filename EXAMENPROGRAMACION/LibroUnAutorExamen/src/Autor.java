
public class Autor {
	private String nombre;
	private char genero;
	private String email;
	private static int siguiente=0;
	public Autor(String nombre, char genero, String email) {
		this.nombre = nombre;
		this.genero = genero;
		this.email = email;
		siguiente++;
	}
	public static int getSiguiente() {
		return siguiente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public char getGenero() {
		return genero;
	}
	public String visualizarAutor(){
		return "[Nombre: "+nombre+"  Email: "+email+"  Genero: "+genero+"]";
	}
	
}
