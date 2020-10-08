package reuso;

import java.util.List;

public class CorridaPool extends Corrida{
	
	public CorridaPool(Data inicio, Data fim, double km, List<Passageiro> passageiros) {
		super(inicio, fim, km, passageiros);
	}
	
	public CorridaPool(Data inicio, Data fim, double km) {
		super(inicio, fim, km);
	}
	

	@Override
	protected double getPrecoBase(){
		return 4.5;
	}
	  
	@Override
	protected double getCustoKm(){
		return 1;
	}
	  
	@Override
	public double getCusto(){
		double custo = super.getCusto();
	    return custo - (super.passageiros.size()/10 * custo);
	}
	
	@Override
	public String toString() {
		String desc = "Corrida Pool\n";
		desc += super.toString();
		return desc;
	}

}
