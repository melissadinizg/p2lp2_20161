package recursividade;

public class Desafio {
	public static void main(String[] args) {
		desafio(5);
	}
	
	private static void desafio(int n){
		if (n <= 0) return;
		System.out.println(n);
		desafio(n-2);
		desafio(n-3);
		System.out.println(n);

	}

}
