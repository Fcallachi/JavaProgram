package herancaPOO;

public class Fornecedor extends Pessoa{

		// TODO Auto-generated constructor stub
	

/*
  *  
  *  
  *  

  */
	
	//atributos
	private double valorCredito;//(correspondente ao crédito máximo atribuído ao fornecedor)
	private double valorDivida;//(montante da dívida para com o fornecedor)
	
	
	//metodos
	public void obterSaldo() {
		System.out.println("---------------------------------");
		System.out.println("FORNECEDOR ");
		System.out.println("VAlor de credito menos valor da divida ");
		System.out.println(valorCredito-valorDivida);
	}

	
	
	public Fornecedor(String nome, double valorCredito, double valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}



	//medotos especiais get and set
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
}
