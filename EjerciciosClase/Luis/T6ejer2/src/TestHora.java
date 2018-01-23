import java.util.*;
public class TestHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcl = new Scanner(System.in);
		hora reloj = new hora();
		
		System.out.println("---- AQUI TIENES TU RELOJ -----");
		System.out.println(reloj.getHora()+":"+ reloj.getMinutos() + ":" + reloj.getSegundos());
		System.out.println("-------------------------------");
		//Ponemos el reloj en hora
		
		System.out.println("----Introduce hora----");
		reloj.cambiarHora(tcl.nextInt());
		System.out.println("----Introduce minutos----");
		reloj.cambiarMinutos(tcl.nextInt());
		System.out.println("----Introduce segundos----");
		reloj.cambiarSegundos(tcl.nextInt());
		
		System.out.println("---- AQUI TIENES TU RELOJ ACTUAL -----");
		System.out.println(reloj.getHora()+":"+ reloj.getMinutos() + ":" + reloj.getSegundos());
		System.out.println("-------------------------------");
		
		//bucle ¿Cuanto rato quieres ver el reloj?
		int tiempo=0;
		System.out.println("Introduce el tiempo en segundos");
		tiempo = tcl.nextInt();
		for (int k=0; k<tiempo; k++){
			reloj.sumarSegundos();
			System.out.println(reloj.getHora()+":"+ reloj.getMinutos() + ":" + reloj.getSegundos());
		}
		System.out.println("---- AQUI TIENES TU RELOJ ACTUAL -----");
		System.out.println(reloj.getHora()+":"+ reloj.getMinutos() + ":" + reloj.getSegundos());
		System.out.println("-------------------------------");
		
		
	}

}
