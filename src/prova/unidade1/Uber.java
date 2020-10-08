package prova.unidade1;

public class Uber {
	
	private Corrida[] corridas;
	private int qtdadeCorridas; 
	
	public Uber() {
		this.corridas = new Corrida[10];
		this.qtdadeCorridas = 0;
	}
	
	public void solicitarCorrida(Corrida corrida) {
		if(qtdadeCorridas == corridas.length) {
			Corrida[] corridasAux = new Corrida[2*qtdadeCorridas];
			for(int i = 0; i < qtdadeCorridas; i++) {
				corridasAux[i] = corridas[i];
			}
			corridas = corridasAux;
		}
		this.corridas[qtdadeCorridas] =  corrida;
		this.qtdadeCorridas++;
	}	
	
	public void solicitarCorrida(Data dataPedido, String cliente, String inicio, String destino, double km) {
		this.solicitarCorrida(new Corrida(dataPedido, cliente, inicio, destino, km));
	}
	
	public int getQtdadeCorridas() {
		return qtdadeCorridas;
	}
	
	public Corrida[] getCorridasCliente(String cliente) {
		//contar quantas corridas existem para um dado cliente
		int cont = 0;
		for(int i = 0; i < qtdadeCorridas; i++) {
			if(this.corridas[i].getCliente().equals(cliente))
				cont++;
		}
		
		if(cont == 0) {
			return null;
		} else {
			Corrida[] corridasCliente = new Corrida[cont];
			int j = 0;
			for(int i = 0; i < qtdadeCorridas; i++) {
				if(this.corridas[i].getCliente().equals(cliente)) {
					corridasCliente[j] = this.corridas[i];
					j++;
				}
			}
			return corridasCliente;
		}
		
	}
	
	public double getCustoCorridas(String cliente) {
		Corrida[] corridasCliente = getCorridasCliente(cliente);
		double custoCorridas = 0;
		for(Corrida corrida : corridasCliente) {
			custoCorridas += corrida.getCustoCorrida();
		}
		return custoCorridas;
	}
	
	public Corrida removeCorridaMaisAntiga(String cliente) {
		Corrida[] corridasCliente = getCorridasCliente(cliente);
		
		Corrida corridaMaisAntiga = null;
		if(corridasCliente!=null) {
			corridaMaisAntiga = corridasCliente[0];
		} else {
			return null;
		}
		
		for(Corrida c : corridasCliente) {
			corridaMaisAntiga = getCorridaMaisAntiga(corridaMaisAntiga, c);
		}
		return corridaMaisAntiga;
	}
	
	private Corrida getCorridaMaisAntiga(Corrida c1, Corrida c2) {
		if(c1.getDataPedido().getAno() < c2.getDataPedido().getAno())
			return c1;
		else if(c1.getDataPedido().getAno() > c2.getDataPedido().getAno())
			return c2;
		else if(c1.getDataPedido().getMes() < c2.getDataPedido().getMes()) 
			return c1;
		else if(c1.getDataPedido().getMes() > c2.getDataPedido().getMes()) 
			return c2;
		else if(c1.getDataPedido().getDia() <= c2.getDataPedido().getDia()) 
			return c1;
		else
			return c2;
		
	}
	
}
