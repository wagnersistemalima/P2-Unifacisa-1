package basics;
import java.util.Locale;
import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		
		// Scanner é uma classe do Java, fica no pacote java.util (utilitários).
		// Criando um objeto da classe scanner, e atribuindo à variável entrada.
		// Um objeto é uma entidade que contem funções que podem ser executadas.
		Scanner entrada = new Scanner(System.in);
		// Para receber o double com . (separador entre casa decimal e ponto flutuante)
		entrada.useLocale(Locale.US);  
		
		// nextDouble() é uma função da classe Scanner
		// Ou seja, nextDouble() é uma função que pode ser executada a partir
		// de objetos criados a partir da classe Scanner.
		System.out.print("Digite sua altura (x,x): ");
		double altura = entrada.nextDouble();
		System.out.print("Digite seu peso (x,x): ");
		double peso = entrada.nextDouble();
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
}