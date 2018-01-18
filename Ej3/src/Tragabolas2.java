import java.util.Scanner;



public class Tragabolas2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int opcionmenu;
		int salida=0;
		int maxbolas;
		String color;
		TragaBolas tragabolas = new TragaBolas();
		
		while (salida==0){
			System.out.println("Elija una de las siguientes opciones: ");
			System.out.println("1. Crear Tragabolas");
			System.out.println("2. Darle de comer");
			System.out.println("3. Hacerle dormir");
			System.out.println("4. Ver estado");
			System.out.println("5. Salir");
			System.out.print("Introduzca su opcion: ");
			
			do{
				opcionmenu = teclado.nextInt(); // Permitimos acceso al usuario
				teclado.nextLine();
			}while( opcionmenu < 1 && opcionmenu > 5); // Limitamos el uso a las opciones especificadas
			
			
			switch (opcionmenu) { // creamos un switch para las funciones que queremos asignar a cada opci�n
			case 1:
					System.out.print("Introduzca un color: ");
					color = teclado.nextLine();
					System.out.print("introduzca n�mero m�ximo de bolas: ");
					maxbolas = teclado.nextInt();
					tragabolas.crearTragaBolas(color, maxbolas);
					System.out.println();
				break;
			case 2:
					tragabolas.darComer();
					System.out.println();
				break;
			case 3:
				System.out.println("Bolas comidas "+tragabolas.bolasComidas);
				
				tragabolas.dormir(teclado.nextLine());
				
				break;
			case 4:
				System.out.println("Bolas comidas "+tragabolas.bolasComidas);
				
				tragabolas.estado(teclado.nextLine());
				break;
			case 5:
				salida=1;
				break;
			}
		}
	}
}
