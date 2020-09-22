package spotify;

public class Musica{
	
	//nome, artista, letra, gênero (use Enum), ano de lançamento, duração
	//número de vezes que foi reproduzida
	private String nome, artista, letra;
	private Genero genero;
	private int anoLancamento, numReproduzida;
	private double duracao;
	
	public Musica(String nome, String artista, String letra, Genero genero,
				  int anoLancamento, double duracao) {
		this.nome = nome;
		this.artista = artista;
		this.letra = letra;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.numReproduzida = 0;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public String getLetra() {
		return letra;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public int getNumReproduzida() {
		return numReproduzida;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	public void tocarMusica() {
		this.numReproduzida++;
	}
	
	@Override
	public String toString() {
		String out = "";
		out += artista+"/"+nome+"/"+duracao+"\n";
		out += genero+"/"+anoLancamento+"/"+numReproduzida;
		return out;
	}	
}
