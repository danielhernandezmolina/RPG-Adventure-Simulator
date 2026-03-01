package ejercicio03Willy;

import java.util.Scanner;

public class Principal {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Aventurero aventurero1 = new Aventurero("Conan", 10);
		Aventurero aventurero2 = new Aventurero("Gandfalf", 20);

		System.out.println("El numero total de aventureros es: " + Aventurero.getContadorIds());

		int option = 0;
		int seleccionAventurero = 0;

		do {

			System.out.println("---- Menu Juego ----");
			System.out.println("1. Equipar arma");
			System.out.println("2. Atacar");
			System.out.println("3. Ver estado");
			System.out.println("4. Salir");

			option = Integer.parseInt(scanner.nextLine()); // preguntamos al usuario por el nuevo valor de option

			switch (option) {
			// El usuario elige un aventurero, se piden datos del arma, crea objeto Arma y
			// lo asigna al aventurero
			case 1:

				seleccionAventurero = seleccionarAventurero();

				
				//scanner.nextLine(); // Limpio el buffer IMPORTANTE

				System.out.println("Seleccione la siguiente información: ");

				System.out.println("Introduzca nombre del arma: ");
				String arma = scanner.nextLine();

				System.out.println("Introduzca daño del arma: ");
				int dañoArma = scanner.nextInt();
				scanner.nextLine(); // Limpio el buffer IMPORTANTE

				Arma nuevaArma = new Arma(arma, dañoArma); // Creamos una nueva arma con la informacion que
															// nos da
															// el usuario
				
				if (seleccionAventurero == 1) {
					aventurero1.equiparArma(nuevaArma); // Asignamos al Aventurero 1

				} else {
					aventurero2.equiparArma(nuevaArma); // Asignamos al Aventurero 2
				}

				break;

			// El usuario elige aventurero se ejecuta atacar
			case 2:

				seleccionAventurero = seleccionarAventurero();

				if (seleccionAventurero == 1) {
					aventurero1.atacar();

				} else {
					aventurero2.atacar();
					
				}
				
				//scanner.nextLine(); // Limpio el buffer IMPORTANTE
				break;

			// Muestra la informacion toString de los aventureros
			case 3:

				seleccionAventurero = seleccionarAventurero();

				if (seleccionAventurero == 1) {

					System.out.println(aventurero1.toString());
					//scanner.nextLine(); // Limpio el buffer IMPORTANTE
				} else {
					System.out.println(aventurero2.toString());
					//scanner.nextLine(); // Limpio el buffer IMPORTANTE
				}

				break;

			// Salir
			case 4:

				System.out.println("Muchas gracias por utilizar esta aplicacion.");

				break;

			default:
				break;
			}

		} while (option != 4); // Se repite hasta que no pulse 4 (Salir)

	}

	public static int seleccionarAventurero() {

		int eleccionUsuario = 0;

		do {
			try {

				System.out.println("Elige un aventurero:");
				System.out.println("1. Primer aventurero: Conan");
				System.out.println("2. Segundo aventurero: Gandfalf");
				
				//Utilizamos esta opcion para no tener problemas con el buffer 
				eleccionUsuario = Integer.parseInt(scanner.nextLine()); 
				//eleccionUsuario = scanner.nextInt();

				if (eleccionUsuario == 1 || eleccionUsuario == 2) {
					System.out.println("Perfecto, primer aventurero seleccionado con exito");
				} else {
					System.out.println("Seleccione un numero valido (1 o 2)");
				}
				
				//scanner.nextLine();

			} catch (java.lang.NumberFormatException e) { // Para manejar el error de letras
				System.out.println("Introduce un número valido");
				
			}

		} while (eleccionUsuario != 1 && eleccionUsuario != 2);
		return eleccionUsuario;

	}

}
