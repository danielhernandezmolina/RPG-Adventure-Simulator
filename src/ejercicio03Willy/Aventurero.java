package ejercicio03Willy;

public class Aventurero {

	private static int contadorIds = 0;

	private int id;
	private String nombre;
	private int nivel;
	private Arma arma;

	public Aventurero(String nombre, int nivel) {

		this.id = contadorIds++; // Asigna un ID automaticamente
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
			System.out.println("El aventurero " + nombre + " ataca con los puños. Daño: 1");
		} else {
			System.out.println("El aventurero " + nombre + " " + arma.toString());
		}
	}

	public void equiparArma(Arma nuevaArma) {
		
		this.arma = nuevaArma;
		
		if (arma == null) {
			System.out.println("Se ha asignado correctamente el arma al Aventurero " + nombre);
		} else {
			System.out.println(toString());
		}
	}

	public static int getContadorIds() {
		return contadorIds;
	}

	@Override
	public String toString() {
		return "Aventurero [id=" + id + ", Nombre=" + nombre + ", Nivel=" + nivel + ", " + arma + "]";
	}

}
