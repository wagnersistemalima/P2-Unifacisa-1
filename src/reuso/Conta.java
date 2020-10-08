package reuso;

public class Conta {

	private double saldo;
	private int senha;

	public Conta(int senha) {
		this.saldo = 100;
		this.senha = senha;
	}

	public void transferir(int senha, double valor, Conta conta) {
		if (conta != null && this.senha == senha && valor > 0 && valor < saldo) {
			saldo -= valor;
			conta.saldo += valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}
	
	//toString de Object tem uma formatação que não exibe os atributos
	//portanto, vamos sobrescrever toString
	@Override
	public String toString() {
		return "Saldo: "+saldo;
	}

}
