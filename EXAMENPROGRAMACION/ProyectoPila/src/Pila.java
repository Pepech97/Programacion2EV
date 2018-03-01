import java.util.Arrays;

public class Pila {

	private Integer[] vector;
	private Integer cima;

	public Pila() {
		vector = new Integer[500];
		cima = 0;
	}

	public Boolean estaLlena() {
		if (cima == 500) {
			return true;
		} else {
			return false;
		} // if
	}

	public Boolean estaVacia() {
		if (cima == 0) {
			return true;
		} else {
			return false;
		} // if
	}

	public void add(Integer numero) {
		if (!estaLlena()) {
			vector[cima] = numero;
			cima++;
		}
	}// add

	public Integer pop() {
		cima--;
		return vector[cima];
	}// pop

	public Integer getCima() {
		return cima;
	}

	public void copiar(Pila destino) {
		destino.vector = Arrays.copyOf(this.vector, this.vector.length);
		destino.cima = this.cima;
	}// copiar

	public void borrar() {
		cima = 0;
	}// borrar

	public void invertir() {
		Integer aux[] = new Integer[500];
		int indAux, i;
		for (i = cima - 1, indAux = 0; i >= 0; i--, indAux++) {
			aux[indAux] = vector[i];
		} // for
		vector = aux;
	}// invertir

	public void invertirElegante() {
		Integer indIzda = 0, indDcha = cima - 1, aux;
		while (indDcha >= 0) {
			aux = vector[indIzda];
			vector[indIzda] = vector[indDcha];
			vector[indDcha] = aux;
			indIzda++;
			indDcha--;
		}
	}
}// Pila
