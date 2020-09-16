package aplicacao;
import entidades.Pessoa;
import entidades.Professor;
import entidades.Aluno;
import entidades.Disciplina;
public class Cadastro {
	public static void main(String[] args)
	{
		System.out.println("SISTEMA DE CADASTRO:");
		
		Pessoa fulano = new Pessoa("JOAO");
		Pessoa sicrano = new Pessoa("MARIA",'F',1970);
		Aluno novoAluno = new Aluno("Fernando",'M',2000,"Negro");
		Disciplina materia=new Disciplina ("Matematica");		
		materia.setNomeDisciplina("Portugues");
	
		Professor novoProfessor = new Professor("Luiza","MODULO2","A");
		
		System.out.println(novoProfessor.getNome());
		System.out.println(novoProfessor.getTurmaProfessor());
		System.out.println(novoAluno.getNome());
	}
}