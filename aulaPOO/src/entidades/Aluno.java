package entidades;

public class Aluno extends Pessoa
{
	private String turma;
	private double notas[] = new double[2];
	
	public Aluno(String nome, char sexo, int anoNasc, String etnia) {
		super(nome, sexo, anoNasc, etnia);
		this.turma = turma;
		
	}

	
}