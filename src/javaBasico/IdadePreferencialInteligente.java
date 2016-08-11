package javaBasico;
/* Comecando com objetos: como transformar esse codigo procedural
 * em um codigo Orientado a Objetos?
 * 
 * Por: Lívia Sampaio Campos
 * Iniciado: 06/07/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.time.LocalDate;
import java.util.Scanner;

public class IdadePreferencialInteligente {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int nascimentoLivia = leIntPositivo("Qual o seu ano de nascimento?");
		int idade = calculaIdade(nascimentoLivia);
		boolean isGravida = leBoolean("Voce esta gravida? (true/false)");
		boolean hasCrianca = leBoolean("Voce esta com crianca de colo? (true/false)");
		
		imprimeSituacaoPreferencial(idade, isGravida, hasCrianca);
	}
	
	private static void imprimeSituacaoPreferencial(int idade, boolean isGravida, boolean hasCrianca) {
		System.out.println("Idade: " + idade);
		if(idade >= 60){
			System.out.println("PreferencialIdoso");
		}else if(isGravida){
			System.out.println("PreferencialGestante");
		}else if(hasCrianca){
			System.out.println("PreferencialCriancaNoColo");
		}else{
			System.out.println("Voce nao tem direito ao atendimento preferencial");
		}
	}

	private static int calculaIdade(int nascimentoLivia){
		LocalDate hoje = LocalDate.now(); 
		int anoAtual = hoje.getYear();
		return anoAtual - nascimentoLivia;
	}
	
	private static boolean leBoolean(String msg){
		System.out.print(msg);
		return input.nextBoolean();
	}
	
	private static int leIntPositivo(String msg){
		int valor;
		do{
			System.out.print(msg);
			valor = input.nextInt();
			input.nextLine();
		}while(valor < 0);
		return valor;
	}
}
