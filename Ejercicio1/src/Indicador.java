
public class Indicador {
		private int nivel;
		private int velocidad;
		private int tacometro;
		public Indicador(int nivel, int velocidad, int tacometro) {
			super();
			this.nivel = nivel;
			this.velocidad = velocidad;
			this.tacometro = tacometro;
		}
		public int getNivel() {
			return nivel;
		}
		public void setNivel(int nivel) {
			this.nivel = nivel;
		}
		public int getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		public int getTacometro() {
			return tacometro;
		}
		public void setTacometros(int tacometro) {
			this.tacometro = tacometro;
		}
		public void minimos(int menu,int determinado){
			if (menu==1){
			velocidad=determinado;
			nivel=determinado;
			tacometro=determinado;
			System.out.println(velocidad);
			System.out.println(nivel);
			System.out.println(tacometro);
			}
			if (menu==2){
				System.out.println(velocidad);
				System.out.println(nivel);
				System.out.println(tacometro);
			}
			if(menu==3){
				
			}
		}
}