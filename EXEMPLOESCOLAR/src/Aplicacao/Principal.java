package Aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Principal {

	public static void main(String[] args) {
		Scanner leia  =new Scanner(System.in);
		Aluno exemploAluno = new Aluno();
		int ano;
		double mediaEscola,mediaAluno;
		int aux=0;
		double soma=0;
		
		System.out.println("Sitema de controle escolar em java- POO");
		System.out.print("\nDigite o nome do aluno:");
		exemploAluno.nomeAluno = leia.next().toUpperCase();
		System.out.print("\nSexo aluno [M] | [F]:");
		exemploAluno.sexoAluno=leia.next().toUpperCase().charAt(0);
		System.out.print("\nDigite qual ano você nasceu:");
		ano=leia.nextInt();		
		System.out.print("\nDigite qual é a media da escola: ");
		mediaEscola=leia.nextDouble();
	
		for(aux=0;aux<4;aux++) {
			System.out.print("\nDigite sua nota");
			exemploAluno.notas[aux]=leia.nextDouble();
			
			//maior = notas[0]+notas[1]+notas[2]+notas[3];
		}
		soma = exemploAluno.notas[0]+exemploAluno.notas[1]+
				exemploAluno.notas[2]+exemploAluno.notas[3];
		
		mediaAluno= soma/4;
		
		exemploAluno.mostrarSituacao(mediaAluno,mediaEscola);
		exemploAluno.mostrarMedia(mediaEscola);
		exemploAluno.mostrarIdade(ano);
		exemploAluno.mostra();
	}

}
