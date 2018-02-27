
public class Libro {
	private String titulo;
	private Autor autor;
	private Double precio;
	private int cantidad=0;
	
	public Libro(String titulo, Autor autor, Double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	public Libro(String titulo, Autor autor, Double precio, int cantidad) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void visualizarLibro(){
		Leer.mostrarEnPantalla("Libro [titulo = "+titulo+",\nAutor "+autor.visualizarAutor()+"\nprecio = "+precio+"\ncantidad = "+cantidad+"]");
	}
}
