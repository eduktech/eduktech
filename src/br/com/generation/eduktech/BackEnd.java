package br.com.generation.eduktech;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class BackEnd {


public void Backend() throws InterruptedException {
	
	 JOptionPane.showMessageDialog(null,"-----> Sejam Bem vindes a pagina Back End <-----");

	System.out.println();	
	System.out.println("Como o pr�prio nome sugere, vem da ideia daquilo que tem por tr�s de uma aplica��o. Pode ficar meio abstrato num primeiro momento, mas pense que para conseguir usar o Facebook no dia a dia, os dados (as informa��es) do seu perfil, amigos e publica��es precisam estar salvos em algum lugar e serem processados a partir dele, sendo este lugar um banco de dados.");
	System.out.println();
	System.out.println("� comum pessoas desenvolvedoras Back End trabalharem com ferramentas de linha de comando, sites (deixando o HTML din�mico), an�lise de dados (embora isso puxe mais o que um Data Scientist faz). Tudo isso pode ser feito com uma s�rie de linguagens de programa��o diferentes como: PHP, Ruby, Java, Clojure, C#, entre diversas outras..");
	System.out.println();	
    System.out.println("------------");	
	Scanner leia = new Scanner(System.in);
	
	int opcao1=0, opcao2=0,opcao3=0, interesse = 0, nivel=0;

	System.out.println();		
	System.out.println("Se interessou em Back End?");
	System.out.println();
	Thread.sleep(500);
	System.out.println("Digite 1 para SIM");
	Thread.sleep(300);
	System.out.println("Digite 2 para N�O");
	interesse = leia.nextInt();
	
if (interesse ==1) {
		System.out.println();
		Thread.sleep(500);
		System.out.println("Acesso aos links Gratuito!! ");
		Thread.sleep(1000);
		System.out.println( "Digite 1 :");
		Thread.sleep(500);
		System.out.println("1 para Cursos Back end ");
		nivel=leia.nextInt();
		
		if(nivel== 1) {
			Thread.sleep(500);
			System.out.println("Selecionamos alguns cursos gratuitos para iniciar o sua no Forma��o: ");
			System.out.println();
			Thread.sleep(500);
			System.out.println();
			Thread.sleep(300);
			System.out.println("| Java |:");
			System.out.println("https://www.cursoemvideo.com/curso/java-basico/");
			System.out.println();
			Thread.sleep(300);
			System.out.println("| Algoritimos |: ");
			System.out.println("https://www.cursoemvideo.com/curso/curso-de-algoritmo/");
			System.out.println();
			Thread.sleep(300);
			System.out.println(" |Java Poo |:");
			System.out.println("https://www.cursoemvideo.com/curso/java-poo/");
			System.out.println();
			Thread.sleep(300);
			System.out.println();
			System.out.println();
		    System.out.println("Bons estudos e bons Videos!!!!");
		
		
		
	    System.out.println("------------");	


					
	if(nivel !=1 ) {
		System.out.println();
		Thread.sleep(500);
		System.out.println("Op��o inv�lida.Digite novamente ou retorne ao menu principal."); 			

				
			
	
	
	
	}
}

	}
  }
}

