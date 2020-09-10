package forDivisao;

public class DividindoLaco {

	public static void main(String[] args) {
		int num;
		System.out.println("Numeros dentre 1000 e 1999 divididos por 11 ");
		for(num=1000;num<1999;num++) {
			
			if((num%11)==5) {
			System.out.printf("\n Com resto igual a 5 %d",num);
			}
		}
	}
}
