import java.util.*;
public class TestTragabolas {

	public static void main(String[] args) {
		Scanner tcl = new Scanner (System.in);
		int opcion;
		int numero;
		String color="";
		boolean fin=false;
		Tragabolas tragabolas = new Tragabolas();
		do{
			// TODO Auto-generated method stub
			System.out.println("------- INICIO DEL TRAGABOLAS -------");
			System.out.println("-------  Bienvenido al juego  -------");
			System.out.println("------- Escoja la opcion deseada -------");
			System.out.println("------- 1. Crear Tragabolas  -------");
			System.out.println("------- 2. Comer bolas  -------");
			System.out.println("------- 3. Trotar para bajar la tripa  -------");
			System.out.println("------- 4. Dormir  -------");
			System.out.println("------- 5. Visualizar  -------");
			System.out.println("------- 0. Salir  -------");
			opcion=tcl.nextInt();
			tcl.nextLine();



			do {
				switch(opcion){
				case 1:

					System.out.println("¿Que color quieres para tu trabolas?");
					color=tcl.nextLine();
					color=color.toLowerCase();
					while(color.equals("azul") == false && color.equals("rojo") == false && color.equals("verde") == false && color.equals("amarillo")== false){
						System.out.println("Color incorrecto: Solo puede ser rojo, azul, verde o amarillo");
						color=tcl.nextLine();
						color=color.toLowerCase();
					}
					System.out.println("¿Como de grande quieres su tripa? (Cuantas bolas como maximo)");
					numero=tcl.nextInt();
					tragabolas.tragaBolas(color, numero);
					System.out.println(" TRAGABOLAS CREADO ");
					break;
				case 2:
					tragabolas.comer();
					break;
				case 3:
					tragabolas.trotar();
					break;
				case 4:
					tragabolas.dormir();
					break;
				case 5:
					tragabolas.visualizar();
					break;
				case 0:
					fin = true;
					break;
				}
			}while (opcion == 0);
		}while(fin==false);
	}

}
