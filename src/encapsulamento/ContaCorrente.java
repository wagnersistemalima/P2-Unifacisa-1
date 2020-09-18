package encapsulamento;

public class ContaCorrente {
	private double limite;			
	private double saldo;	
	private int numero;
	private String cliente;
	private int senha;
	
	public ContaCorrente(double limite, int numero, String cliente, int senha) {
		if(limite < 0) {
			limite = 0;
		}
		this.limite = limite;
		this.numero = numero;
		this.cliente = cliente;
		this.senha = senha;
	}	
	
	public void depositar(double quantia) {
		if(quantia <= 0)
			return;
		
		saldo += quantia;
	}
	
	public double sacar(double quantia, int senha) {
		if(this.senha == senha) {
			// saldo = saldo - (-500)
			// saldo = saldo + 500		
			double valorDisponivel = saldo + limite;
			if(quantia > 0 && quantia <= valorDisponivel) {
				saldo -= quantia;
				return quantia;
			}
		}
		return 0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
}
