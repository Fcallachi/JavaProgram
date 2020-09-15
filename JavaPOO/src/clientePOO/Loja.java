package clientePOO;

import java.util.Scanner;

import clientePOO.Cliente;

public class Loja {

	public static void main(String[] args) {
		Scanner leia  =new Scanner(System.in);
		Cliente Cliente1 = new Cliente();
		int ano;
	
		
		System.out.println("Sitema de controle - Cliente");
		System.out.print("\nDigite o nome do cliente:");
		Cliente1.nomeCliente= leia.next().toUpperCase();
		System.out.print("\nSexo cliente: [M] | [F]");
		Cliente1.sexoCliente=leia.next().toUpperCase().charAt(0);
		System.out.print("\nDigite qual ano nasceu:");
		ano=leia.nextInt();		
		System.out.println("cliente é cadastrado? [S] | [N]");
		Cliente1.cadastrado=leia.next().toUpperCase().charAt(0);
		
		
		Cliente1.status(ano);
	
		
	}

}
