import java.util.Scanner;

public class Indicadorp {
	
	public static void main(String[] args){
		
		Scanner teclado =new Scanner (System.in);
		Indicador indicadorp = new Indicador (0,0,0);
		indicadorp.minimos(teclado.nextInt(), 5);
	}
}
