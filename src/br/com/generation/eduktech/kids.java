package br.com.generation.eduktech;

import java.util.Scanner;

public class kids {
	int jogo, nivel;

	Scanner ler = new Scanner(System.in);

	//if (idade > 06 && idade =< 12) {

	System.out.println("Ja brincou aqui antes? Digite '1' para sim ou '2' para nao?");
	nivel = ler.nextInt();


	if (nivel == 2) {
		System.out.println("A sua jornada começa aqui: https://studio.code.org/s/pre-express-2021/");
	} else { 

		if(nivel == 1) {
			System.out.println("Qual jogo voce quer jogar?");
			System.out.println("Digite 1 para Frozen");
			System.out.println("Digite 2 para Minecraft");
			System.out.println("Digite 3 para Festa dançante");
			jogo = ler.nextInt();

			if (jogo <= 3 && jogo >= 0) {
				switch (jogo) {
				case 1:
					System.out.println("Acesse: 'https://studio.code.org/s/frozen/lessons/1/levels/1' ");
					break;

				case 2:

					System.out.println("Acesse: 'https://code.org/minecraft' ");

					break;

				case 3:

					System.out.println("Acesse: 'https://code.org/dance' ");

					break;
				}

			}else
			{
				System.out.println("Ainda não temos essa opção :/ ");
			}
		}
	}
}
}

