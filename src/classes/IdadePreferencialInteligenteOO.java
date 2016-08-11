package classes;
/* Aulas sobre o modulo de Criacao de Classes e Uso de Objetos
 * Por: Lívia Sampaio Campos
 * Iniciado: 06/07/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.util.Scanner;

public class IdadePreferencialInteligenteOO {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Pessoa[] cadastro = new Pessoa[1];
		Pessoa p;
		
		//cadastrei pessoas
		for (int i = 0; i < cadastro.length; i++) {
			p = cadastraPessoa();
			cadastro[i] = p;
		}
		
		//situacao preferencial
		for (int i = 0; i < cadastro.length; i++) {
			System.out.println(cadastro[i]);
			imprimeSituacaoPreferencial(cadastro[i]);
		}
	}

	private static void imprimeSituacaoPreferencial(Pessoa p){
		System.out.println(p.situacaoPreferencial());
	}
	
	private static Pessoa cadastraPessoa() {
		int anoNascimento = input.nextInt();
		input.nextLine();
		String nome = input.nextLine();
		boolean isGravida = input.nextBoolean();
		boolean hasCrianca = input.nextBoolean();
		
		Pessoa umaPessoa = new Pessoa(anoNascimento,isGravida, hasCrianca, nome); 
		
		
		return umaPessoa;
	}

}
