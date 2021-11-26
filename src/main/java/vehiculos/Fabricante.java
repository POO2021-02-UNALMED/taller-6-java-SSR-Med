package vehiculos;
import java.util.*;
public class Fabricante {
	String nombre;
	Pais pais;
	int cantidadVehiculos;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.fabricantes.add(this);
	}
	public static Fabricante fabricaMayorVentas() {
		int max = 0;
		int jmax = 0;
		for(int i = 0; i < Fabricante.fabricantes.size();i++) {
			if(Fabricante.fabricantes.get(i).cantidadVehiculos > max) {
				max = Fabricante.fabricantes.get(i).cantidadVehiculos;
				jmax = i;
			}
		}
		return Fabricante.fabricantes.get(jmax);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}

