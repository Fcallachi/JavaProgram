package idadeLaco;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		int idade,categoria;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade=tec.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Categoria infantil.");
		}else if (idade>=15 && idade<=17) { 
			System.out.println("Categoria juvenil");
		}else if (idade>=18 && idade<=25) { 
			System.out.println("Categoria adulto");
		}else {
			System.out.println("idade invalida...");
		}

	}

}
