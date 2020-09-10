package maiorMenor;

import java.util.Scanner;

public class CalculoMaiorMenor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int num[]=new int[3];
		int aux=0,maior=0,menor=0,meio=0;
		
		
		for(aux=0;aux<3;aux++) {
			System.out.print("Digite um numero:");
			num[aux]=tec.nextInt();
		
			if(menor>num[aux]) {	
				menor=num[aux];
			}
			if(maior<num[aux]) {
				maior=num[aux];
			}
			if(num[aux]>=menor && num[aux]<=maior){
				meio=num[aux];
			}
			
						
		}	
		
		System.out.println("NUMEROS EM ORDEM CRESCENTE");
		System.out.print(menor+","+meio+","+maior);
	}
}
