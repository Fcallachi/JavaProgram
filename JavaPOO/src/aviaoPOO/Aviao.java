package aviaoPOO;

public class Aviao {

	/*
	 * Crie uma classe avião e apresente os atributos e
	 *  métodos referentes esta classe, em seguida crie 
	 *  um objeto avião, defina as instancias deste objeto e
	 *   apresente as informações deste objeto no console	
	 */
	//atributos
	public boolean turbina;
	public boolean bombaCombustivel;
	public boolean painelControle;
	public boolean tremDePouso;
	public boolean portasFechadas;
	public boolean passageiros;
	
	//metodos
	public void status() {
		System.out.println("Turbinas ligadas:"+turbina);
		System.out.println("Combustivel cheio:"+bombaCombustivel);
		System.out.println("Painel de controle ok:"+painelControle);
		System.out.println("Trem de pouso ok:"+tremDePouso);
		System.out.println("Portas fechadas:"+portasFechadas);
		System.out.println("Passageiros:"+passageiros);
		
		System.out.println("------------------------");
	}
	public void permissao() {
		if (turbina==true && bombaCombustivel==true && painelControle==true &&tremDePouso==true&&
				portasFechadas==true && passageiros==true) {
			System.out.println("Decolagem altorizada");
		}else {
			System.out.println("Decolagem negada. Verifique o avião e tente novamente.");
		}
	}
	
	
	//metodos especiais	
	public boolean isTurbina() {
		return turbina;
	}
	public void setTurbina(boolean turbina) {
		this.turbina = turbina;
	}
	public boolean isBombaCombustivel() {
		return bombaCombustivel;
	}
	public void setBombaCombustivel(boolean bombaCombustivel) {
		this.bombaCombustivel = bombaCombustivel;
	}
	public boolean isPainelControle() {
		return painelControle;
	}
	public void setPainelControle(boolean painelControle) {
		this.painelControle = painelControle;
	}
	public boolean isTremDePouso() {
		return tremDePouso;
	}
	public void setTremDePouso(boolean tremDePouso) {
		this.tremDePouso = tremDePouso;
	}
	public boolean isPortasFechadas() {
		return portasFechadas;
	}
	public void setPortasFechadas(boolean portasFechadas) {
		this.portasFechadas = portasFechadas;
	}
	public boolean isPassageiros() {
		return passageiros;
	}
	public void setPassageiros(boolean passageiros) {
		this.passageiros = passageiros;
	}
	
	
	
	
}
