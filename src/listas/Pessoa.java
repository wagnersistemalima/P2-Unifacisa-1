package listas;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	public Pessoa(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		else if(o instanceof Pessoa) {
			Pessoa p = (Pessoa) o;
			if(idade == p.getIdade() &&
					nome.equals(p.getNome()))
				return true;
		} 
		return false;
	}
	
	@Override
	public String toString() {
		return nome+"("+idade+")";
	}
	

}
