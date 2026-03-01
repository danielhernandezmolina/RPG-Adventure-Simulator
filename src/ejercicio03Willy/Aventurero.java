package ejercicio03Willy;

public class Aventurero {

	private static int contadorIds = 0;

	private int id;
	private String nombre;
	private int nivel;
	private Arma arma;

	public Aventurero(String nombre, int nivel) {

		this.id = contadorIds++; // Automatically assigns an ID
		this.nombre = nombre;
		this.nivel = nivel;
		this.arma = null;
	}

	public Aventurero() {
		this.id = contadorIds++;
		this.nombre = "";
		this.nivel = 0;
		this.arma = null;
	}

	public void atacar() {
		if (arma == null) {
			System.out.println("The adventurer " + nombre + " attacks with their fists. Damage: 1");
		} else {
			System.out.println("The adventurer " + nombre + " " + arma.toString());
		}
	}

	public void equiparArma(Arma nuevaArma) {
		
		this.arma = nuevaArma;
		
		if (arma == null) {
			System.out.println("The weapon has been successfully assigned to Adventurer " + nombre);
		} else {
			System.out.println(toString());
		}
	}

	public static int getContadorIds() {
		return contadorIds;
	}

	@Override
	public String toString() {
		return "Adventurer [id=" + id + ", Name=" + nombre + ", Level=" + nivel + ", " + arma + "]";
	}

}
