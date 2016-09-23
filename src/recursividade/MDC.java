package recursividade;

public class MDC {
	public static void main(String[] args) {
		System.out.println("MDC Iterativo: " + mdcIterativo(100, 24));
		System.out.println("MDC Recursivo: " + mdcRecursivo(100, 24));

	}
	
	private static int mdcRecursivo(int m, int n) {
		int r = m%n;
		if(r == 0){
			return n;
		}
		return mdcRecursivo(n, r);
	}

	private static int mdcIterativo(int m, int n){
		int r;
		do{
			r = m%n;
			m = n;
			n = r;
		}while(r != 0);
		return m;
	}

}
