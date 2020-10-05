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
		if(qtdadeMusicas == musicas.length) {
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
		boolean deslocarAEsquerda = false;
		for(int i = 0; i < this.qtdadeMusicas; i++) {
			if(musicas[i].getNome().equals(nome)) {
				deslocarAEsquerda = true;
			}
			if(deslocarAEsquerda) {
				this.musicas[i] = this.musicas[i+1];
			}
		}
	}
	
	//listar todas as músicas de um artista
	public Musica[] listarMusicas(String artista) {
		//primeiro contamos qtas musicas esse artista tem
		int cont = 0;
		for(Musica m : this.musicas) {
			if(m != null && m.getArtista().equals(artista)) {
				cont++;
			}
		}
		if(cont > 0) {
			//se houver alguma msk, instanciamos o array com o tamanho correto
			Musica[] musicasDoArtista = new Musica[cont];
			int i = 0;
			//varre novamente o array this.musicas para copiar
			//apenas as musicas do artista para esse array local (musicasDoArtista)
			for(Musica m : this.musicas) {
				if(m != null && m.getArtista().equals(artista)) {
					musicasDoArtista[i] = m;
					i++;
				}
			}
			return musicasDoArtista;
		} else {
			return null;
		}
	} 
	
	//listar todas as músicas lançadas em um ano específico;
	//sobrecarga
	public Musica[] listarMusicas(int ano) {
		//primeiro contamos qtas musicas existem nesse ano
		int cont = 0;
		for(Musica m : this.musicas) {
			if(m != null && m.getAno() == ano) {
				cont++;
			}
		}
		if(cont > 0) {
			//se houver alguma msk, instanciamos o array com o tamanho correto
			Musica[] musicasDoAno = new Musica[cont];
			int i = 0;
			//varre novamente o array this.musicas para copiar
			//apenas as musicas do ano para esse array local (musicasDoAno)
			for(Musica m : this.musicas) {
				if(m != null && m.getAno() == ano) {
					musicasDoAno[i] = m;
					i++;
				}
			}
			return musicasDoAno;
		} else {
			return null;
		}
	}
	
	public Genero getGeneroMaisPopular() {
		int[] cont = new int[9];
		
		for(int i = 0; i < qtdadeMusicas; i++) {
			switch(this.musicas[i].getGenero()){
				case BLUES:					
					cont[Genero.BLUES.getI()]++;
					break;
				case CLASSICO:					
					cont[Genero.CLASSICO.getI()]++;
					break;
				case FORRO:					
					cont[Genero.FORRO.getI()]++;
					break;
				case FUNK:					
					cont[Genero.FUNK.getI()]++;
					break;
				case JAZZ:					
					cont[Genero.JAZZ.getI()]++;
					break;
				case PAGODE:					
					cont[Genero.PAGODE.getI()]++;
					break;
				case RAP:					
					cont[Genero.RAP.getI()]++;
					break;
				case ROCK:					
					cont[Genero.ROCK.getI()]++;
					break;
				case SAMBA:					
					cont[Genero.SAMBA.getI()]++;
					break;					
			}
		}
		
		//[0,2,1,4,7,9,0,1]
		int indexMaior = 0;
		for(int i = 0; i < cont.length; i++) {
			if(cont[i]>cont[indexMaior])
				indexMaior = i;
		}
		
		switch(indexMaior){
			case 0:					
				return Genero.BLUES;
			case 1:					
				return Genero.CLASSICO;
			case 2:					
				return Genero.FORRO;
			case 3:					
				return Genero.FUNK;
			case 4:					
				return Genero.JAZZ;
			case 5:					
				return Genero.PAGODE;
			case 6:					
				return Genero.RAP;
			case 7:					
				return Genero.ROCK;
			case 8:					
				return Genero.SAMBA;
			default:
				return null;
		}
	}
	
	public static void main(String[] args) {
		Spotify spt = new Spotify(5);
		spt.adicionarMusica(new Musica("Musica1", "Artista1", "abc", Genero.FORRO, 1999, 3.5));
		spt.adicionarMusica(new Musica("Musica2", "Artista2", "def", Genero.SAMBA, 2005, 4.0));
		spt.adicionarMusica(new Musica("Musica3", "Artista3", "ghi", Genero.CLASSICO, 2010, 4.2));
		spt.adicionarMusica(new Musica("Musica4", "Artista4", "jkl", Genero.JAZZ, 2015, 3.0));
		spt.adicionarMusica(new Musica("Musica5", "Artista5", "mno", Genero.FUNK, 2019, 3.7));
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		System.out.println("\n############\n");
		
		spt.adicionarMusica(new Musica("Musica6", "Artista6", "pqr", Genero.JAZZ, 2016, 3.75));
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		spt.removerMusicaPorNome("Musica2");
		
		System.out.println("\n############\n");
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		
		System.out.println("\n############\n");
		Musica[] musicasArtista3 = spt.listarMusicas(new String("Artista3"));
		for(Musica m : musicasArtista3) {
			System.out.println(m);
		}
	}

}
