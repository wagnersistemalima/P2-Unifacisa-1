package basics;

import java.util.Scanner;

public class MediaAluno {
	
	//enquanto o usuário não digitar -1, considere o valor como  sendo uma nota
	// 10, 6, 8, 9, 4.5, -1
	
	public static void main(String[] args) {
		//ctrl+shift+o: corrige importações de biblioteca
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0, media = 0;
		int cont = 0;
		while(nota != -1) {
			//syso + ctrl + espaço: atalho para System.out.println(); 
			System.out.println("Digite a nota do aluno (ou -1 para encerrar):");
			nota = entrada.nextDouble();
			if(nota != -1) {
				media += nota;
				cont++;
			}
		}
		
		entrada.close();
		
		System.out.println(media/cont);
	}

}
