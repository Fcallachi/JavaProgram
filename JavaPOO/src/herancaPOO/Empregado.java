package herancaPOO;

public class Empregado extends Pessoa {
	/*
	 *  um método calcularSalario. 
	 *  Escreva um programa de teste adequado para a classe Empregado. 
	 */
	
	//atributos
	private int codigoSetor;
	private double salarioBase;
	private double impostos;
	
	//metodos
	public void calcularSalario() {
		System.out.println("----------------------");
		System.out.println("Calculo do salário.");
		System.out.println(salarioBase-(salarioBase*(impostos/100)));
	}
	
	
	public Empregado(String nome, int codigoSetor, double salarioBase,double impostos) {
		super(nome);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.impostos = impostos;
	}


	//metodos especiais get and set
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(int impostos) {
		this.impostos = impostos;
	}
	
	
	
}
