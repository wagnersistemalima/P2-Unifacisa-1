package strings;

public class StringVsStringBuilder {
	
	public static void main(String[] args) {
		
		String nome = "Eduardo";
		System.out.println(System.identityHashCode(nome));
		nome += " de";
		System.out.println(System.identityHashCode(nome));
		nome += " Lucena";
		System.out.println(System.identityHashCode(nome));
		nome += " Falcao";
		System.out.println(System.identityHashCode(nome));
		
		System.out.println("##################");
		
		StringBuilder nomeCompleto = new StringBuilder("Eduardo");
		System.out.println(System.identityHashCode(nomeCompleto));
		nomeCompleto.append(" de");
		System.out.println(System.identityHashCode(nomeCompleto));
		nomeCompleto.append(" Lucena");
		System.out.println(System.identityHashCode(nomeCompleto));
		nomeCompleto.append(" Falcao");
		System.out.println(System.identityHashCode(nomeCompleto));
		
	}

}
