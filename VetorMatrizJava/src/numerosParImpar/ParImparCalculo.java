package numerosParImpar;

import java.util.Scanner;

public class ParImparCalculo {

	public static void main(String[] args) {
		
		final int TAMANHO=6;
		int vet[]= new int[TAMANHO];
		int aux=0;
		int num=0;
		int soma=0,quantImpar=0;
		Scanner tec=new Scanner(System.in);
		
		for(aux=0;aux<6;aux++) {
			
			System.out.print("Digite um n�mero:");
			num=tec.nextInt();
			
			if ((num%2)==0) {
				soma=(soma+num);
				System.out.println("Numero par digitado "+num);
			}else if((num%2)!=0) {
				quantImpar++;
				System.out.println("Numero impar digitado "+num);
			}
			
		}
		System.out.println("----------------------------------------");
		System.out.print("\nOs numeros pares somados:"+soma);
		System.out.print("\nQuantidade de numeros imparers digitados:"+quantImpar);
	
		/*fa�a um programa que receba 6 n�meros inteiros e mostre: 
		ok� Os n�meros pares digitados;  
		ok� A soma dos n�meros pares digitados; 
		ok� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados */

	}

}
