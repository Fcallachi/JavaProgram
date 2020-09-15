package funcionarioPOO;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		
		Scanner leia  =new Scanner(System.in);
		Funcionario Funcionario1 = new Funcionario();
		int ano;
	
		
		System.out.println("Sitema de controle -Funcionario");
		System.out.print("\nDigite o nome do funcionario:");
		Funcionario1.nomeFuncionario= leia.next().toUpperCase();
		System.out.print("\nSexo cliente: [M] | [F]");
		Funcionario1.sexoFuncionario=leia.next().toUpperCase().charAt(0);
		System.out.print("\nDigite qual ano nasceu:");
		ano=leia.nextInt();		
		System.out.println("Digite qual a ocupação do funcionario:");
		Funcionario1.ocupacao=leia.next();	
			
		Funcionario1.status(ano);
	
	}

}
