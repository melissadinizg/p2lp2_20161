package exercicios.prova2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.internal.runners.model.EachTestNotifier;

public class EstoqueDePratos {

	private List<PratoPersonalizado> pratos;
	
	public EstoqueDePratos(){
		pratos = new ArrayList<>();
	}
	
	public Circular criaPratoCircular(double preco, Personalizacao personalizacao, double raio){
		return new Circular(preco, personalizacao, raio);
	}
	
	public Retangular criaPratoRetangular(double preco, Personalizacao personalizacao, double base, double altura){
		return new Retangular(preco, personalizacao, base, altura);
	}
	
	public Triangular criaPratoTriangular(double preco, Personalizacao personalizacao, double base, double altura){
		return new Triangular(preco, personalizacao, base, altura);
	}
	
	public boolean adicionaPrato(PratoPersonalizado prato){
		return pratos.add(prato);
	}
	
	public boolean removePrato(PratoPersonalizado prato){
		return pratos.remove(prato);
	}
	
	public int qtdPratos(){
		return pratos.size();
	}
	
	public boolean contemPrato(PratoPersonalizado prato){
		return pratos.contains(prato);
	}
	
	public PratoPersonalizado pesquisaPorPersonalizacao(Personalizacao personalizacao){
		for (PratoPersonalizado prato : pratos) {
			if(prato.getPersonalizacao() == personalizacao){
				return prato;
			}
		}
		return null; //o ideal aqui era lançar a exceção para evitar retornar null 
		//e poder gerar NullPointerException em algum momento
	}
	
	public double rendaTotalEstoque(){
		double total = 0;
		for (PratoPersonalizado prato : pratos) {
			total += prato.precoTotal();
		}
		return total;
	}
	
	public List<PratoPersonalizado> getPratosOrdenados(){
		Collections.sort(pratos);
		return pratos;
	}
}
