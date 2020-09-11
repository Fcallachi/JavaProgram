package vetor6Posicoes;

public class SomaVetor {

	public static void main(String[] args) {
		
		int aux=0,soma;
		int vet[]= {1,0,5,-2,-5,7};
		
		soma=vet[0]+vet[2]+vet[5];
		System.out.println("A soma dos numeros dentro do vetor: "+soma);
		vet[4]=100;
		System.out.println(vet[0]+","+vet[1]+","+vet[2]+","
		+vet[3]+","+vet[4]+","+vet[5]);
		

	}

}
