package ejercicio03Willy;

import java.util.Scanner;

public class Principal {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Aventurero aventurero1 = new Aventurero("Conan", 10);
		Aventurero aventurero2 = new Aventurero("Gandfalf", 20);

		System.out.println("The total number of adventurers is: " + Aventurero.getContadorIds());

		int option = 0;
		int seleccionAventurero = 0;

		do {

			System.out.println("---- Game Menu ----");
			System.out.println("1. Equip weapon");
			System.out.println("2. Attack");
			System.out.println("3. View status");
			System.out.println("4. Exit");

			option = Integer.parseInt(scanner.nextLine()); // Ask the user for the new option value

			switch (option) {
			// The user chooses an adventurer, weapon data is requested, an Arma object is created 
			// and assigned to the adventurer
			case 1:

				seleccionAventurero = seleccionarAventurero();

				System.out.println("Please provide the following information: ");

				System.out.println("Enter weapon name: ");
				String arma = scanner.nextLine();

				System.out.println("Enter weapon damage: ");
				int dañoArma = scanner.nextInt();
				scanner.nextLine(); // Clear the buffer IMPORTANT

				Arma nuevaArma = new Arma(arma, dañoArma); // Create a new weapon with the info 
															// provided by the user
				
				if (seleccionAventurero == 1) {
					aventurero1.equiparArma(nuevaArma); // Assign to Adventurer 1

				} else {
					aventurero2.equiparArma(nuevaArma); // Assign to Adventurer 2
				}

				break;

			// The user chooses an adventurer and the attack is executed
			case 2:

				seleccionAventurero = seleccionarAventurero();

				if (seleccionAventurero == 1) {
					aventurero1.atacar();

				} else {
					aventurero2.atacar();
					
				}
				break;

			// Shows the toString information of the adventurers
			case 3:

				seleccionAventurero = seleccionarAventurero();

				if (seleccionAventurero == 1) {
					System.out.println(aventurero1.toString());
				} else {
					System.out.println(aventurero2.toString());
				}

				break;

			// Exit
			case 4:

				System.out.println("Thank you for using this application.");

				break;

			default:
				break;
			}

		} while (option != 4); // Repeats until 4 (Exit) is pressed

	}

	public static int seleccionarAventurero() {

		int eleccionUsuario = 0;

		do {
			try {

				System.out.println("Choose an adventurer:");
				System.out.println("1. First adventurer: Conan");
				System.out.println("2. Second adventurer: Gandfalf");
				
				// We use this option to avoid buffer issues
				eleccionUsuario = Integer.parseInt(scanner.nextLine()); 

				if (eleccionUsuario == 1 || eleccionUsuario == 2) {
					System.out.println("Perfect, adventurer selected successfully");
				} else {
					System.out.println("Please select a valid number (1 or 2)");
				}

			} catch (java.lang.NumberFormatException e) { // To handle letter input errors
				System.out.println("Please enter a valid number");
				
			}

		} while (eleccionUsuario != 1 && eleccionUsuario != 2);
		return eleccionUsuario;

	}

}
