package funcionarioPOO;

public class Funcionario {
	
	public String nomeFuncionario;
	public int anoNascimentoFuncionario;
	public char sexoFuncionario;
	public char cadastrado;
	public String ocupacao;
	
	public void status(int ano) {
		if(sexoFuncionario == 'M') {
			System.out.printf("\nO nome do funcionario � %s, do sexo masculino. ",nomeFuncionario);
		}else if(sexoFuncionario== 'F') {
			System.out.printf("O nome da funcionario � %s, do sexo feminino. ",nomeFuncionario);
		}
		System.out.printf("\nA sua idade �: %d", (2020-ano));
		this.anoNascimentoFuncionario=ano;
		System.out.printf("\nA ocupa��o dentro da empresa �: %s",ocupacao);
	}

}


