package maiorNumero;

import java.util.Scanner;

public class MaiorNumeroForIF {

	public static void main(String[] args) {
			Scanner tec = new Scanner(System.in);//varedura de teclado
			int vet[]=new int[3];//vetor
			int aux;//Varrial auxiliar
			int maior=0;
				
			for(aux=0;aux<3;aux++) {
				System.out.print("Digite um número: ");
				vet[aux]=tec.nextInt();
				
				if(maior<vet[aux]){
					maior=vet[aux];			
				}
			}
			System.out.printf("Os numeros em o: %d",maior);
	}

}
