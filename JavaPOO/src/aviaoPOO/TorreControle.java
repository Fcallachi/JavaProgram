package aviaoPOO;
import aviaoPOO.Aviao;

public class TorreControle {
	public static void main(String[] args) {
		
		Aviao aviao1=new Aviao();
		Aviao aviao2=new Aviao();
		
		aviao1.turbina=true;
		aviao1.bombaCombustivel=true;
		aviao1.painelControle=true;
		aviao1.tremDePouso=true;
		aviao1.portasFechadas=true;
		aviao1.passageiros=true;
		
		aviao1.status();
		aviao1.permissao();
		
		aviao2.turbina=true;
		aviao2.bombaCombustivel=false;
		aviao2.painelControle=true;
		aviao2.tremDePouso=true;
		aviao2.portasFechadas=true;
		aviao2.passageiros=true;
		
		aviao2.status();
		aviao2.permissao();
		
		
	}
}
