package hospital;

import java.util.HashSet;

public class Plato {

	private String nombre;
	private HashSet<String> ingredientes;
	private TipoElaboracion elaboracion;
	
	public Plato(String nombre, HashSet<String> ingredientes, TipoElaboracion elaboracion) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.elaboracion = elaboracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(HashSet<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public TipoElaboracion getElaboracion() {
		return elaboracion;
	}

	public void setElaboracion(TipoElaboracion elaboracion) {
		this.elaboracion = elaboracion;
	}

	public boolean esAptoDiabetico() {
		for (String ingrediente : ingredientes) {
			if (ingrediente == "azucar") return false;
		}
		return true;
	}

	public boolean esAptoCeliaco() {
		for (String ingrediente : ingredientes) {
			if (ingrediente == "trigo" || ingrediente == "avena" || ingrediente == "cebada" || ingrediente == "centeno") {
				return false;
			}
		}
		return true;
	}

}
