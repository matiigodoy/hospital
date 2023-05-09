package hospital;

import java.util.HashSet;
import java.util.Objects;

public class Paciente {

	private String nombre;
	private Integer dni;
	private HashSet<Plato> alimentacion;
	
	public Paciente(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
		alimentacion = new HashSet<Plato>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getCantidadDePlatos() {
		return alimentacion.size();
	}
	
	public void asignarPlato(Plato plato) {
		alimentacion.add(plato);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
