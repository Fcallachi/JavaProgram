package parImpar10numero;

import java.util.Scanner;

public class ParImparLaco10 {

	public static void main(String[] args) {
		int num,par=0,impar=0;
		Scanner tec=new Scanner(System.in);
		for(num=0;num<11;num++) {
			System.out.print("Digite um numero");
			num=tec.nextInt();
			if ((num%2)==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println(par+" n�meros pares.");
		System.out.println(impar+" n�meros impares.");
		
		/* Ler 10 n�meros e imprimir quantos s�o 
		 * pares e quantos s�o �mpares.*/

	}

}
