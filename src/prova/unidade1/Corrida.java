package prova.unidade1;

public class Corrida {

	private static double precoKm;
	
	private Data dataPedido;
	private String cliente, inicio, destino;
	private double km;
	
	public Corrida(Data dataPedido, String cliente, String inicio, String destino, double km) {
		this.dataPedido = dataPedido;
		this.cliente = cliente;
		this.inicio = inicio;
		this.destino = destino;
		this.km = km;
	}
	
	public double getCustoCorrida() {
		return this.km * Corrida.precoKm;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += cliente+": de "+inicio+" para "+destino+"("+km+" kms)\n";
		res += "Data de solitação: "+dataPedido.getDia()+"/"+dataPedido.getMes()+"/"+dataPedido.getAno();
		return res;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		else if(o instanceof Corrida) {
			Corrida c = (Corrida) o;
			if(this.dataPedido.equals(c.getDataPedido()) &&
				this.cliente.equals(c.getCliente()) &&
				this.inicio.equals(c.getInicio()) &&
				this.destino.equals(c.getDestino()) &&
				this.km == c.getKm())
				return true;
		}
		return false;
	}
	
	public Data getDataPedido() {
		return dataPedido;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public String getInicio() {
		return inicio;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public double getKm() {
		return km;
	}
	
	public static double getPrecoKm() {
		return precoKm;
	}
	
	public static void setPrecoKm(double precoKm) {
		Corrida.precoKm = precoKm;
	}
	
}
