package javaBasico;
/* Aulas sobre o modulo de Java Basico/Procedural
 * Por: Lívia Sampaio Campos
 * Iniciado: 2015.2
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
//import java.util.Arrays;
import java.util.Scanner;

public class MeuCofrinho {
	public static void main(String[] args) {
		double[] nomesMoedas = {0.10, 0.25, 0.50, 1};
		int[] quantidadesMoedas = new int[nomesMoedas.length];
		if(args.length != 1){
			System.err.println("Chamada correta: MeuCofrinho <tamanho_cofrinho>");
			System.exit(1);
		}
		final int TAMANHO_COFRINHO = Integer.parseInt(args[0]); 
		
		//mostra nomes e quantidadesMoedas inicialmente
		mostraCofrinho(nomesMoedas, quantidadesMoedas);
		
		//adiciona moedas
		double valor;
		Scanner teclado = new Scanner(System.in);
		int contador = 0; 
		while(contador < TAMANHO_COFRINHO) {//Livia: essa solucao deixa o codigo mais limpo :)
			valor = leDouble("Informe o valor da moeda: [0,1-0,25-0,5-1] ", teclado);
			if(adicionaMoeda(valor, nomesMoedas, quantidadesMoedas)){
				contador++;
			}else{
				System.out.println("Moeda invalida!");
			}
		}
		
		//mostra nomes e quantidadesMoedas atualizado
		mostraCofrinho(nomesMoedas, quantidadesMoedas);
		
		//mostra total de dinheiro e de moedas no cofrinho.
		System.out.println("Total de moedas: " + totalMoedas(quantidadesMoedas));
		System.out.println("Total de money: " + totalCofrinho(nomesMoedas, quantidadesMoedas));
	}

	private static double totalCofrinho(double[] nomesMoedas, int[] quantidadeMoedas) {
		double soma = 0;
		for (int i = 0; i < quantidadeMoedas.length; i++) {
			soma += quantidadeMoedas[i] * nomesMoedas[i];
		}
		return soma;
	}

	private static int totalMoedas(int[] cofrinhoQuantidades) {
		int soma = 0;
		for (int i = 0; i < cofrinhoQuantidades.length; i++) {
			soma += cofrinhoQuantidades[i];
		}
		return soma;
	}
	private static boolean adicionaMoeda(double valor, double[] nomesMoedas, int[] quantidadesMoedas) {
		for (int i = 0; i < nomesMoedas.length; i++) {
			if(valor == nomesMoedas[i]){
				quantidadesMoedas[i]++;
				return true;
			}
		}
		return false;
		
		/*int index = Arrays.binarySearch(nomesMoedas, valor); //atencao! O array deve estar ordenado
		if(index >= 0){
			quantidadesMoedas[index]++;
			return true;
		}
		return false;*/
		
	}

	private static double leDouble(String msg, Scanner teclado) {
		System.out.println(msg);
		return teclado.nextDouble();
	}

	private static void mostraCofrinho(double[] nomes, int[] quantidades){
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + " " + quantidades[i]);
		}
	}
}
