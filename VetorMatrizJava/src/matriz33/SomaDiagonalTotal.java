package matriz33;

import java.util.Scanner;

public class SomaDiagonalTotal {
	 
	public static void main(String[]args) {
	
	int soma=0,somaD=0,lin=0,col=0;//soma= soma total, somaD= soma na diagonal
	final int LINHA=3;//Valor constante.
	final int COLUNA=3;//Valor constante. 
	int valor[][]= new int [LINHA][COLUNA]; 
	Scanner teclado = new Scanner(System.in);
	
	for(lin=0;lin<LINHA;lin++) {
		for(col=0;col<COLUNA;col++) {
			System.out.print("Digite um valor: ");
			valor[lin][col]=teclado.nextInt();
		}
	}
	for(lin=0;lin<LINHA;lin++) {
		for(col=0;col<COLUNA;col++) {
			System.out.print("["+ valor[lin][col]+"]");	
		}System.out.println();
	}
	
	for(lin=0;lin<LINHA;lin++) {
		for(col=0;col<COLUNA;col++) {
			soma= soma+(valor[lin][col]);	
		}
	}
	somaD= valor[0][0]+valor[1][1]+valor[2][2];//Somando por posição.
	System.out.println("O valor da soma total é: "+soma);
	System.out.println("O valor da soma na diagonal principal é: "+somaD);
	
}

}
