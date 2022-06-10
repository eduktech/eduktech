package br.com.generation.eduktech;

import java.util.Scanner;

public class FullStack {

	public static void main(String[] args) {
char opcaoDigitada;
		
		System.out.println("O que � um desenvolvedor full stack?\n");
		
		System.out.println("O desenvolvedor full stack � capaz de trabalhar com toda a pilha de desenvolvimento" + "\n" + "de um projeto. Al�m de conseguir atuar com o font-end e o back-end, esse profissional" + "\n" + "tamb�m pode contribuir em todas as etapas e partes de um sistema, como o servidor e o" + "\n" + "banco de dados.\r\n"
				+ "\r\n"
				+ "Um dos principais diferenciais para os desenvolvedores full stack � conseguir trabalhar" + "\n" + "tamb�m com desenvolvimento mobile, j� que essa �rea est� cada vez mais presente nas" + "\n" + "empresas � principalmente em startups. Em muitos casos, esse conhecimento � uma vantagem" + "\n" + "competitiva expressiva para o profissional.\n"
				);
		
		
		System.out.println("Sites de forma��o Full Stack Gratuitos:\n");
		
		System.out.println(" 1 - Generation Brasil\n 2 - Senac\n 3 - C�digos do amanh� - EBANX\n");
		
		System.out.println("Para mais detalhes digite 1, 2, ou 3 para a op��o desejada ou 0 para sair:");
		opcaoDigitada = new Scanner(System.in).next().charAt(0);
		
		switch(opcaoDigitada) {
		case '1':
			System.out.println("Generation Brasil\n\nA Generation Brasil treina voc� nas habilidades mais relevantes para os empregadores,"+ "\n" + "conectando voc� com o {seu} futuro." + "\n\n" + "Saiba mais sobre os programas em brazil.generation.org");
		break;
		case '2':
			System.out.println("Senac\n\nVoc� aprender� a desenvolver um projeto web completo, desde a concep��o e planejamento" + "\n" + "at� a estrutura��o visual, integra��o de banco de dados e intera��o com usu�rios, incluindo" + "\n" + "front-end e back-end." + "\n\n" + "Saiba mais sobre os programas em www.sp.senac.br/cursos-livres/curso-de-desenvolvedor-full-stack");
		break;
		case '3':
			System.out.println("cda");
		break;
		case '0':
			System.out.println("Sair");
		break;
		default:
			System.out.println("Op��o Inv�lida! Digite uma op��o v�lida!");
		break;
		}
	}
}
