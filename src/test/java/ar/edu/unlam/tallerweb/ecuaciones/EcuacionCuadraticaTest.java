package ar.edu.unlam.tallerweb.ecuaciones;

import junit.framework.Assert;

import org.junit.Test;

public class EcuacionCuadraticaTest {

	@Test
	public void queFuncioneCorrectamenteLaEcuacionCuadratica(){
		EcuacionCuadratica cuadratica = new EcuacionCuadratica(1.0, 4.0, 3.0);
		Assert.assertEquals(8.0,cuadratica.resolver(1.0));
	}
}
