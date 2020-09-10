package classeseobjetos;

public class Pessoa{

	char sexo;
	int idade;
	String nome;
	double peso, altura;
	String cpf;

	//se o nosso código não tiver um construtor
	//a JVM injeta o construtor default na classe
	//construtor default é um construtor sem argumentos
	//Pessoa(){
	//	System.out.println("O construtor foi chamado!!");
	//}
	
	Pessoa(){}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	Pessoa(char sexo){
		this.sexo = sexo;
	}

	Pessoa(char sexo, int idade, String nome, double peso, double altura, String cpf){
		this.sexo = sexo;
		this.idade = idade;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.cpf = cpf;
	}
	
	Pessoa(int idade, String nome, double peso, double altura, String cpf, char sexo){
		this.sexo = sexo;
		this.idade = idade;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.cpf = cpf;
	}
	
	void calulaImc(){		
		double imc = peso / (altura * altura);
		if(imc < 16) {
			System.out.println("Magreza grave");
		}
		else if(imc < 17) {
			System.out.println("Magreza moderada");
		} else if(imc < 18.5) {
			System.out.println("Magreza leve");
		} else if(imc < 25) {
			System.out.println("Saudável");
		} else if(imc < 30) {
			System.out.println("Sobrepeso");
		} else if(imc < 35) {
			System.out.println("Obesidade I");
		} else if(imc < 40) {
			System.out.println("Obesidade II");
		} else {
			System.out.println("Obesidade III");
		}		
	}
	

	public String toString() {
		String pessoa = "";
		pessoa += "Nome: "+nome+"\n";
		pessoa += "Idade: "+idade+"\n";
		pessoa += "CPF: "+cpf+"\n";
		pessoa += "Sexo: "+sexo+"\n";
		pessoa += "Peso: "+peso+"\n";
		pessoa += "Altura: "+altura+"\n";
		return pessoa;
	}

}