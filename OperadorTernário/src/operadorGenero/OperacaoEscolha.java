package operadorGenero;

import java.util.Scanner;

public class OperacaoEscolha {

	public static void main(String[] args) {
		
		Scanner tec=new Scanner(System.in);
		int opcao,genero;
		
		
		
		System.out.println("Informe seu g�nero: ");
		System.out.print("MASCULINO-DIGITE[1]");
		System.out.print(" - FEMININO-DIGITE[2]");
		System.out.println(" - OUTRO-DIGITE[3]");
		
		genero=tec.nextInt();
		
		System.out.print((genero==1?"Voc� digitou: Masculindo":
				          genero==2?"Voc� digitou : Feminino" : 
				          genero==3?"Voc� digitou: Outro":"valor inv�lido" ));		

  }
}
	


