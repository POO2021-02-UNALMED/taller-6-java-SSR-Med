package vehiculos;
import java.util.*;
public class Pais {
	public String nombre;
	public int cantidadAutos;
	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	
	public void cantidad() {
		for(int i = 0; i <Fabricante.fabricantes.size();i++) {
			if(Fabricante.fabricantes.get(i).pais == this) {
				cantidadAutos = cantidadAutos + Fabricante.fabricantes.get(i).cantidadVehiculos;
			}
		}
	}
	
	
	public Pais(String nombre){
		this.nombre = nombre;
		Pais.paises.add(this);
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		int max = 0;
		int jmax = 0;
		for(int i = 0; i<Pais.paises.size();i++) {
			if(Pais.paises.get(i).cantidadAutos > max) {
				max = Pais.paises.get(i).cantidadAutos;
				jmax = i;
			}
		}
		return Pais.paises.get(jmax);
	}
	
}
