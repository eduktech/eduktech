package br.com.generation.eduktech;

import java.util.Scanner;

public class ClassePrincipal {
	
	/*
	 * Classe principal, aqui teremos todas as chamadas de metodos
	 */

	public static void main(String[] args) throws InterruptedException {
		
		//declaração de objetos 
		Kids c = new Kids();
		Adolescentes adolescentes = new Adolescentes();
		Frontend f = new Frontend();
		mobile m = new mobile();

		// abertura do programa
		System.out.println("=========================================================");
		System.out.println("=                                                       =");
		System.out.println("=                      EDUKTECH                         =");
		System.out.println("=                    SEJA BEM VINDE!                    =");
		System.out.println("=========================================================");
		
		
		
		Scanner in = new Scanner(System.in);
		
		int resposta1, idade;
		System.out.println();
		System.out.println("VOCÊ TEM INTERESSE NA AREA DE TECNOLOGIA ? ");
		System.out.println();
		System.out.println("DIGITE 1 PARA SIM E 2 PARA NÃO");
		System.out.println();
		System.out.println("1 - SIM | 2 - NÃO");
		resposta1 = in.nextInt();
		System.out.println("=========================================================");
		if(resposta1 == 1) {
			//classe com outras perguntas
			System.out.println("\nQUAL SUA IDADE? ");
			idade = in.nextInt();
			System.out.println("=========================================================");
			
			if(idade >= 6 && idade <= 12) {
				//categoria-infantil
				c.kids();
				System.out.println("=========================================================");
			}
			if(idade > 12 && idade <= 17) {
				//Adolescentes
				adolescentes.Adolescente();
				System.out.println("=========================================================");
				
			}
			if(idade > 17 && idade <= 100) {
				System.out.println("ESCOOLHA UMA ÁREA DE DESENVOLVIMENTO: ");
				System.out.println("1 - FRONTEND ");
				System.out.println("2 - BACKEND ");
				System.out.println("3 - MOBILE ");
				System.out.println("4 - FULLSTACK ");
				resposta1 = in.nextInt();
				System.out.println("=========================================================");
				switch(resposta1) {
				case 1:
					f.front01();
					break;
				case 2:
					//backend
					break;
				case 3:
					m.mobileglobal();
					break;
				case 4:
					//fullstack
					break;
				default:
					System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA");
					System.out.println("=========================================================");
				}

			}
			
		}else {
			System.out.println("OBRIGADO POR PARTICIPAR DO PROGRAMA. CONTINUE ESTUDANDO");
		}

	}

}


