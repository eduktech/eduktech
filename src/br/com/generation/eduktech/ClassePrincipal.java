package br.com.generation.eduktech;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Seja bem vindes!");
		//inicio
		System.out.println("===Inicio do programa===");
		Scanner in = new Scanner(System.in);
		
		int resposta1, idade;
		
		System.out.println("Voc� tem interesse na carreira Tech?");
		System.out.println("Digite 1 para sim e 2 para n�o.");
		System.out.println("1 - Sim | 2 - N�o");
		resposta1 = in.nextInt();
		if(resposta1 == 1) {
			//classe com outras perguntas
			System.out.println("Qual sua idade? ");
			idade = in.nextInt();
			if(idade >= 6 && idade <= 12) {
				//categoria-infantil
			}
			if(idade > 12 && idade <= 17) {
				//Adolescentes();
			}
			if(idade > 17 && idade <= 100) {
				//adultos
			}
			
		}else {
			//mensagem de incentivo ou despedida
		}

	}

}


