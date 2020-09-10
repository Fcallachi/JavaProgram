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
		System.out.println(par+" números pares.");
		System.out.println(impar+" números impares.");
		
		/* Ler 10 números e imprimir quantos são 
		 * pares e quantos são ímpares.*/

	}

}
