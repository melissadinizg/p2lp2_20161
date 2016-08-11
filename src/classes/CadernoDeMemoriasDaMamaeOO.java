package classes;
/* Aulas sobre o modulo de Criacao de Classes e Uso de Objetos
 * Por: Lívia Sampaio Campos
 * Iniciado: 13/07/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */

import classes.Memoria;
import utils.EntradaDeDados;

public class CadernoDeMemoriasDaMamaeOO {
	
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
		Memoria[] memorias = new Memoria[tamCaderno];
		int indiceControle = 0;
		int op;
		System.out.println("Bem vindo a memorias da mamae - uma frase por dia!");
		do{
			imprimeMenu();
			op = EntradaDeDados.leIntPositivo("Opcao: ");
			switch(op){
			case REGISTRAR:
				try{
					indiceControle = registrar(memorias, indiceControle);
				}catch(Exception ex){
					System.err.println(ex.getMessage());
				}
				break;
			case LEMBRAR:
				lembrar(memorias);
				break;
			case MAIS_RECENTE:
				imprimeMemoriaMaisRecente(memorias, indiceControle-1);
				break;
			case MAIS_ANTIGO:
				imprimeMemoriaMaisAntiga(memorias);
				break;
			case FAVORITAR:
				favoritar(memorias);
				break;
			case SAIR:
				System.out.println("Finalizando programa...");
				break;
			default:
				System.out.println("Opcao invalida!");
			}

		}while(op != SAIR);
	}
	
	private static void favoritar(Memoria[] memorias) {
		int idMemoria = EntradaDeDados.leIntPositivo("Qual a memoria que gostaria de favoritar? (1, 2, ...)");
		Memoria aux = memorias[idMemoria-1];
		aux.favoritar();
	}

	private static void lembrar(Memoria[] memorias) {
		int idMemoria = EntradaDeDados.leIntPositivo("Qual a memoria que gostaria de lembrar? (1, 2, ...)");
		imprimeMemoria(memorias, idMemoria-1);	
	}

	private static int registrar(Memoria[] memorias, int indiceControle) throws Exception{
		String memoria = EntradaDeDados.leString("Qual a memoria para registrar? ");
		String data = EntradaDeDados.leString("Qual a data dessa memoria? ");
		memorias[indiceControle] = new Memoria(memoria, data);
		return indiceControle+1;
	}

	private static void imprimeMenu() {
		System.out.println("\n1 - Registrar novas memorias");
		System.out.println("2 - Lembrar de uma memoria especifica");
		System.out.println("3 - Memoria mais recente");
		System.out.println("4 - Memoria mais antiga");
		System.out.println("5 - Favoritar");
		System.out.println("6 - Sair \n");
		
	}

	private static void imprimeMemoriaMaisAntiga(Memoria[] memorias){
		System.out.println("Memoria mais antiga...");
		imprimeMemoria(memorias, 0);
	}
	
	private static void imprimeMemoriaMaisRecente(Memoria[] memorias, int indice){
		System.out.println("Memoria mais recente...");
		imprimeMemoria(memorias, indice);
	}
	
	private static void imprimeMemoria(Memoria[] memorias, int indice){
		System.out.println(memorias[indice]);
	}
	
}
