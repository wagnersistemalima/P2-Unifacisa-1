package prova.unidade1;

import java.util.Arrays;

public class Evento {
	
	private String[] participantes;
	private Data diaInicial, diaFinal;
	private static int limitePessoas;
	
	public Evento(Data diaInicial, Data diaFinal, String[] participantes) {
		this.diaInicial = diaInicial;
		this.diaFinal = diaFinal;
		this.participantes = participantes;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Início: "+diaInicial+"\n";
		res += "Fim: "+diaFinal+"\n";
		res += "Participantes: "+"\n";
		for(String participante : participantes)
			res += participante + "\n";
		return res;
	}
	
	public Data getDiaInicial() {
		return diaInicial;
	}
	
	public Data getDiaFinal() {
		return diaFinal;
	}
	
	public String[] getParticipantes() {
		return participantes;
	}
	
	public static int getLimitePessoas() {
		return limitePessoas;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		else if(o instanceof Evento) {
			Evento e = (Evento) o;
			if(e.getDiaInicial().equals(this.diaInicial) &&
			   e.getDiaFinal().equals(this.diaFinal) &&
			   Arrays.equals(e.getParticipantes(),this.participantes))
				return true;
		}
		return false;
		
	}


}
