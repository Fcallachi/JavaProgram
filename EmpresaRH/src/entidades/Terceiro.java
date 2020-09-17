package entidades;
public class Terceiro  extends Funcionario
{
	private double horasAdicionais;
	
	public Terceiro() {
		
	}
	
	public Terceiro(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}
	public double getHorasAdicionais() {
		return horasAdicionais;
	}
	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	@Override  // mudança apenas para esta situação - puxadinho do metodo
	public double pagamento()
	{
		
		return super.pagamento() + (this.horasAdicionais * super.getValorPorHora());
		
		//return (this.horasTrabalhadas*this.valorPorHora) + (horasAdicionais*valorPorHora)
	}
	public double pagamento(int horasTrabalhadas, double valorPorHora)
	{
		double recebimento;
		recebimento = (horasTrabalhadas * valorPorHora) + (this.getHorasAdicionais()*valorPorHora);
		
		super.setValorPorHora(valorPorHora);
		super.setHorasTrabalhadas(horasTrabalhadas);
		
		return recebimento;
	}
	
	
}