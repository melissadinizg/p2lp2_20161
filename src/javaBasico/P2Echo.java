package javaBasico;
/* Aulas sobre o modulo de Java Basico/Procedural
 * Por: L�via Sampaio Campos
 * Iniciado: 2015.2
 * Observacao: Esse codigo � uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplifica��es.
 */
public class P2Echo {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("ECHO esta ativado!");
			System.exit(1);
		}
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
	}

}
