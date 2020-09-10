package parImparIfElse;

import java.util.Scanner;

public class ParImparRaiz {
	public static void main(String[] args) {
		Scanner tec =new Scanner(System.in);
		int elevado2,num;
		double raiz;
		
		System.out.print("Digite um numero: ");
		num= tec.nextInt();
		elevado2= num*num;
		raiz= Math.sqrt(num);
		
		
		if (num%2==0) {
			System.out.println("O numero é par.");
			System.out.print("Raiz quadrada de "+num +" é igual a:"+raiz);
		}else {
			System.out.println("O numero é impar.");
			System.out.print(num+" elevado ao quadrado é igual a:"+elevado2);
		}
	}		
}
