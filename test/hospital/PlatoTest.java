package hospital;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class PlatoTest {

	@Test
	public void queSePuedaCrearUnPlato() {
		//Preparación
		Plato plato;
		TipoElaboracion elaboracion = TipoElaboracion.HORNO;
		final String NOMBRE_PLATO = "Galleta de Avena";
		
		HashSet<String> ingredientes = new HashSet<>();
		ingredientes.add("avena");
		ingredientes.add("harina");
		ingredientes.add("aceite");
		ingredientes.add("huevo");
		ingredientes.add("sal");
		ingredientes.add("esencia de vainilla");
		
		//Ejecución
		plato = new Plato(NOMBRE_PLATO, ingredientes, elaboracion);
		
		//Validación
		assertNotNull(plato);
		assertEquals(NOMBRE_PLATO, plato.getNombre());
	}
	
	@Test
	public void queUnPlatoSeaAptoDiabetico() {
		//Preparación
		Plato plato;
		TipoElaboracion elaboracion = TipoElaboracion.HORNO;
		final String NOMBRE_PLATO = "Tortilla";
		
		HashSet<String> ingredientes = new HashSet<>();
		ingredientes.add("harina");
		ingredientes.add("aceite");
		ingredientes.add("sal");
		
		//Ejecución
		plato = new Plato(NOMBRE_PLATO, ingredientes, elaboracion);
		
		//Validación
		assertNotNull(plato);
		assertTrue(plato.esAptoDiabetico());
	}
	
	@Test
	public void queUnPlatoSeaAptoCeliaco() {
		//Preparación
		Plato plato;
		TipoElaboracion elaboracion = TipoElaboracion.HORNO;
		final String NOMBRE_PLATO = "Alfajor sin TACC";
		
		HashSet<String> ingredientes = new HashSet<>();
		ingredientes.add("harina");
		ingredientes.add("aceite");
		ingredientes.add("sal");
		ingredientes.add("huevo");
		ingredientes.add("azucar");
		
		//Ejecución
		plato = new Plato(NOMBRE_PLATO, ingredientes, elaboracion);
		
		//Validación
		assertNotNull(plato);
		assertTrue(plato.esAptoCeliaco());
	}

}
