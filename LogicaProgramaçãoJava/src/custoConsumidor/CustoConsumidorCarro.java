package custoConsumidor;

public class CustoConsumidorCarro {

	public static void main(String[] args) {
		float Porcent2 =3f,CustoFabrica,CustoConsumidor,Porcent1=28f;
		
		System.out.println("O custo ao consumidor de um carro novo é de:");
		CustoFabrica=(Porcent1+Porcent2);
		CustoConsumidor=(CustoFabrica+Porcent1+Porcent2);
		
		System.out.println(CustoConsumidor+"%");

	}

}
