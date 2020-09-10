package jogoDeDados;

import java.util.Random;

public class DadosEstatistica {
		public static void main(String[] args) {
		
		float media=0;
		int aux=0,maiorP=0,ocorre=0,soma=0;
		final int TAMANHO=10;
		int vet[]= new int [TAMANHO];
		Random random = new Random();
		
		
		for(aux=0;aux<TAMANHO;aux++) {
			int dados = random.nextInt(6);
			int dadoOficial= dados+1;
			System.out.println("Dados lançados...");
			System.out.println("["+(dadoOficial)+"]");
			soma= soma +dadoOficial;
			
			if(maiorP<dadoOficial) {
				maiorP=dadoOficial;
			
			}if (maiorP==dadoOficial) {
				ocorre++;
			}
		}
		
		
		media=soma/TAMANHO;
		System.out.println("A média aritmética dos lançamentos é igual a: "+media);
		System.out.println("O maior numero jogado foi: "+maiorP);
		System.out.print("o Número "+maiorP+" foi jogado "+ocorre+" vezes.");
	}
}
