package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa la abstracción del cálculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea {

	/**
	 * Calcula el área bajo la curva, utilizando el método de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio
	 * @param fin
	 * @param incremento
	 * @return el área bajo la curva
	 */
	public Double calcular(Ecuacion ecuacion, Double inicio, Double fin,
			Double incremento) {
		if(ecuacion!=null&&inicio!=null&&fin!=null&&incremento!=null){
		Double resultado=0.0;
		Double x =0.0;
		Double mitadIncremento=(incremento.doubleValue()/2);
		Double cantidadR=(fin.doubleValue()-inicio.doubleValue())/incremento.doubleValue();
		for(int i=0;i<cantidadR.doubleValue();i++){
		x=inicio.doubleValue()+(i*incremento.doubleValue());
		resultado=resultado.doubleValue()+(ecuacion.resolver(x+mitadIncremento));
		}
		return Math.abs((resultado.doubleValue()*incremento.doubleValue()));
		}else{
			throw new RuntimeException("No implementado");
		}

	}

}
