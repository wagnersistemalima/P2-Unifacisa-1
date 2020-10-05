package spotify;

public enum Genero {
	BLUES(0), CLASSICO(1), FORRO(2), FUNK(3), JAZZ(4), PAGODE(5), RAP(6), ROCK(7), SAMBA(8);   
	
	private int i;
	private Genero(int i) {
		this.i = i;
	}	
	
	public int getI() {
		return i;
	}
}
