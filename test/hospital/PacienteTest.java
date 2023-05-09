package hospital;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class PacienteTest {

	@Test
	public void queSePuedaInstanciarUnPaciente() {
		//Preparación
		Paciente paciente;
		final String NOMBRE = "Matii Godoy";
		final Integer DNI = 12345678;
		final Integer CANTIDAD_DE_PLATOS_ESPERADO = 0;
		
		//Ejecución
		paciente = new Paciente(NOMBRE, DNI);
		
		//Validación
		assertNotNull(paciente);
		assertEquals(CANTIDAD_DE_PLATOS_ESPERADO, paciente.getCantidadDePlatos());
	}
	

}
