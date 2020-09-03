package classeseobjetos;

public class MainPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Eduardo";
		p1.altura = 1.85;
		//...
		
		//Pessoa(char sexo, int idade, String nome, double peso, double altura, String cpf){
		//abordagem mais comum: construtor com argumentos
		Pessoa p2 = new Pessoa('m',24,"João", 89.0, 1.8, "23897332");
		
		Pessoa p3 = new Pessoa("Janaina");
		Pessoa p4 = new Pessoa("09432842309");
		Pessoa p5 = new Pessoa("Mariana");
		Pessoa p6 = new Pessoa("Esther");
		
		
	}

}
