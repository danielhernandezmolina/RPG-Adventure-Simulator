package ejercicio03Willy;

public class Arma {

	private String nombre;
	private int puntosDaño;

	public Arma(String nombre, int puntosDaño) {
		this.nombre = nombre;
		this.puntosDaño = puntosDaño;
	}

	public Arma() {
		this.nombre = "";
		this.puntosDaño = 0;
	}

	@Override
	public String toString() {
		// Traducido: Weapon y Damage
		return "Weapon= " + nombre + ", Damage= " + puntosDaño;
	}

}
