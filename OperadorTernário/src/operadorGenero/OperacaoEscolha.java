package operadorGenero;

import java.util.Scanner;

public class OperacaoEscolha {

	public static void main(String[] args) {
		
		Scanner tec=new Scanner(System.in);
		int opcao,genero;
		
		
		
		System.out.println("Informe seu gênero: ");
		System.out.print("MASCULINO-DIGITE[1]");
		System.out.print(" - FEMININO-DIGITE[2]");
		System.out.println(" - OUTRO-DIGITE[3]");
		
		genero=tec.nextInt();
		
		System.out.print((genero==1?"Você digitou: Masculindo":
				          genero==2?"Você digitou : Feminino" : 
				          genero==3?"Você digitou: Outro":"valor inválido" ));		

  }
}
	


