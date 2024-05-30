package edu.lucas.desafio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int parametroDois = scanner.nextInt();
		scanner.close();
		try {
			if(parametroDois < parametroUm) {
				throw new ParametrosInvalidos(parametroUm, parametroDois);
			}
			int contagem = parametroDois - parametroUm;
			for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número: " + i);
		}
		}catch(ParametrosInvalidos erro) {
			System.out.println(erro);
			
		}
	}
	
}