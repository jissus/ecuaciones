package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionLineal implements Ecuacion {

	private Double m;
	private Double b;
	
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
		Double y=(this.m.doubleValue()*x.doubleValue())+this.b.doubleValue();//19
		return Math.abs(y.doubleValue());
		}else{
		throw new RuntimeException("No implementado");
		}
	}

}
