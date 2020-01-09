package concesionaria.autos.motos.onready;

import java.util.Comparator;

public class MayoraMenor implements Comparator <Vehiculo> {

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
	
		if (v1.getPrecio() > v2.getPrecio()) return -1;
		if (v1.getPrecio() < v2.getPrecio()) return 1;
		return 0;
	
	}

	
	
}
