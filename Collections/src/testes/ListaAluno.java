package testes;

import java.util.Set;
import java.util.HashSet;

public class ListaAluno {

	public static void main(String[] args) {
		Set<Aluno> conjunto =new HashSet<Aluno>();//verifica se não é igual

		Aluno a = new Aluno("fernando gabriel", "java",9);
		Aluno b = new Aluno("fernando callachi", "java",8);
		Aluno c = new Aluno("fernando rocha", "java",7);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		
		System.out.println(conjunto);
	}

}
