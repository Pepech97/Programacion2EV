package hora;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner (System.in);
		Hora mihora=new Hora (1,1,1);
		System.out.println("Introduce cuantas horas quieres pasar a segundos");
		System.out.println(mihora.horaSegundos(teclado.nextInt()));
		System.out.println("Introduce las horas");
		mihora.setHora(teclado.nextInt());
		System.out.println("Introduce los minutos");
		mihora.setMinuto(teclado.nextInt());
		System.out.println("Introduce los segundos");
		mihora.setSegundo(teclado.nextInt());
		mihora.relojdigital();
	}
}
