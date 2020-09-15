package entidades;

public class Aluno {

    //atirbutos
	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexoAluno;
	public char turmaAluno;
	public double notas[]=new double[4];
	public boolean situacao;
	
    //metodos	
	public void mostra() {
		if(sexoAluno == 'M') {
			System.out.printf("\nO nome do aluno é %s, do sexo masculino. ",nomeAluno);
		}else if(sexoAluno== 'F') {
			System.out.printf("O nome da aluna é %s, do sexo feminino. ",nomeAluno);
		}
	}
	public void mostrarIdade(int anoNascimentoAluno) {
		System.out.printf("\nA sua idade é: %d", (2020-anoNascimentoAluno));
		this.anoNascimentoAluno=anoNascimentoAluno;
	}

	public void mostrarMedia(double mediaEscola) {
		System.out.printf("\nA media da escola é: %.0f",mediaEscola);
	}
	public void mostrarSituacao(double mediaAluno,double mediaEscola) {
		System.out.printf("\nA media do aluno é: %.0f",mediaAluno);
		if(mediaAluno<=mediaEscola) {
			System.out.print("\n Aluno reprovado.");
		}else if(mediaAluno>mediaEscola){
			System.out.print("\nAluno aprovado");
		}else {
			System.out.print("\nAluno de recuperação");
		}
	}
//	------------------------------------------------------------
	
	
	

	public String getNomeAluno() {
		return nomeAluno;
	}


	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}


	public int getAnoNascimentoAluno() {
		return anoNascimentoAluno;
	}


	public void setAnoNascimentoAluno(int anoNascimentoAluno) {
		this.anoNascimentoAluno = anoNascimentoAluno;
	}


	public char getSexoAluno() {
		return sexoAluno;
	}


	public void setSexoAluno(char sexoAluno) {
		this.sexoAluno = sexoAluno;
	}


	public char getTurmaAluno() {
		return turmaAluno;
	}


	public void setTurmaAluno(char turmaAluno) {
		this.turmaAluno = turmaAluno;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}
		
		
	
		
}
