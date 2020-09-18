package arrays;

import java.util.Scanner;

public class TesteArrays {
	
	public static void main(String[] args) {
		
//		int[] mat = new int[] {1,5,2,6,3};
//		ou
//		int[] mat = new int[5];
//		mat[0] = 1;
//		mat[1] = 5;
//		mat[2] = 2;
//		mat[3] = 6;
//		mat[4] = 3;
		
//		float[] mat = new float[] {1.5f,5.0f,2.3f,-6f,-3f};
//		boolean[] mat = new boolean[] {true, true, false, false};
//		char[] nome = new char[] {'e', 'd', 'u', 'a', 'r', 'd', 'o'};
		
//		Pessoa[] alunos = new Pessoa[] {
//										new Pessoa("Eduardo", 31),
//										new Pessoa("Breno", 25),
//										new Pessoa("Wagner", 26),
//										new Pessoa("Raquel", 24)
//										};
//		alunos[0] = new Pessoa("Johnathan", 23);
//		nao pode
//		alunos[1] = 4.0f;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas a ser inserida");
		int qtdadeNotas = entrada.nextInt();
		int [] notas = new int[qtdadeNotas];
		System.out.println("Digite as notas (uma por linha):");
		for(int i = 0; i < qtdadeNotas; i++) {
			notas[i] = entrada.nextInt();
		}		
		for(int nota: notas) {
			System.out.println("Nota: "+nota);
		}
		
	}

}
