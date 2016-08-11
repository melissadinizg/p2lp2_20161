package javaBasico;

/* Aulas sobre o modulo de Java Basico/Procedural
 * Por: Lívia Sampaio Campos
 * Iniciado: 01/07/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.util.*;
/* Aulas sobre o modulo de Java Basico/Procedural
 * Por: Lívia Sampaio Campos
 * Iniciado: 27/06/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
public class RendimentoEscolar {
	private static Scanner input = new Scanner(System.in);

	private static void cadastrarDisciplinas(float[] medias, boolean[] apto, String[] disciplinas) {
		Random geradorRandomico = new Random();
		for (int i = 0; i < disciplinas.length; i++) {// para 3 disciplinas
			apto[i] = geradorRandomico.nextBoolean();

			medias[i] = leFloatPositivo("\n Digite uma media (0-10): ");

			System.out.print("Nome da disciplina: ");
			disciplinas[i] = input.nextLine();
		}
	}

	public static void main(String[] args) {
		// usando argumentos da linha de entrada
		int qtde = Integer.parseInt(args[0]);
		float[] medias = new float[qtde];
		String[] disciplinas = new String[qtde];
		boolean[] apto = new boolean[qtde];

		// cadastrar disciplinas e medias
		cadastrarDisciplinas(medias, apto, disciplinas);

		// imprimir o boletim
		for (int i = 0; i < disciplinas.length; i++) {
			if (medias[i] >= 7.0) {
				System.out.printf("Disciplina: %s Media: %.1f  APROVADO POR MEDIA! \n", disciplinas[i], medias[i]);
			} else if (medias[i] >= 5.0) {
				System.out.printf("Disciplina: %s Media: %.1f APROVADO! \n", disciplinas[i], medias[i]);
			} else if (medias[i] >= 4.0 && apto[i]) {
				System.out.printf("Disciplina: %s Media: %.1f RER!", disciplinas[i], medias[i]);
			} else {
				System.out.printf("Disciplina: %s Media: %.1f REPROVADO! \n", disciplinas[i], medias[i]);
			}
		}
		input.close();
	}

	private static float leFloatPositivo(String msg) {
		float valor;
		do {
			System.out.print(msg);
			valor = input.nextFloat();
			input.nextLine();
		} while (valor < 0 || valor > 10);
		return valor;
	}
}
