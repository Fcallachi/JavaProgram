package pesquisaEstatistica;

import java.util.Scanner;

public class WhilePesquisaPessoas {

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		int aux,idade,sexo,opcao;
		int PCalma=0;//pessoaCalma
		int MulNerv=0;//mulherNervosa
		int HomAgress=0;//homemAgressivo
		int PNervo40=0;//pessoaCalma>40
		int PCalm18=0;//pessoaCalma<18
		final int TAMANHO=3;
		for(aux=0;aux<TAMANHO;aux++) {
		while(aux<TAMANHO) {
		System.out.println("vamos começar uma perquisa.");		
		System.out.print("Digite sua idade:");
		idade=tec.nextInt();
		System.out.print("Digite sua sexo: Maculino[1] | Feminino[2] | Outro[3]");
		sexo=tec.nextInt();
		System.out.println("Digite uma opção que se encaixe com você: ");
		System.out.print("Calme[1] | Nervose[2] | Agressive [3]");
		opcao=tec.nextInt();
		System.out.println("-------------------------------------------");
		
		if(opcao==1) {
			PCalma++;
		}
		if(opcao==2 && sexo==2) {
			MulNerv++;
		}
		if(sexo==1 && opcao==3) {
			HomAgress++;
		}
		if(idade>40 && opcao==2) {
			PNervo40++;
		}
		if(idade<18 && opcao==1) {
			PCalm18++;
		}
	  }
	}
		System.out.print("\n Pessoas calmas ->"+PCalma);
		System.out.print("\n Mulheres nervosas ->"+MulNerv);
		System.out.print("\n Homens agressivos ->"+HomAgress);
		System.out.print("\n Pessoas nervosas com mais de 40 anos ->"+PNervo40);
		System.out.print("\n Pessoas calmas com menos de 18 anos ->"+PCalm18);
	}

}
