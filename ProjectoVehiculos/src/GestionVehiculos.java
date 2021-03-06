public class GestionVehiculos {
	public static void main (String args [] ) {
			
		Vehiculo vehiculo1 = new Vehiculo (4,150,20,4000);
		Vehiculo vehiculo2 = new Vehiculo (5,200,0,6000);
		mostrar(vehiculo1);
		Leer.mostrarEnPantalla("--------------------");
		mostrar(vehiculo2);
		
		if(vehiculo1.esIgual(vehiculo2)){
			System.out.println("\n  -------------------->son iguales");
		}else{
			System.out.println("\n  -------------------->son distintos");
		}
		
		vehiculo1.copia(vehiculo2);
		
		Leer.mostrarEnPantalla("******************");
		
		mostrar(vehiculo1);
		Leer.mostrarEnPantalla("--------------------");
		mostrar(vehiculo2);
		
		if(vehiculo1.esIgual(vehiculo2)){
			System.out.println("\n  -------------------->son iguales");
		}else{
			System.out.println("\n  -------------------->son distintos");
		}
		
		
		Leer.mostrarEnPantalla("\n----------------------Cambiamos las ruedas de vehiculo2");
		vehiculo2.setNumeroRuedas(8000);
		mostrar(vehiculo1);
		Leer.mostrarEnPantalla("--------------------");
		mostrar(vehiculo2);
		if(vehiculo1.esIgual(vehiculo2)){
			System.out.println("\n  -------------------->son iguales");
		}else{
			System.out.println("\n  -------------------->son distintos");
		}
		
		
	}//main

	public static void mostrar(Vehiculo v){
		Leer.mostrarEnPantalla("numero de ruedas: " + v.getNumeroRuedas());
		Leer.mostrarEnPantalla("peso: " + v.getPeso());
		Leer.mostrarEnPantalla("velocidadActual: " + v.getVelocidadActual());
		Leer.mostrarEnPantalla("velocidadMax: " + v.getVelocidadMax());
	}//mostrar
}