package reuso;

import java.util.List;

public class CorridaVip extends Corrida{

	public CorridaVip(Data inicio, Data fim, double km, List<Passageiro> passageiros) {
		super(inicio, fim, km, passageiros);
	}
	
	public CorridaVip(Data inicio, Data fim, double km) {
		super(inicio, fim, km);
	}
	
	@Override
	protected double getPrecoBase(){
		return 6;
	}
	
	@Override
	protected double getCustoKm(){
		return 2;
	}
	
	@Override
	public String toString() {
		String desc = "Corrida VIP\n";
		desc += super.toString();
		return desc;
	}
	
}
