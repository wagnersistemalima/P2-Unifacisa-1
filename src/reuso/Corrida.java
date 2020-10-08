package reuso;

import java.util.ArrayList;
import java.util.List;

public class Corrida{
	
	//reuso de atributos e funções de Data via composição
	private Data inicio;
	private Data fim;
	private double km;
	
	//reuso de atributos e funções de Lista via composição
	protected List<Passageiro> passageiros;
	
	public Corrida(Data inicio, Data fim, double km, List<Passageiro> passageiros) {
		this.inicio = inicio;
		this.fim = fim;
		this.passageiros = passageiros;
		this.km = km;
	}
	
	public Corrida(Data inicio, Data fim, double km) {
		this.inicio = inicio;
		this.fim = fim;
		this.km = km;
		this.passageiros = new ArrayList<Passageiro>();				
	}
	
	public void addPassageiro(Passageiro passageiro) {
		this.passageiros.add(passageiro);
	}
	
	protected double getPrecoBase(){
		return 5;
	}
	
	protected double getCustoKm(){
		return 1.6;
	}
	
	public double getCusto(){
		return getPrecoBase() + getCustoKm() * this.km;
	}
	
	@Override
	public String toString() {
		String desc = "";
		desc += "Inicio: "+inicio+"\n";
		desc += "Fim: "+fim+"\n";
		desc += "Km: "+km+"\n";
		desc += "Passageiros: "+passageiros+"\n";
		desc += "Custo: "+getCusto()+"\n";
		return desc;
	}

}
