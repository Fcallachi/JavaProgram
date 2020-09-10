package notaAluno;

import java.util.Scanner;

public class MaiorNota {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);	
		int nota[] = new int [5];
		int aux,maiorP=0;
		
		
		for (aux=0;aux<5;aux++) {
			System.out.print("Digite suas notas: ");
			 nota[aux] = teclado.nextInt();
			if(maiorP<nota[aux]) {
				maiorP=nota[aux];
			}
			
		}
		System.out.println("Sua maior nota foi: "+maiorP);
	
	}

}
