package animalPOO;

public class ApresentacaoAnimais {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("caramelo",10);
		Cavalo horse =new Cavalo("Alazao",20);
		Preguica laziness= new Preguica("Fernando",20);

		System.out.println("Cachorro emitindo som");
		dog.emitirSom();
		System.out.println("---------------------");
		System.out.println("Cavalo emitindo som");
		horse.emitirSom();
		System.out.println("---------------------");
		System.out.println("Preguiça emitindo som");
		laziness.emitirSom();
	}

}
