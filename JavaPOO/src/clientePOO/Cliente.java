package clientePOO;

public class Cliente {
	
	public String nomeCliente;
	public int anoNascimentoCliente;
	public char sexoCliente;
	public char cadastrado;
	
	public void status(int ano) {
		if(sexoCliente == 'M') {
			System.out.printf("\nO nome do cliente é %s, do sexo masculino. ",nomeCliente);
		}else if(sexoCliente== 'F') {
			System.out.printf("O nome da cliente é %s, do sexo feminino. ",nomeCliente);
		}
		System.out.printf("\nA sua idade é: %d", (2020-ano));
		this.anoNascimentoCliente=ano;
		if(cadastrado=='S') {
			System.out.println(", cliente cadastrado");
		}else {
			System.out.println(", cliente não encontrado no sistema.");
		}
	}

}
