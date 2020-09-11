package matrizMaior;

import java.util.*;

public class Matriz3x3 {

	public static void main(String[] args) {
		
		Scanner tec=new Scanner(System.in);
		final int TAMANHO=3;
		int matriz[][]=new int [TAMANHO][TAMANHO];
		int lin=0,col=0;//variavel auxiliar
		int maior=0;
		
		for(lin=0;lin<TAMANHO;lin++) {
			for(col=0;col<TAMANHO;col++) {
				System.out.println("Digite um valor: ");
				matriz[lin][col]=tec.nextInt();
				
				if(matriz[lin][col]>10) {
					maior++;
				}
			}
		}
		for(lin=0;lin<TAMANHO;lin++) {
			for(col=0;col<TAMANHO;col++) {
				System.out.print("["+ matriz [lin] [col]+ "]");
			}System.out.println("");
		}
		
		System.out.println("Números maiores que 10: "+maior);
	}

}