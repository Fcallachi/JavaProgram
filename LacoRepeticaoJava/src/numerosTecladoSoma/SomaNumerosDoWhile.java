package numerosTecladoSoma;

import java.util.Scanner;

public class SomaNumerosDoWhile {

	public static void main(String[] args) {
		int num,soma=0;
		Scanner tec=new Scanner(System.in);
		//o programa encerra quando � digitado o valor 0
		do {
		System.out.println("Digite m n�mero: ");
		num=tec.nextInt();
		
		soma=soma+num;
		
		}while(num!=0);
		System.out.println("A soma de todos os numeros digitados �:"+soma);
		
	}

}
