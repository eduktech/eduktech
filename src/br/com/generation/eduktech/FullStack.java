package br.com.generation.eduktech;

import java.util.Scanner;

public class FullStack {

	public static void main(String[] args) {
char opcaoDigitada;
		
		System.out.println("O que é um desenvolvedor full stack?\n");
		
		System.out.println("O desenvolvedor full stack é capaz de trabalhar com toda a pilha de desenvolvimento" + "\n" + "de um projeto. Além de conseguir atuar com o font-end e o back-end, esse profissional" + "\n" + "também pode contribuir em todas as etapas e partes de um sistema, como o servidor e o" + "\n" + "banco de dados.\r\n"
				+ "\r\n"
				+ "Um dos principais diferenciais para os desenvolvedores full stack é conseguir trabalhar" + "\n" + "também com desenvolvimento mobile, já que essa área está cada vez mais presente nas" + "\n" + "empresas — principalmente em startups. Em muitos casos, esse conhecimento é uma vantagem" + "\n" + "competitiva expressiva para o profissional.\n"
				);
		
		
		System.out.println("Sites de formação Full Stack Gratuitos:\n");
		
		System.out.println(" 1 - Generation Brasil\n 2 - Senac\n 3 - Códigos do amanhã - EBANX\n");
		
		System.out.println("Para mais detalhes digite 1, 2, ou 3 para a opção desejada ou 0 para sair:");
		opcaoDigitada = new Scanner(System.in).next().charAt(0);
		
		switch(opcaoDigitada) {
		case '1':
			System.out.println("Generation Brasil\n\nA Generation Brasil treina você nas habilidades mais relevantes para os empregadores,"+ "\n" + "conectando você com o {seu} futuro." + "\n\n" + "Saiba mais sobre os programas em brazil.generation.org");
		break;
		case '2':
			System.out.println("Senac\n\nVocê aprenderá a desenvolver um projeto web completo, desde a concepção e planejamento" + "\n" + "até a estruturação visual, integração de banco de dados e interação com usuários, incluindo" + "\n" + "front-end e back-end." + "\n\n" + "Saiba mais sobre os programas em www.sp.senac.br/cursos-livres/curso-de-desenvolvedor-full-stack");
		break;
		case '3':
			System.out.println("cda");
		break;
		case '0':
			System.out.println("Sair");
		break;
		default:
			System.out.println("Opção Inválida! Digite uma opção válida!");
		break;
		}
	}
}
