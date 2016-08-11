package javaBasico;
/* Comecando com objetos: como transformar esse codigo procedural
 * em um codigo Orientado a Objetos?
 * 
 * Por: Lívia Sampaio Campos
 * Iniciado: 13/07/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.util.Scanner;

public class CadernoDeMemoriasDaMamae {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		if(args.length != 1){
			System.out.println("Uso correto: CadernoDeMemoriasDaMamae <tam_do_caderno>");
			System.exit(1);
		}
		
		final int REGISTRAR = 1;
		final int LEMBRAR = 2;
		final int MAIS_RECENTE = 3;
		final int MAIS_ANTIGO = 4;
		final int FAVORITAR = 5;
		final int SAIR = 6;
		
		// NAO ESTAMOS FAZENDO NENHUM TIPO DE TRATAMENTO DE ERROS AO USAR OS ARRAYS!
		int tamCaderno = Integer.parseInt(args[0]);
		String[] frases = new String[tamCaderno];
		String[] datas = new String[tamCaderno];
		boolean[] favoritos = new boolean[tamCaderno];
		int indiceControle = 0;
		int op;
		System.out.println("Bem vindo a memorias da mamae - uma frase por dia!");
		do{
			imprimeMenu();
			op = leIntPositivo("Opcao: ");
			switch(op){
			case REGISTRAR:
				indiceControle = registrar(datas, frases, indiceControle);
				break;
			case LEMBRAR:
				lembrar(datas, frases, favoritos);
				break;
			case MAIS_RECENTE:
				imprimeMemoriaMaisRecente(datas, frases, favoritos, indiceControle-1);
				break;
			case MAIS_ANTIGO:
				imprimeMemoriaMaisAntiga(datas, frases, favoritos);
				break;
			case FAVORITAR:
				favoritar(favoritos);
				break;
			case SAIR:
				System.out.println("Finalizando programa...");
				break;
			default:
				System.out.println("Opcao invalida!");
			}

		}while(op != SAIR);
	}
	
	private static void favoritar(boolean[] favoritos) {
		int idMemoria = leIntPositivo("Qual a memoria que gostaria de favoritar? (1, 2, ...)");
		favoritos[idMemoria-1] = true;
	}

	private static void lembrar(String[] datas, String[] frases, boolean[] favoritos) {
		int idMemoria = leIntPositivo("Qual a memoria que gostaria de lembrar? (1, 2, ...)");
		imprimeMemoria(datas, frases, favoritos, idMemoria-1);	
	}

	private static int registrar(String[] datas, String[] frases, int indiceControle) {
		String memoria = leString("Qual a memoria para registrar? ");
		String data = leString("Qual a data dessa memoria? ");
		datas[indiceControle] = data;
		frases[indiceControle] = memoria;
		return indiceControle+1;
	}

	private static String leString(String msg) {
		System.out.println(msg);
		return input.nextLine();
	}

	private static void imprimeMenu() {
		System.out.println("\n1 - Registrar novas memorias");
		System.out.println("2 - Lembrar de uma memoria especifica");
		System.out.println("3 - Memoria mais recente");
		System.out.println("4 - Memoria mais antiga");
		System.out.println("5 - Avaliar");
		System.out.println("6 - Sair \n");
		
	}

	private static void imprimeMemoriaMaisAntiga(String[] datas, String[] frases, boolean[] favoritos){
		System.out.println("Memoria mais antiga...");
		imprimeMemoria(datas, frases, favoritos, 0);
	}
	
	private static void imprimeMemoriaMaisRecente(String[] datas, String[] frases, boolean[] favoritos, int indice){
		System.out.println("Memoria mais recente...");
		imprimeMemoria(datas, frases, favoritos, indice);
	}
	
	private static void imprimeMemoria(String[] datas, String[] frases, boolean[] favoritos, int indice){
		System.out.println(datas[indice] + " -- " + frases[indice] + " -- " + favoritos[indice]);
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
