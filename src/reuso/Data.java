package reuso;

public class Data extends Object{
	
	private int dia, mes, ano;
	private int hora, minuto, segundo;
	
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	//estou sobrescrevendo a função toString herdada de Object
	//a anotação Override indica que esta função deve sobrescrever 
	//alguma função existente na superclasse
	@Override
	public String toString() {
		return dia+"/"+ mes+"/"+ano+", "+hora+":"+minuto+":"+segundo;
	}

}
