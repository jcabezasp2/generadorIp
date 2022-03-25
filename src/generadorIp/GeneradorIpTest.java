package generadorIp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	GeneradorIp generador = new GeneradorIp();

	@Test
	void testGenerarNumero() {
		
		for(int i = 1;
				i <= 1000;
				i++) {
			int numeroAleatorio = generador.generarNumero(0, 254);
			assertTrue(numeroAleatorio >= 0 && numeroAleatorio <= 254);
		}
	}

}
