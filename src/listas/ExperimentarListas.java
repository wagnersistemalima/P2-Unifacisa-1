package listas;

import java.util.ArrayList;
import java.util.List;

public class ExperimentarListas {
	
	public static void main(String[] args) {
		
		//List<String> l: quer dizer que só entram objetos do tipo String em l
//		List<String> l = new ArrayList<String>();
//		l.add("eduardo");
//		l.add("joao");
//		l.add("programação 2");
//		l.add("aiuasdioudhasuohdusa");
		
//		List<Pessoa> pessoas = new ArrayList<Pessoa>();
//		pessoas.add(new Pessoa(31,"Eduardo"));
//		pessoas.add(new Pessoa(25,"Mariana"));
//		
//		System.out.println(pessoas);
//		
//		Pessoa objParaRemover = new Pessoa(31,"Eduardo");
//		pessoas.remove(objParaRemover);
//		
//		System.out.println(pessoas);
		
		List<Integer> idades = new ArrayList<Integer>();
		//autoboxing: conversão de int para Integer
		idades.add(23);
		
		//unboxing: conversão de Integer para int
		int idade1 = idades.get(0);
		
		
		
	}

}
