package prova.unidade1;

import java.util.ArrayList;
import java.util.List;

public class GoogleAgenda {
	
	private List<Evento> eventos;
	
	public GoogleAgenda() {
		this.eventos = new ArrayList<Evento>();
	}
	
	public void adicionarEvento(Evento e) {
		this.eventos.add(e);
	}
	
	public void adicionarEvento(Data diaInicial, Data diaFinal, String[] participantes) {
		Evento e = new Evento(diaInicial,diaFinal,participantes);
		this.adicionarEvento(e);
	}
	
	public int getQuantidadeEventos() {
		return this.eventos.size();
	}
	
	public int getQuantidadeEventosSemAglomeracao() {
		int qtdade = 0;
		for(Evento e : this.eventos) {
			if(e.getParticipantes().length < Evento.getLimitePessoas())
				qtdade++;
		}
		return qtdade;
	}
	
	public List<Evento> getEventosDia(Data dia){
		List<Evento> eventosDia = new ArrayList<Evento>();
		for(Evento e : this.eventos) {
			if(e.getDiaInicial().equals(dia)) {
				eventosDia.add(e);
			}
		}		
		return eventosDia;
	}
	
	public Evento getEventoMaisLongo() {
		Evento eventoMaisLongo = null;
		int dias = 0;
		for(int i = 0; i < this.eventos.size(); i++) {
			int diasAux = getDias(this.eventos.get(i));
			if(diasAux >= dias) {
				eventoMaisLongo = this.eventos.get(i);
				dias = diasAux;
			}
		}
		return eventoMaisLongo;
	} 
	
	private int getDias(Evento e) {
		//05/05/2020 - 20/06/2021
		int dias = 0;
		dias += (e.getDiaFinal().getAno()-e.getDiaInicial().getAno())*360; 
		dias += (e.getDiaFinal().getMes()-e.getDiaInicial().getMes())*30;  
		dias += (e.getDiaFinal().getDia()-e.getDiaInicial().getDia());     
		return dias;
	}
	
	public void removerEventoMaisLongo() {
		Evento eventoMaisLongo = getEventoMaisLongo();
		//remove só consegue encontrar o objeto na lista se equals
		//estiver implementado em Evento
		this.eventos.remove(eventoMaisLongo);	
		 
	}

}
