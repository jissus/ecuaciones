package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionLineal implements Ecuacion {

	private final Double m;
	private final Double b;
	
	public EcuacionLineal(Double m, Double b) throws RuntimeException{
		if(m!=null && b!= null){
		this.m=m;
		this.b=b;
	}else{ 
		throw new RuntimeException("No implementado");
		}
	}

	public Double resolver(Double x) throws RuntimeException{
		if(x!=null){
		Double y=(m.doubleValue()*x.doubleValue())+b.doubleValue();
		return Math.abs(y.doubleValue());
		}else{
		throw new RuntimeException("No implementado");
		}
	}

}
