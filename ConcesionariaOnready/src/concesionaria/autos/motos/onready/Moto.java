package concesionaria.autos.motos.onready;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Moto extends Vehiculo {

	private int cilindrada;

	public Moto(String marca, String modelo, double precio, int cilindrada) {

		super(marca, modelo, precio);

		this.cilindrada = cilindrada;

	}

	@Override
	public void listVehiculos() {

		DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

		System.out.println("Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + cilindrada
				+ "c  // Precio: $" + df.format(new BigDecimal(getPrecio()).floatValue()));

	}
}
