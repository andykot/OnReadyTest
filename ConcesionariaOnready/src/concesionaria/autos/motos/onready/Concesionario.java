package concesionaria.autos.motos.onready;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Concesionario implements IBusqueda {

	private ArrayList<Vehiculo> vehi = new ArrayList<Vehiculo>();

	public Concesionario() {

		ArrayList<Vehiculo> vehi;

	}
	
	public void start() {
	
		ListaVehiculos();
		//metodo publico para ser llamado el programa a ejecutarse desde el Main.
	}

	private void ListaVehiculos() {//metodo unico para listar los Vehiculos

		Vehiculo v1 = new Auto("Peugeot", "206", 200000.00, 4);
		Vehiculo v2 = new Moto("Honda", "Titan", 60000.00, 125);
		Vehiculo v3 = new Auto("Peugeot", "208", 250000.00, 5);
		Vehiculo v4 = new Moto("Yamaha", "YBR", 80500.50, 160);

		vehi.add(v1);
		vehi.add(v2);
		vehi.add(v3);
		vehi.add(v4);

		for (Vehiculo vehiculo : vehi) {
			vehiculo.listVehiculos(); 
		}
		
		System.out.println("=============================");

		vehiculoMasCostoso();
		vehiculoMenosCostoso();
		VehiculoConLetra("Y");
		listordenada ();
	}

	private void vehiculoMasCostoso() { 

		Vehiculo mascostoso;
		mascostoso = vehi.get(0);

		for (Vehiculo vehiculo : vehi) {
			if (vehiculo.compareTo(mascostoso) > 0) {
				mascostoso = vehiculo;
			}
		}
		System.out.println("Vehículo más caro : " + mascostoso.getMarca() + " " + mascostoso.getModelo());
	}

	
	private void vehiculoMenosCostoso() { 

		Vehiculo menoscostoso;
		menoscostoso = vehi.get(0);

		for (Vehiculo vehiculo : vehi) {
			if (vehiculo.compareTo(menoscostoso) < 0) {
				menoscostoso = vehiculo;
			}
		}
		System.out.println("Vehículo más barato: " + menoscostoso.getMarca() + " " + menoscostoso.getModelo());
	}

	
	@Override
	public void VehiculoConLetra(String xcompo) {      //metodo para la busqueda del Vehiculo con la letra Y en el modelo

		DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

		for (int i = 0; i < vehi.size(); i++) {
			if (vehi.get(i).getModelo().contains(xcompo)) {
				
				System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + vehi.get(i).getMarca() + " "
						+ vehi.get(i).getModelo() + " $"
						+ df.format(new BigDecimal(vehi.get(i).getPrecio()).floatValue()));
			}
		}
	}

		private void listordenada () { //Metodo para ordenar los vehiculos de un mayor precio a menor
			
			System.out.println("=============================");
			
			Collections.sort(vehi, new MayoraMenor () );
			
			System.out.println("Vehículos ordenados por precio de mayor a menor: ");
			
			for (int i =0 ; i<vehi.size();i++) {
				
				System.out.println(vehi.get(i).getMarca()+" "+vehi.get(i).getModelo());
			}
		}
}
			
	
	
	

	

