
public class Vehiculo {
	private Integer numeroRuedas;
	private Integer velocidadMax;
	private Integer velocidadActual;
	private Integer peso;


	public Vehiculo(Integer numeroRuedas, Integer velocidadMax, Integer velocidadActual, Integer peso) {
		super();
		this.numeroRuedas = numeroRuedas;
		this.velocidadMax = velocidadMax;
		this.velocidadActual = velocidadActual;
		this.peso = peso;
	}
	public Integer getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(Integer numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	public Integer getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(Integer velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	public Integer getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(Integer velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Boolean esIgual(Vehiculo otroVehiculo){
		Boolean sonIguales = true;// antes de empezar suponemos que son iguales
		if (!this.numeroRuedas.equals(otroVehiculo.numeroRuedas)){//si no tienen el mismo numero de ruedas
			sonIguales = false;//verdadera
		}else if(this.peso.equals(otroVehiculo.peso)==false){//si no tienen el mismo peso
			sonIguales = false;
		}else if(!this.velocidadMax.equals(otroVehiculo.velocidadMax)){
			sonIguales = false;
		}else if(!this.velocidadActual.equals(otroVehiculo.velocidadActual)){
			sonIguales = false;
		}
		return sonIguales;
	}//esIgual


	public void copia(Vehiculo destino){
		destino.numeroRuedas = numeroRuedas;
		destino.peso = peso;
		destino.velocidadActual = velocidadActual;
		destino.velocidadMax = velocidadMax;
	}
}//class
