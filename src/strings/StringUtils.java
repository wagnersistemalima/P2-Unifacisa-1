package strings;

public class StringUtils {
	
	public static String formataAtributo(String atributo) {
		//atributo ==> "quantidade de questoes"
		String[] palavras = atributo.split(" ");
		//["quantidade", "de", "questões"]
		
		String atributoFormatado = palavras[0];
		for(int i = 1; i < palavras.length; i++) {
			// palavras[i] ==> "de", "questões"
			char ini = palavras[i].toUpperCase().charAt(0);
			String aux = String.valueOf(ini);
			//aux ==> "D", "Q"
			aux += palavras[i].substring(1);
			//aux ==> "De", "Questões"
			atributoFormatado += aux;
		}
		
		return atributoFormatado;
	}

}
