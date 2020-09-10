package equacao;

import java.util.Scanner;

public class EquacaoABC {

	public static void main(String[] args) {
			int A,B,C,D,R,S;//Letras representada na equação
			Scanner tec= new Scanner(System.in);
			System.out.print("Entre com um números: ");
			A=tec.nextInt();
			System.out.print("Digite o segundo número: ");
			B=tec.nextInt();
			System.out.print("Digite o terceiro e ultimo numero: ");
			C=tec.nextInt();
			System.out.println("Valor sendo calculado...");
		
			S=(B+C)*(B+C);
			R=(A+B)*(A+B);
			D=(R+S)/2;
			
			System.out.println("O valor de S é "+S+", O valor de R é "+R+", O valor de D é "+D+".");
			tec.close();
	}

}
