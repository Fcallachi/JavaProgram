package entidades;

public class Professor extends Pessoa{

	private String materiaLecionada;
	private boolean mestre;
	private String turmaProfessor;
	
	
	public Professor(String nome, String materiaLecionada,String turmaProfessor) {
		super(nome);
		this.materiaLecionada = materiaLecionada;
		this.turmaProfessor= turmaProfessor;
	}


	public String getTurmaProfessor() {
		return turmaProfessor;
	}


	public void setTurmaProfessor(String turmaProfessor) {
		this.turmaProfessor = turmaProfessor;
	}

	
	
	
	
}
