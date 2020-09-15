package funcionarioPOO;

public class Funcionario {
	
	public String nomeFuncionario;
	public int anoNascimentoFuncionario;
	public char sexoFuncionario;
	public char cadastrado;
	public String ocupacao;
	
	public void status(int ano) {
		if(sexoFuncionario == 'M') {
			System.out.printf("\nO nome do funcionario é %s, do sexo masculino. ",nomeFuncionario);
		}else if(sexoFuncionario== 'F') {
			System.out.printf("O nome da funcionario é %s, do sexo feminino. ",nomeFuncionario);
		}
		System.out.printf("\nA sua idade é: %d", (2020-ano));
		this.anoNascimentoFuncionario=ano;
		System.out.printf("\nA ocupação dentro da empresa é: %s",ocupacao);
	}

}


