
public class hora {
	private Integer hora;
	private Integer minutos;
	private Integer segundos;
	private Integer horaM;
	private Integer minutosM;
	private Integer segundosM;
	
	hora(){
		hora = 0;
		minutos = 0;
		segundos = 0;
		horaM = 24;
		minutosM = 60;
		segundosM = 60;
	}
	
	//getters--------------
	public int getHora() {
		return hora;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	public int getMinutos() {
		return minutos;
	}
	//-------------------------
	
	public void cambiarHora(Integer h){
			if (h > -1 && h < 25){
			hora =  h;
			if (hora == 24){
				hora=0;
			}
		}
		if (h >= 25){
			 
		}
	}
	
	public void cambiarMinutos(Integer m){
		if (m > -1){
			minutos=m;
			if ( minutos >= 60){
			 hora=hora+minutos/60;
			 minutos = 0;
		 }
		} 
		if (hora == 24){
			hora=0;
		}
	}
	
	public void cambiarSegundos(Integer s){
		if ( s > -1 ){
			segundos=s;
			if ( segundos >= 60){
				 minutos=minutos+s/60;
				 segundos = 0;
			}
			if ( minutos == 60){
				hora++;
			}
			if (hora == 24){
				hora=0;
			}
		}
	}
	
	public void sumarSegundos(){
		segundos++;
		if ( segundos >= 60){
			 minutos++;
			 segundos = 0;
		 } 
		if ( minutos >= 60){
			hora++;
			minutos = 0;
		}
		if (hora == 24){
			hora=0;
		}
	}
	
	
}
