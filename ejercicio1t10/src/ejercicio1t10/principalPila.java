package ejercicio1t10;

public class principalPila {
	public static void main(String[] args) {
		PILA pila1[]=new PILA[500];
		String tipo[]={"revista","ficha","plato"};
		int cuantos=0;
		cuantos=Leer.pedirEntero("Cuantos elementos pones en la pila");
		rellenarV(pila1, tipo, cuantos);
		for (int i = 0; i < pila1.length; i++) {
			if(pila1[i]!=null){
			System.out.println(pila1[i].getTipo());
			}
		}
	}
	public static PILA rellenarV(PILA[] pila1, String[] tipo, int cuantos) {
		for (int i = 0; i < pila1.length&& cuantos>0;i++) {
			if(pila1[i] ==null){
				pila1[i]=new PILA(tipo[(int)(Math.random()*3)]);
				cuantos--;
			}
		}
		return null;
	}
}
