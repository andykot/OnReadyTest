package concesionaria.autos.motos.onready;

public abstract class Vehiculo implements Comparable<Vehiculo> {

	private String marca;
	private String modelo;
	private double precio;

	public Vehiculo(String marca, String modelo, double precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;

	}

	public Vehiculo() {

	}

	public abstract void listVehiculos(); 

	@Override
	public int compareTo(Vehiculo a) {

		int result = 0;
		if (this.precio < a.precio) {
			result = -1;

		} else if (this.precio > a.precio) {
			result = 1;
		}
		return result;

	}

	public String getMarca() {
		return marca;
	}

	// public void setMarca(String marca) { 
	// this.marca = marca;
	// }

	public String getModelo() {
		return modelo;
	}

	// public void setModelo(String modelo) {
	// this.modelo = modelo;
	// }

	public double getPrecio() {
		return precio;
	}

	// public void setPrecio(double precio) {
	// this.precio = precio;
	// }

}
