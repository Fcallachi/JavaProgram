package totalComIdade;

import java.util.Scanner;

public class MaiorMenorAte {

	public static void main(String[] args) {
		//o programa encerra quando é digitado o valor 99
		int idade=0,menor=0,maior=0;
		Scanner tec=new Scanner(System.in);
		
		while(idade!=99) {
		
			System.out.println("Digite sua idade");
			idade=tec.nextInt();
			if(idade<21) {
				menor++;
			}
			if(idade>50) {
				maior++;
			}
		}
		System.out.println("Pessoas com mais de 50 anos:"+ (maior+1));
		System.out.println("Pessoas com menos de 21 anos:"+ menor);

	}

}
