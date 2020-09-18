package encapsulamento;

public class Banco {
	
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(100, 123456, "Eduardo", 12345);
		System.out.println("Saldo original: "+c1.getSaldo());
		c1.depositar(1000);
		System.out.println("Saldo após depósito: "+c1.getSaldo());
		c1.sacar(500, 12345);
		System.out.println("Saldo após saque: "+c1.getSaldo());
	}

}
