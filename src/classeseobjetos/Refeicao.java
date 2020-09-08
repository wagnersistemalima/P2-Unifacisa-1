package classeseobjetos;

class Refeicao{
	
	//variáveis de classe
	static double precoBase;
	
	//variáveis de instância
	//sempre que chamo o construtor, ou seja
	//sempre que crio um objeto, essas variáveis são inicializadas
	//variáveis de tipos primitivos iniciam com um valor default; geralmente 0
	//variáveis de referência à objetos (como é o caso de String) inicializam com null
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double precoAdicional; 
  
	//construtor 1: vazio
  	public Refeicao(){ }
  
  	// contrutor 2: com argumentos
  	// Opção self-service (15.0)
  	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double precoAdicional){
		//this referencia variável global
  		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.precoAdicional = precoAdicional;
	}
  
  	//construtor 3: com argumentos, mas também está reutilizando o construtor 2
  	// Opção prato-feito (10)
  	public Refeicao(String carboidrato, String proteina){
  		this(carboidrato+" com "+proteina,carboidrato,100,proteina,150,15,10);
	}
  	
  	//toString é uma função que retorna em String os valores do objeto
  	@Override
  	public String toString() {
  		//manipulação de Strings
  		String saida = "";
  		saida = saida + nome+" - R$ "+(precoBase+precoAdicional)+"\n";
  		saida += "Peso: carboidratos = "+gramasCarboidrato+", proteina = "+gramasProteina+"\n";
  		return saida;
  	}
  	
  	static String cardapio() {
  		String bebidas = "Bebidas: \n";
  		bebidas += "Coca-cola\n";
  		bebidas += "Guaraná\n";
  		bebidas += "Suco de laranja\n";
  		bebidas += "Café\n";
  		
  		String proteinas = "Proteinas: \n";
  		proteinas += "Ovo\n";
  		proteinas += "Picanha\n";
  		proteinas += "Maminha\n";
  		proteinas += "Bife\n";
  		
  		return "Cardápio: \n\n"+bebidas+"\n"+proteinas;
  	}
}
