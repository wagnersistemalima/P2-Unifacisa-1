package basics;

import java.util.Scanner;

public class ParesPositivos {
	
	public static void main(String[] args) {
		
		// Escreva um programa que receba como entrada 25 números 
		// e exiba a quantidade de números que são pares e positivos
		
		Scanner entrada = new Scanner(System.in);
		int contParesPositivos = 0;
		
//		for(int i = 1; i <= 25; i++) {
//			System.out.print("Digite um número: ");
//			int num = entrada.nextInt();
//			if(num % 2 == 0 && num > 0)
//				contParesPositivos++;
//		}
		
//		int i = 1;
//		while(i <= 25) {
//			System.out.print("Digite um número: ");
//			int num = entrada.nextInt();
//			if(num % 2 == 0 && num > 0)
//				contParesPositivos++;
//			i++;	//i incrementado
//		}
		
		int i = 1;
		do {
			System.out.print("Digite um número: ");
			int num = entrada.nextInt();
			if(num % 2 == 0 && num > 0)
				contParesPositivos++;
			i++;	//i incrementado
		}while(i <= 25);
		
		System.out.println("Quantidade de numeros pares positivos: "+contParesPositivos);
	}

}
