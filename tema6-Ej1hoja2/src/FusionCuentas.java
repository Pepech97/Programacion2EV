/**
 * 
 */

/**
 * @author yo
 *
 */
public class FusionCuentas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuentacorriente [] cuentas;
		cuentas = new Cuentacorriente[10];
		String cliente;
		Double saldo;
		Leer.mensaje(cuentas.toString());
		for (int i=0; i<cuentas.length; i++){
			Leer.mensaje(""+cuentas[i]);
		//	Leer.mensaje(cuentas[i].visualiza());
		//	Leer.mensaje(cuentas[i].toString());
		}
		for (int i=0; i<2; i++){
			cliente=Leer.pedirCadena("Nombre del cliente ");
			saldo=Leer.pedirDecimal("Saldo inicial ");
			cuentas[i]=new Cuentacorriente(saldo, cliente);
		}
		Leer.mensaje(cuentas.toString());
		for (int i=0; i<cuentas.length; i++){
			Leer.mensaje(""+cuentas[i]);
			if (i<Cuentacorriente.getSiguiente()-1){
				Leer.mensaje(cuentas[i].visualiza());
			}
		}
		//Menu
		int opcion;
		do {
			Leer.mensaje(" 1.- Crear cuenta");
			Leer.mensaje(" 2.- Visualizar las cuentas");
			Leer.mensaje(" 3.- Ingresar en una cuenta");
			Leer.mensaje(" 4.- Sacar de una cuenta");
			Leer.mensaje(" 5.- Cuantas cuentas hay");
			Leer.mensaje(" 6.- Cerrar cuenta");
			Leer.mensaje(" 7.- Fusionar cuentas");
			Leer.mensaje(" 0.- Fin");

			opcion=Leer.pedirEntero("Elija opci�n ");
			Double importe= -1.0;
			String cuenta="";
			Boolean existe=false, saldosuf;
			switch(opcion){
			case 1://Crear cuenta
				if(Cuentacorriente.getSiguiente()==11){
					Leer.mensaje("L�mite de cuentas alcanzado");
				}else{
					cliente=Leer.pedirCadena("Nombre del cliente ");
					saldo=Leer.pedirDecimal("Saldo inicial ");
					cuentas[Cuentacorriente.getSiguiente()-1]=new Cuentacorriente(saldo, cliente);
				}
				break;
			case 2://visualizar cuentas
				for(int i=0; i<cuentas.length; i++){
					if (cuentas[i]!=null){
						Leer.mensaje(cuentas[i].visualiza());
					}
				}
				break;
			case 3://ingresar en cuenta
				while (importe < 0){
					importe=Leer.pedirDecimal("Teclee importe a ingresar (mayor que cero: ");
				}
				cuenta=Leer.pedirCadena("C�digo de cuenta en la que ingresar");
				for(int i=0; i<Cuentacorriente.getSiguiente()-1; i++){
					if( cuentas[i].getNumero().equals(cuenta)){
						cuentas[i].ingresarEfectivo(importe);
						existe=true;
					}
				}
				if (!existe){
					Leer.mensaje("Cuenta no existente "+cuenta);
				}
				break;
			case 4://sacar de cuenta
				while (importe < 0){
					importe=Leer.pedirDecimal("Teclee importe a retirar (mayor que cero: ");
				}
				cuenta=Leer.pedirCadena("C�digo de cuenta en la que ingresar");
				for(int i=0; i<Cuentacorriente.getSiguiente()-1; i++){
					if( cuentas[i].getNumero().equals(cuenta)){
						saldosuf=cuentas[i].retirarEfectivo(importe);
						if(!saldosuf){
							Leer.mensaje("No hay saldo suficiente");
						}
						existe=true;
					}
				}
				if (!existe){
					Leer.mensaje("Cuenta no existente "+cuenta);
				}
				break;
			case 5:
				System.out.println(Cuentacorriente.numTotalCuentas());
				break;
			case 6://cerrar cuenta
				int cuentac=Leer.pedirEntero("�Que cuenta quiere cerrar?");
				if (cuentas[cuentac-1] != null){
				cuentas[cuentac-1].CerrarCuenta();
				}
				else{
					System.out.println("La cuenta no existe");
				}
				break;
			case 7://fusionar cuentas
				int cuenta1=Leer.pedirEntero("Primera cuenta que quieres fusionar");
				int cuenta2=Leer.pedirEntero("Segunda cuenta que quieres fusionar");
				Cuentacorriente.FusionCuentas(cuentas[cuenta1-1], cuentas[cuenta2-1]);
			}
		}while (opcion!=0);
	}
}