
public class TragaBolas {
		private String color;
		int bolasComidas=0;
		private int maxBolas;
		private int error;
		
		public void crearTragaBolas(String color, int maxBolas) {
			
			if (color.equals("rojo") || color.equals("amarillo") || color.equals("verde") || color.equals("azul")){
				this.color = color;
			}
			else{
				System.out.println("El color especificado no existe"); //Identificador de error en color especificado
				this.color="";
				error=1;
			}
			if (maxBolas>0){ //Especificamos que su máximo son 10 bolas
				this.maxBolas = maxBolas;
			}
			else{
				this.maxBolas = 10;
			}
		}
		public String getColor() {
			return color;
		}
		public int getBolasComidas() {
			return bolasComidas;
		}
		public int getMaxBolas() {
			return maxBolas;
		}
		public int error(){
			return error;
		}
		public void darComer(){ // Sumador de bolas comidas hasta el límite especificado, 10
			if ( bolasComidas < maxBolas ){
				bolasComidas++;
				System.out.println("He comido una bola");
			}
			if (bolasComidas==maxBolas){
				System.out.println("Estoy lleno");
			}
		}
		public void dormir(String respuesta){
			System.out.println("Bolas comidas "+bolasComidas);
			if(bolasComidas==maxBolas){
				if(respuesta.equals("si")){
					System.out.println("Tripa llena. ZZZZZZ");
					bolasComidas=bolasComidas/2;
				}
				else{
					System.out.println("No quiero dormir");
				}
			}
		}
		public void estado(String respuesta){
			System.out.println("Bolas comidas "+bolasComidas);
			if (bolasComidas>0){
				System.out.println("¿Quieres Trotar?");
			}
			if (respuesta.equals("si")){
				bolasComidas--;
			}
		}
}