package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class EcuacionPolinomicaTest {
	@Test
	public void queSeCreeElObjeto(){
	
		EcuacionPolinomica polinomica = new EcuacionPolinomica(Arrays.asList(new Double[] {1.0, 2.0}));
		System.out.println(polinomica.resolver(2.0));
		
		}
	
}
