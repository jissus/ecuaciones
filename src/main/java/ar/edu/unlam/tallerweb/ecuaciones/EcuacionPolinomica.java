package ar.edu.unlam.tallerweb.ecuaciones;
/*Profesor Lucas */

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una ecuación polinómica del tipo
 * f(x) = n + (n-1) × x + (n-2) × x^2 + ...
 *
 */
public class EcuacionPolinomica implements Ecuacion {

	private List<Double> miLista = new ArrayList<Double>();
	
	public EcuacionPolinomica(List<Double>miLista) throws RuntimeException{
		if(miLista!=null){
		this.miLista=miLista;
		}else{ 
			throw new RuntimeException("No implementado");
			}
	}

	public Double resolver(Double x) {
		if(x!=null){
			Double suma = 0.0;
			for(int i=0;i<this.miLista.size();i++){
				suma=suma.doubleValue()+(miLista.get(i).doubleValue()*Math.pow(x.doubleValue(),i));
			}
		return suma.doubleValue();

		}else{
			throw new RuntimeException("No implementado");
		}
	}

}

