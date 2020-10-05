package prova.unidade1;

public class Data {
	
	private short dia, mes, ano;
	
	public Data(short dia, short mes, short ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public short getDia() {
		return dia;
	}
	
	public short getMes() {
		return mes;
	}
	
	public short getAno() {
		return ano;
	}
	
	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		else if(o instanceof Data) {
			Data d = (Data) o;
			if(this.dia == d.getDia() &&
			   this.mes == d.getMes() &&
			   this.ano == d.getAno())
				return true;
		}
		return false;
	}

}
