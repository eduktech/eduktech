package br.com.generation.eduktech;

import java.util.Scanner;

public class Frontend {

		public void front01() throws InterruptedException {
			
		
			Scanner leia = new Scanner(System.in);
			
			int opcao1=0, opcao2=0,opcao3=0, interesse = 0, nivel=0;
			
			
			System.out.println("------------ FRONT END -------------\n");
			System.out.println("O que � Front-end? ");
			System.out.println("O desenvolvimento front-end da web � o desenvolvimento da interface gr�fica do usu�rio de um site,  por meio do uso de HTML, CSS e JavaScript,\n "
					+ "para que os usu�rios possam visualizar e interagir com aquele site. Desse modo, front-end refere-se a todo o conte�do que fica vis�vel para o p�blico, ou seja,\n"
					+ "ele � respons�vel pela intera��o com o usu�rio.Para exemplificar, o layout, efeitos visuais e at� mesmo a valida��o dos formul�rios do site que voc� visita s�o \n"
					+ "feitas por um Desenvolvedor Front-End. ");

			System.out.println();		
			System.out.println("Se interessou?");
			System.out.println();
			Thread.sleep(500);
			System.out.println("Digite 1 para SIM");
			Thread.sleep(300);
			System.out.println("Digite 2 para N�O");
			interesse=leia.nextInt();
			
			if ( interesse ==1) {
				System.out.println();
				Thread.sleep(500);
				System.out.println("Qual n�vel deseja aprender??");
				Thread.sleep(1000);
				System.out.println( "Digite :");
				Thread.sleep(500);
				System.out.println("1 para iniciante\n2 para intermedi�rio\n3 para avan�ado");
				nivel=leia.nextInt();
				
			if(nivel == 1 && nivel !=2 && nivel !=3) {
				Thread.sleep(500);			
			  System.out.println("Separamos aqui alguns cursos gratuitos que podem te ajudar em sua jornada:");
				Thread.sleep(500);
				System.out.println();
				System.out.println("https://www.cursoemvideo.com/curso/html5/");
				Thread.sleep(300);
				System.out.println("https://www.cursoemvideo.com/curso/html5-css3modulo1/ ");
				Thread.sleep(300);
				System.out.println("https://www.cursoemvideo.com/curso/javascript/ ");
				Thread.sleep(300);
				System.out.println();
				System.out.println();
			    System.out.println("Bons estudos !!!!");
				
						
						}
			if(nivel==2 && nivel!=1 && nivel!=3) {
				Thread.sleep(500);
				System.out.println("Separamos aqui alguns cursos gratuitos que podem te ajudar em sua jornada:");
				Thread.sleep(500);
				System.out.println();
				System.out.println("https://www.cursoemvideo.com/curso/curso-html5-e-css3-modulo-2-de-5-40-horas/");
				Thread.sleep(300);
				System.out.println("https://www.cursoemvideo.com/curso/curso-html5-e-css3-modulo-3-de-5-40-horas/ ");
				Thread.sleep(300);
				System.out.println("https://www.udemy.com/share/1053Di3@tsW5GgeHyAmpskWGOZggMy_SGp1FbVvRo1DfDgnFUiTmOSPLscEb9diy9SiHrVS0vA==/  ");
				Thread.sleep(300);
				System.out.println();
				System.out.println();
			    System.out.println("Bons estudos !!!!");
						
			}
			
			if(nivel==3 && nivel!=2 && nivel!=1) {
				Thread.sleep(500);
				System.out.println("Separamos aqui alguns cursos gratuitos que podem te ajudar em sua jornada:");
				Thread.sleep(500);
				System.out.println();
				Thread.sleep(300);
				System.out.println("https://web.dio.me/course/desenvolvimento-avancado-com-javascript-es6/learning/75ee88ab-99f3-4ab8-8620-7efafcb26481/?back=/browse  ");
				Thread.sleep(300);
				System.out.println("https://web.dio.me/course/posicionando-elementos-com-flexbox-em-css/learning/46f1e8c7-ef6e-458e-ad4e-369fc65faba7/?back=/browse  ");
				Thread.sleep(300);
				System.out.println("https://web.dio.me/course/introducao-ao-nodejs-com-expresses/learning/3f18da80-2051-44dd-b065-562751093ac3/?back=/browse");
				Thread.sleep(300);
				System.out.println();
				System.out.println();
			    System.out.println("Bons estudos !!!!");
			
			}
			
			
							
			if(nivel !=1 && nivel!=2 && nivel!=3) {
				System.out.println();
				Thread.sleep(500);
				System.out.println("Op��o inv�lida.Digite novamente ou retorne ao menu principal."); }				
			}
			
						if(interesse== 2) {
						  System.out.println();
						  Thread.sleep(500);
						  System.out.println("Retorne ao menu principal para escolher outras op��es."); }
			
						if(interesse !=1 && interesse !=2) {
						  Thread.sleep(500);
				          System.out.println("Op��o inv�lida, digite novamente ou retorne ao menu principal");}
						
						System.out.println();
						Thread.sleep(500);	
			
		
		
	}

}
