package concesionaria.autos.motos.onready;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Auto extends Vehiculo {

	private int puerta;

	public Auto(String marca, String modelo, double precio, int puerta) {

		super(marca, modelo, precio);

		this.puerta = puerta;

	}

	@Override
	public void listVehiculos() {

		DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

		System.out.println("Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + puerta
				+ " // Precio: $" + df.format(new BigDecimal(getPrecio()).floatValue()));

	}

}
