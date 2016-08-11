package colecoes;
/* Aulas sobre o modulo de Colecoes em Java
 * Por: Lívia Sampaio Campos
 * Iniciado: 19/07/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */

import java.util.*;
import classes.Pessoa;
public class UsaColecoes {
	public static void main(String[] args) throws Exception{
		//usaList();
		//comparaListas();
		//usaHashSet();
		usaHashMap();
		usaHashMap2();
	}
	
	private static void usaHashMap2() {
		HashMap<String, ArrayList<Pessoa>> cad = new HashMap<>();
		
	}

	private static void usaHashMap(){
		
		HashMap<Pessoa, String> cad = new HashMap<>();
		cad.put(new Pessoa("livia", 1975), "sou java");
		cad.put(new Pessoa("aurora", 2000), "sou javascript");
		cad.put(new Pessoa("branca de neve", 1911), "sou c");
		cad.put(new Pessoa("rapunzel", 1920), "sou python");
		cad.put(new Pessoa("sofia", 2002), "sou #c");
		cad.put(new Pessoa("livia", 1975), "sou java 2"); //observe que será feita a substituicao do valor
		cad.put(new Pessoa("ariel", 1950), "sou java");
		
		Set<Pessoa> chaves = cad.keySet();
		for (Pessoa pessoa : chaves) {
			System.out.println(pessoa + " " + cad.get(pessoa));
		}
		
		//imprimir o mapa inteiro
		System.out.println(cad);
	}
		
	
	private static void usaHashSet(){
		System.out.println("\nUsando conjuntos");
		//povoa conjunto HashSet
		HashSet<Pessoa> cad1 = new HashSet<Pessoa>();
		cad1.add(new Pessoa("ana", 1975));
		cad1.add(new Pessoa("josefa", 1952));
		cad1.add(new Pessoa("zeneide", 1982));
		cad1.add(new Pessoa("ariadne", 2015));
		cad1.add(new Pessoa("ana", 2010));
		cad1.add(new Pessoa("ana", 1975));
		
		//imprime conjunto direto
		Iterator<Pessoa> it = cad1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());		
		}
	}
	

	private static void comparaListas() throws Exception{
		//povoa linked list
			List<Pessoa> cad1 = new LinkedList<Pessoa>();
			for (int i = 0; i < 10000; i++) {
				cad1.add(new Pessoa("ana", 1975));
				cad1.add(new Pessoa("josefa", 1952));
				cad1.add(new Pessoa("zeneide", 1982));
				cad1.add(new Pessoa("ariadne", 2015));
				cad1.add(new Pessoa("ana", 2010));
			}
			
		//povoa arraylist
			List<Pessoa> cad2 = new ArrayList<Pessoa>();
			for (int i = 0; i < 100; i++) {
				cad1.add(new Pessoa("ana", 1975));
				cad1.add(new Pessoa("josefa", 1952));
				cad1.add(new Pessoa("zeneide", 1982));
				cad1.add(new Pessoa("ariadne", 2015));
				cad1.add(new Pessoa("ana", 2010));
			}
			
		//percorre arraylist com iterator - pode fazer para linkedList tambem
			
			Iterator<Pessoa> it = cad1.iterator();
			long inicio = System.currentTimeMillis();
			while (it.hasNext()) {
				it.next();		
			}
			long finale = System.currentTimeMillis();
			System.out.println("tempo lista iterator: " + (finale-inicio));
			Thread.sleep(2000);
		//percorre arraylist com get - pode fazer para linkedList tambem
			inicio = System.currentTimeMillis();
			for(int i=0; i<cad1.size(); i++)
				cad1.get(i);
			finale = System.currentTimeMillis();
			System.out.println("tempo lista get: " + (finale-inicio));
			
	}
	private static void usaList(){
		System.out.println("\nUsando arraylist");
		//povoa lista
		ArrayList<Pessoa> cad1 = new ArrayList<Pessoa>();
		cad1.add(new Pessoa("ana", 1975));
		cad1.add(new Pessoa("josefa", 1952));
		cad1.add(new Pessoa("zeneide", 1982));
		cad1.add(new Pessoa("ariadne", 2015));
		cad1.add(new Pessoa("ana", 2010));
		
		//imprime lista com iterator
		Iterator<Pessoa> it = cad1.iterator();
		System.out.println("Iterator");
		while (it.hasNext()) {
			System.out.println(it.next());		
		}
		
		//imprime lista com for-each
		System.out.println("for-each");
		for(Pessoa p: cad1){
			System.out.println(p);
		}
}
}