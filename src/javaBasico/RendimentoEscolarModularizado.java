package javaBasico;
/* Aulas sobre o modulo de Java Basico/Procedural
 * Por: Lívia Sampaio Campos
 * Iniciado: 2015.2
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.util.*;
public class RendimentoEscolarModularizado {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		double[] media;
		String[] disciplinas;
		
		//cadastra disciplinas e medias
		int qtd = leInteiroPositivo("Quantas disciplinas no boletim? ");
		media = new double[qtd];
		disciplinas = new String[qtd]; 
		
		for (int i = 0; i < disciplinas.length; i++) {
			disciplinas[i] = leString("Nome da disciplina"+(i+1)+": ");
			media[i] = leDoublePositivo("Informe a media"+(i+1)+": ");
		}
		
		//imprime boletim
		imprimeBoletim(disciplinas, media);
		
		teclado.close();
	}

	private static String leString(String msg) {
		System.out.print(msg);
		return teclado.nextLine();
	}

	private static double leDoublePositivo(String msg){
		System.out.print(msg);
		double nota = teclado.nextDouble();
		while(nota < 0){
			System.out.println("Nota nao pode ser negativa!");
			System.out.print(msg);
			nota = teclado.nextDouble();
		}
		teclado.nextLine();//limpa o buffer
		return nota;
	}
	
	private static int leInteiroPositivo(String msg){
		System.out.print(msg);
		int nota = teclado.nextInt();
		while(nota < 0){
			System.out.println("Nota nao pode ser negativa!");
			System.out.print(msg);
			nota = teclado.nextInt();
		}
		teclado.nextLine();//limpa o buffer
		return nota;
	}
	private static void imprimeBoletim(String[] disciplinas, double[] media){
		System.out.println("BOLETIM ESCOLAR");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println(disciplinas[i] + "--" + media[i] + "--" + getSituacaoDaDisciplina(media[i]));
		}
		
	}
	
	private static String getSituacaoDaDisciplina(double media){
		if(media >= 7.0){
			return "APROVADO POR MEDIA";
		}else if(media >= 5.0){
			return "APROVADO";
		}else if(media >= 4.0 && verificaAptoRer()){
			return "RER";
		}else{
			return "REPROVADO";
		}
	}
	
	private static boolean verificaAptoRer(){
		System.out.println("Voce esta apto para o rer? (true-false)");
		return teclado.nextBoolean();
	}

}
