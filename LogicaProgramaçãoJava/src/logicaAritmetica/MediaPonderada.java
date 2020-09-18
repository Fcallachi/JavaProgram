package logicaAritmetica;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[]args) {
		int n1=2,n2=3,n3=5;
		String nome;
		Scanner tec = new Scanner(System.in);
		int media=((n1+n2+n3)/3);
		System.out.print("Digite o seu nome: ");
		nome=tec.next();
		System.out.printf("%s Suas notas foram: %d, %d, %d.",nome,n1,n2,n3);
		System.out.println("");
		System.out.println("Sua media foi:"+media);
	
	}
}
