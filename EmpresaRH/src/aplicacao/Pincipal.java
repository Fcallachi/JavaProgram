package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiro;
public class Pincipal
{
	public static void main(String[] args)
	{
		/*double salarioColaborador; //variavel
		
		Funcionario colaborador1 = new Funcionario();
		Funcionario colaborador2 = new Funcionario("MARIA");
		Funcionario colaborador3 = new Funcionario("PEDRO",40,30.5);
		Terceiro terceiro1 = new Terceiro("ZÉ", 20, 10, 5.5);
		
		
		System.out.printf("%s vc vai ganhar %.2f\n", colaborador2.getNome(), colaborador2.pagamento(20, 10.5));
		
		System.out.println("Nome do do terceiro: "+terceiro1.getNome());
		System.out.println("Salario do terceiro: "+terceiro1.pagamento());*/
		int n;
		char opc;
		String nome;
		int hora;
		double valorHora;
		double valorExtra;
		
		Scanner leia = new Scanner(System.in);
		List<Funcionario> list = new ArrayList();
		
		System.out.print("Digite o numero de funcionarios:");
		n= leia.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print("Nome do funcionario"+i+":");
			System.out.print("Terceiro [s]|[n]:");
			opc=leia.next().charAt(0);
			System.out.print("Nome");
			nome=leia.next();
			System.out.print("Horas trabalhadas: ");
			hora=leia.nextInt();
			System.out.print("Valor horas trabalhadas: ");
			valorHora=leia.nextInt();
			
			if (opc == 'S') {
				System.out.print("Digite o valor hora extra");
				valorExtra=leia.nextDouble();
				list.add(new Terceiro(nome,hora,valorHora,valorExtra));
			}else {
				list.add(new Funcionario(nome,hora,valorHora));
			}
			
			System.out.println();
			System.out.println("PAGAMENTOS");
			for(Funcionario func:list) { //tipo funcionario+ new objeto
				System.out.println(func.getNome()+" "+func.pagamento());
			}
		}
		
	}
}