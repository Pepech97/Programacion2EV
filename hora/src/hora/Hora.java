package hora;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;

	public Hora(int hora, int minuto, int segundo) {
		super();
		if(hora>0 && hora<24){
			this.hora = hora;
		}
		else{
			System.out.println("Horas erroneas");
			hora=0;
		}
		if(minuto>0 && minuto<60){
			this.minuto = minuto;
		}
		else{
			System.out.println("Minutos erroneos");
			minuto=0;
		}
		if(segundo>0 && segundo<60){
			this.segundo = segundo;
		}
		else{
			System.out.println("Segundos erroneos");
			segundo=0;
		}
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if(hora>0 && hora<24){
			this.hora = hora;
		}
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto>0 && minuto<60){
			this.minuto = minuto;
		}
		else{
			System.out.println("Minutos erroneos");
			minuto=0;
		}
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if(segundo>0 && segundo<60){
			this.segundo = segundo;
		}
		else{
			System.out.println("Segundos erroneos");
			segundo=0;
		}
	}
	public int horaSegundos(int hora){
		int segundo=0;
		while(hora>0){
			hora--;
			segundo=segundo+3600;
		}
		return segundo;
	}
	public void relojdigital () throws InterruptedException{
		int contador=0;
		while(contador==0){
			if(segundo==60){
				segundo=0;
				minuto++;
			}
			if(minuto==60){
				minuto=0;
				hora++;
			}
			if(hora==24){
				hora=0;
			}
			System.out.printf("%02d:%02d:%02d\n",hora,minuto,segundo);
			segundo++;
			Thread.sleep(1000);
		}
	}
}