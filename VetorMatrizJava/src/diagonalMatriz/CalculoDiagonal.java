package diagonalMatriz;

import java.util.Random;

public class CalculoDiagonal {

	public static void main(String[] args) {
		
		final int LINHA=3,COLUNA=3;
		int matriz[][]=new int [LINHA][COLUNA];
		int lin=0,col=0;
		int soma=0,total=0;
		Random random = new Random();
		
	
		for(lin=0;lin<LINHA;lin++) {
			for(col=0;col<LINHA;col++) {
				matriz[lin][col] = random.nextInt(6);
		
			total=total+matriz[lin][col];
			 if (lin==col) {
				 soma=soma+matriz[lin][col];
			 }
			}
			
		}
		for(lin=0;lin<LINHA;lin++) {
			for(col=0;col<COLUNA;col++) {
				System.out.print("["+ matriz [lin] [col]+ "]");
			}System.out.println("");
		}
		
		System.out.println("A soma da diagonal principal é: "+soma);
		
	}

}
