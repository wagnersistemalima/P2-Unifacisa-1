package varinstanciaeclasse;

public class Carro {
	
	static boolean promocao;
	
	String nome, marca;
	Cor cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	
	//final: essa variável é uma constante (seu valor não muda)
	final double precoBase;
	
	// um construtor que tem como argumento nome, marca, e precoBase. 
	// Esse construtor nos dará uma instância básica de carro: 
	// 2 portas, cor branca, sem vidros elétricos, sem ar-condicionado
	// sem câmbio automático, e sem direção elétrica
	Carro(String nome, String marca, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		
		/* Carro básico */
		this.portas = 2;
		this.cor = Cor.BRANCA;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;		
	}
	
	// construtor com todos os argumentos
	Carro(String nome, String marca, Cor cor, 
			int portas, boolean vidroEletrico, 
			boolean arCondicionado, boolean cambioAutomatico, 
			boolean direcaoEletrica, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;		
	}		
	
	// função que calcula preco do carro de acordo com opcionais
	double calculaPreco() {
		
		double preco = precoBase;
		
		switch(cor) {
			case BRANCA:
			case AZUL:
			case VERMELHA:
			case PRETA: break;
			default: preco += 1000;
		}
		
		if(this.vidroEletrico)
			preco += 1250;
		if(this.arCondicionado)
			preco += 1250;
		if(this.cambioAutomatico)
			preco += 1250;
		if(this.direcaoEletrica)
			preco += 1250;
		
		if(Carro.promocao)
			preco = 0.9 * preco;
		
		return preco;
	}
	
	//precisa ter exatamente essa assinatura
	public String toString() {
		String desc = "";
		desc += "Nome: "+nome+", marca: "+marca+", cor: "+cor+"\n";
		desc += "Portas: "+portas+"\n";
		desc += "Vidro eletrico: "+(vidroEletrico?"X":"")+", Ar Condicionado: "+(arCondicionado?"X":"")+"\n";
		desc += "Cambio automatico: "+(cambioAutomatico?"X":"")+", Direcao eletrica: "+(direcaoEletrica?"X":"")+"\n";
		desc += "Preco: "+calculaPreco()+", Promoção: "+(promocao?"X":"")+"\n";
		return desc;
	}

}
