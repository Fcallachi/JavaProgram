package multiplo3DoWhile;

import java.util.Scanner;

public class Multiplo3Media {

	public static void main(String[] args) {
		//o programa encerra quando é digitado o valor 0
		Scanner tec= new Scanner(System.in);
		int num=0,aux=0,soma=0,media=0,multi=0;
		
		do {
			System.out.println("Digite um número positivo e inteiro:");
			num=tec.nextInt();
		
			if(num%3==0) {
			multi=num;
			aux++;
			}
			soma=soma+num;
			media=soma/aux;
			
		}while(num!=0);
		System.out.println("A media dos números multiplos de 3 é igual a: " +media);
	
	}

}
