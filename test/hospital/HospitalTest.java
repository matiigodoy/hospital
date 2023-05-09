package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class HospitalTest {

	@Test
	public void queSePuedaInstanciarUnHospital() {
		//Preparación
		Hospital hospital;
		final String NOMBRE = "Hospital Central de la República";
		final Integer CANTIDAD_DE_PACIENTES_ESPERADO = 0;
				
		//Ejecución
		hospital = new Hospital(NOMBRE);
				
		//Validación
		assertNotNull(hospital);
		assertEquals(NOMBRE, hospital.getNombre());
		assertEquals(CANTIDAD_DE_PACIENTES_ESPERADO, hospital.getCantidadDePacientes());
	}
	
	@Test
	public void queSePuedaAgregarUnPaciente() {
		//Preparación
		Hospital hospital;
		Paciente paciente;
		final String HOSPITAL_NOMBRE = "Hospital Central de la República";
		final String PACIENTE_NOMBRE = "Matii Godoy";
		final Integer PACIENTE_DNI = 12345678;
		final Integer CANTIDAD_DE_PACIENTES_ESPERADO = 1;
				
		//Ejecución
		paciente = new Paciente(PACIENTE_NOMBRE, PACIENTE_DNI);
		hospital = new Hospital(HOSPITAL_NOMBRE);
		hospital.agregarPaciente(paciente);
				
		//Validación
		assertNotNull(hospital);
		assertEquals(HOSPITAL_NOMBRE, hospital.getNombre());
		assertEquals(PACIENTE_DNI, paciente.getDni());
		assertEquals(CANTIDAD_DE_PACIENTES_ESPERADO, hospital.getCantidadDePacientes());
	}
	
	@Test
	public void queNoSePuedaAgregarUnPacienteDuplicado() {
		//Preparación
		Hospital hospital;
		Paciente pacienteUno, pacienteDos;
		final String HOSPITAL_NOMBRE = "Hospital Central de la República";
		final String PACIENTE_UNO_NOMBRE = "Matii Godoy";
		final String PACIENTE_DOS_NOMBRE = "Fula Nito";
		final Integer PACIENTE_UNO_DNI = 12345678;
		final Integer PACIENTE_DOS_DNI = 12345678;
		final Integer CANTIDAD_DE_PACIENTES_ESPERADO = 1;
		
		pacienteUno = new Paciente(PACIENTE_UNO_NOMBRE, PACIENTE_UNO_DNI);
		pacienteDos = new Paciente(PACIENTE_DOS_NOMBRE, PACIENTE_DOS_DNI);
				
		//Ejecución
		
		hospital = new Hospital(HOSPITAL_NOMBRE);
		hospital.agregarPaciente(pacienteUno);
		hospital.agregarPaciente(pacienteDos);
				
		//Validación
		assertEquals(CANTIDAD_DE_PACIENTES_ESPERADO, hospital.getCantidadDePacientes());
	}

}
