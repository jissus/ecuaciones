package ar.edu.unlam.tallerweb.ecuaciones;

import junit.framework.Assert;

import org.junit.Test;




public class EcuacionLinealTest {
	@Test(expected=RuntimeException.class)
	public void queSePasenBienLosParametrosAlConstructor()throws RuntimeException{
		EcuacionLineal lineal = new EcuacionLineal(null, 1.0);
		
	}
	
	@Test(expected=RuntimeException.class)
	public void queLaIncognitaDeLaFuncionNoSeaNull()throws RuntimeException{
		Ecuacion lineal = new EcuacionLineal(1.0,1.0);
		lineal.resolver(null);
	}
	
	@Test
	public void queFuncioneCorrectamenteLaFuncionLineal() throws RuntimeException{
		EcuacionLineal lineal = new EcuacionLineal(1.0, 1.0);
		Assert.assertEquals(4.0,lineal.resolver(3.0));
	}
}
