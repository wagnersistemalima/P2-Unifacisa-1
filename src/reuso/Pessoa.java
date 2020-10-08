package reuso;

public class Pessoa {
	
	protected String nome;
	protected Conta conta;
	
	public Pessoa(String nome, int senhaConta) {
		super();	//quando omitido, é injetado pela JVM
		this.nome = nome;
		this.conta = new Conta(senhaConta);
	}
	
	@Override
	public String toString() {
		String desc = "";
		desc += "Nome: "+nome+"\n";
		desc += conta.toString()+"\n";
		return desc;
	}

}
