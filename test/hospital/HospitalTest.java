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

}
