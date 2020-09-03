package classeseobjetos;

class Refeicao{
	
	//variáveis de instância
	//sempre que chamo o construtor, ou seja
	//sempre que crio um objeto, essas variáveis são inicializadas
	//variáveis de tipos primitivos iniciam com um valor dafault; geralmente 0
	//variáveis de referência à objetos (como é o caso de String) inicializam com null
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double preco; 
  
	//construtor1: vazio
  	public Refeicao(){ }
  
  	//contrutor 2: com argumentos
  	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco){
		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.preco = preco;
	}
  
  	//construtor3: com argumentos, mas também está reutilizando o construtor 2
  	public Refeicao(String carboidrato, String proteina){
  		this(carboidrato+" com "+proteina,carboidrato,100,proteina,150,15,8);
	}
  	
  	//toString é uma função que retorna em String os valores do objeto
  	@Override
  	public String toString() {
  		//manipulação de Strings
  		String saida = "";
  		saida = saida + nome+" - R$ "+preco+"\n";
  		saida += "Peso: carboidratos = "+gramasCarboidrato+", proteina = "+gramasProteina+"\n";
  		return saida;
  	}
}
