package classeseobjetos;

public class MainPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		//Pessoa(char sexo, int idade, String nome, double peso, double altura, String cpf){
		//abordagem mais comum: construtor com argumentos
		Pessoa p2 = new Pessoa('m',24,"João", 89.0, 1.8, "23897332");
		
		//construtor com nome como argumento
		Pessoa p3 = new Pessoa("Janaina");
		
		//construtor com nome como argumento
		Pessoa p4 = new Pessoa("09432842309");
		
		Pessoa p5 = new Pessoa("Mariana");
		Pessoa p6 = new Pessoa("Esther");
		
		System.out.println("P1: "+p1);
//		System.out.println("P2: "+p2.toString());
//		System.out.println("P3: "+p3.toString());
//		System.out.println("P4: "+p4);
//		System.out.println("P5: "+p5);
//		System.out.println("P6: "+p6);
		

		
		
	}

}
