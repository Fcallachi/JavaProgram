package bancoCentral;

import contas.ContaCorrente;
import contas.ContaEspecial;

public class Agencia {
	public static void main(String[]args) {
	//ContaEspecial  testconta = new ContaEspecial();
	
		ContaCorrente contacorrente1 = new ContaCorrente(1234654,0.0,2);
		
		contacorrente1.credite(100);
		contacorrente1.emiteExtrato();
		
		
	}
}
