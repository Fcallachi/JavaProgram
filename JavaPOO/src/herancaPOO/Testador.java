package herancaPOO;
import herancaPOO.Fornecedor;
import herancaPOO.Pessoa;
public class Testador {

	public static void main(String[] args) {
		
		Pessoa novaPessoa = new Pessoa("Fernando");//nome || nome, endereço || nome, endereço, telefone
		Fornecedor novoFornecedor= new Fornecedor("Luis",500,200);//nome, credito, divida
		Empregado novoEmpregado= new Empregado("Beatriz",2347,4000,50);//nome, codigo, salario, porcentagem imposto
		
		
		System.out.println(novaPessoa.getNome());
		System.out.println(novoFornecedor.getNome());
		System.out.println(novoEmpregado.getNome());
		
		novoFornecedor.obterSaldo();
		novoEmpregado.calcularSalario();
		
	}

}
