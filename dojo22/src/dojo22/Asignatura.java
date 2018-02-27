package dojo22;

public class Asignatura {
	private String nombre;
	private Integer horas;
	private Integer nivel;
	public Asignatura(String nombre, Integer horas, Integer nivel) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
}
