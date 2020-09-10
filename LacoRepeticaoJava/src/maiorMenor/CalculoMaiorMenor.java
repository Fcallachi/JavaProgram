package maiorMenor;

import java.util.Scanner;

public class CalculoMaiorMenor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int num[]=new int[3];
		int aux=0;
		int num1,num2,num3;
	
		System.out.print("Digite o primeiro numero: ");
		num1=tec.nextInt();
		System.out.print("Digite o primeiro numero: ");
		num2=tec.nextInt();
		System.out.print("Digite o primeiro numero: ");
		num3=tec.nextInt();
		
		if (num1>num2 && num1>num3 && num2<num1 &&num2<num3) {
			System.out.println(num1+","+num2+","+num3);	
		}//apresentando erro
		
		
	}	
}
