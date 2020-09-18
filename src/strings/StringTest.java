package strings;

public class StringTest {
	
	public static void main(String[] args) {
		
		//Strings não são tipos primitivos.
		//Strings são classses, que podem ser instanciadas.
		//Desse modo, Strings também carregam funções que podem
		//ser executadas sobre o objeto criado.

		//chama um construtor por debaixo dos panos
		String nome = "Eduardo de Lucena Falcao";	
		
		//E.L.F
		//charAt(int index)
		System.out.println("###################");
		System.out.println("## charAt ##");
		System.out.println("###################");
		System.out.println(nome.charAt(0)+"."+nome.charAt(11)+"."+nome.charAt(18));
		
		//contains(String subString)
		System.out.println("###################");
		System.out.println("## contains ##");
		System.out.println("###################");
		System.out.println(nome.contains("y"));
		System.out.println(nome.contains("Eduardo"));
		System.out.println(nome.contains(" "));
		System.out.println(nome.contains("ã"));
		
		//indexOf(String subString)
		System.out.println("###################");
		System.out.println("## indexOf ##");
		System.out.println("###################");
		System.out.println(nome.indexOf("Eduardo"));	//0
		System.out.println(nome.indexOf("Edu"));		//0
		System.out.println(nome.indexOf("Lucena"));		//11
		System.out.println(nome.indexOf("Falcao"));		//18
		System.out.println(nome.indexOf(" "));			//7
		System.out.println(nome.indexOf("o"));			//6
		
		//lastIndexOf(String subString)
		System.out.println("###################");
		System.out.println("## lastIndexOf ##");
		System.out.println("###################");
		System.out.println(nome.lastIndexOf("Eduardo"));	//0
		System.out.println(nome.lastIndexOf("Edu"));		//0
		System.out.println(nome.lastIndexOf("Lucena"));		//11
		System.out.println(nome.lastIndexOf("Falcao"));		//18
		System.out.println(nome.lastIndexOf(" "));			//17
		System.out.println(nome.lastIndexOf("o"));			//23
		
		//dúvida Dicyanne: como calcular a posição a de Lucena?
		System.out.println("###################");
		System.out.println("## como calcular a posição a de Lucena? ##");
		System.out.println("###################");
		int inicio = nome.indexOf("Lucena");		//11
		int deslocamento = ("Lucena").indexOf("a");	//5
		System.out.println(inicio+deslocamento);
		
		System.out.println("###################");
		System.out.println("## isEmpty ##");
		System.out.println("###################");
		System.out.println(nome.isEmpty());
		String nome2 = "";
		System.out.println(nome2.isEmpty());
		//String nome3 = null;
		//System.out.println(nome3.isEmpty());
		
		System.out.println("###################");
		System.out.println("## replace ##");
		System.out.println("###################");
		//replace(String oldString, String newString)
		//nome ==> Eduardo de Lucena Falcao ==> end: 23984723
		System.out.println(nome.replace("Eduardo","EDUARDO"));
		//sem ref ==> EDUARDO de Lucena Falcao ==> end: 432872439
		System.out.println(nome.replace("a","x"));
		//sem ref ==> Eduxrdo de Lucenx Fxlcxo ==> end: 432873432
		
		System.out.println("###################");
		System.out.println("## toLowerCase ##");
		System.out.println("## toUpperCase ##");
		System.out.println("###################");		
		System.out.println(nome.toLowerCase());		
		System.out.println(nome.toUpperCase());
		
		System.out.println("###################");
		System.out.println("## concat ##");
		System.out.println("###################");
		System.out.println("Eduardo ".concat("Falcão"));
		System.out.println("Eduardo "+"Falcão");
		
		System.out.println("###################");
		System.out.println("## comparação de Strings com == ##");
		System.out.println("###################");
		String eduardo1 = "Eduardo";				//criado na String Pool
		String eduardo2 = "Eduardo";				//reusou um objeto previamente criado na String Pool
		String eduardo3 = new String("Eduardo");	//criado fora da String Pool
		System.out.println(eduardo1==eduardo2);		//true
		System.out.println(eduardo1==eduardo3);		//false
		System.out.println(eduardo2==eduardo3);		//false
		
		System.out.println("###################");
		System.out.println("## comparação de Strings com equals");
		System.out.println("###################");
		/** Equals serve para comparar o conteúdo do objeto!!!!!!!! */		
		// Com Strings, é provável que 99.999% das vez você deva usar o equals!!!!
		System.out.println(eduardo1.equals(eduardo2));
		System.out.println(eduardo1.equals(eduardo3));
		System.out.println(eduardo2.equals(eduardo1));
		System.out.println(eduardo2.equals(eduardo3));
		System.out.println(eduardo3.equals(eduardo1));
		System.out.println(eduardo3.equals(eduardo2));
		
		
	}

}
