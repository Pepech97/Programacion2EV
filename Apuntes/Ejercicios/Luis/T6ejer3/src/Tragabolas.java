
public class Tragabolas {
	private String color;
	private Integer maxBolas, bolasComidas;
	
	public Tragabolas(){
		bolasComidas=0;
		maxBolas=0;
		color="";
	}
	
	public void tragaBolas(String colorea, int numero){
		color=colorea;
		maxBolas=numero;
		System.out.println("Creando...");
	}
	
	public void visualizar(){
		System.out.println("El color de tu tragabolas es: " + color);
		System.out.println("Ha comido este numero de bolas: " + bolasComidas);
		System.out.println("Su maximo es: " + maxBolas);
	}


	public void comer(){
		for (bolasComidas= bolasComidas; bolasComidas < maxBolas;bolasComidas++){
			System.out.println("He comido una bola");
		}
	}
	
	public void trotar(){
		String error = "No has comido ninguna bola para trotar";
		String error2 = "Ya no queda ninguna bola para trotar";
		int comiendo= 0;
		while (bolasComidas > 0){
			System.out.println("Estoy trotando... Quedan :" +bolasComidas);
			bolasComidas--;
			comiendo++;
		}
		
		if (comiendo != 0) {
			System.out.println(error2);
		}
		else{
			System.out.println(error);
		}
	}
	
	
	public void dormir(){
		String durmiendo = "Estoy durmiendo Zzzz...";
		if(bolasComidas == maxBolas){
			System.out.println(durmiendo);
			bolasComidas=bolasComidas/2;
		}else{
			System.out.println("Error: No tienes la tripa llena para dormir");
		}
		
	}
	
	
}


