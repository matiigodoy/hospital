package hospital;

import java.util.HashSet;

public class Hospital {

	private String nombre;
	private HashSet<Paciente> pacientes;
	
	public Hospital(String nombre) {
		this.nombre = nombre;
		pacientes = new HashSet<Paciente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadDePacientes() {
		return pacientes.size();
	}

	public void agregarPaciente(Paciente paciente) {
		pacientes.add(paciente);
	}
	
	
}
