package classeseobjetos;

class MainRefeicao{
	public static void main(String [] args){
		Refeicao almoco1 = new Refeicao();
		almoco1.nome = "feijão com bife";
		almoco1.carboidrato = "feijao";
		almoco1.gramasCarboidrato = 100;
		almoco1.proteina = "bife";
		almoco1.gramasProteina = 80;
		almoco1.tempoCozimento = 30;
		almoco1.preco = 10;

    	Refeicao almoco2 = new Refeicao("feijão com carne de sol", "feijao", 100, "carne de sol", 80, 30, 15);
		Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 7);
		Refeicao cafeDaManha = new Refeicao("batata doce", "ovo");
		
		System.out.println(almoco1);
		System.out.println();
		System.out.println(almoco2);
		System.out.println();
		System.out.println(jantar);
		System.out.println();
		System.out.println(cafeDaManha);
	}
}
