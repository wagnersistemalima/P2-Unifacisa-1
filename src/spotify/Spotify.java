package spotify;

public class Spotify {
	
	private Musica[] musicas;
	private int qtdadeMusicas;
	
	//construtor sem argumentos
	public Spotify() {
		this(10);
	}
	
	//construtor com argumentos
	public Spotify(int tamanhoArray) {
		this.musicas = new Musica[tamanhoArray];
		this.qtdadeMusicas = 0;
	}
	
	public void adicionarMusica(Musica m) {
		if(qtdadeMusicas >= musicas.length) {
			//dobra o tamanho do array
			Musica[] aux = new Musica[2*musicas.length];
			for(int i = 0; i < musicas.length; i++) {
				aux[i] = musicas [i];
			}
			this.musicas = aux;
		}
		musicas[qtdadeMusicas] = m;
		qtdadeMusicas++;
	}
	
	public int getQtdadeMusicas() {
		return qtdadeMusicas;
	}
	
	public void removerMusicaPorNome(String nome) {
		//
	}

}
