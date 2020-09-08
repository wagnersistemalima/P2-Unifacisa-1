package classeseobjetos;

class MainRefeicao{
	public static void main(String [] args){
		
		// posso atribuir valores à variáveis de classe
		// sem que exista objeto algum
		Refeicao.precoBase = 10;
		
		System.out.println(Refeicao.cardapio());
		
		// só vou poder atribuir valores à variáveis de instância (objeto)
		// depois que criar o objeto
//		Refeicao r = new Refeicao();
//		r.precoAdicional = 2;
		
    	Refeicao almoco = new Refeicao("feijão com carne de sol", "feijao", 100, "carne de sol", 80, 30, 5);
		Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 0);
		
		System.out.println("Almoco: "+almoco);
		System.out.println("Jantar: "+jantar);
		
		Refeicao.precoBase = 15;
		System.out.println("Mudei preço base para 15...");
		
		System.out.println("Almoco: "+almoco);
		System.out.println("Jantar: "+jantar);
		
	}
}
