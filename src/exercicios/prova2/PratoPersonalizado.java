package exercicios.prova2;

import java.io.Serializable;

public abstract class PratoPersonalizado implements Comparable<PratoPersonalizado>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double preco;
	private Personalizacao personalizacao;
	
	public PratoPersonalizado(double preco, Personalizacao personalizacao){
		this.preco = preco;
		this.personalizacao = personalizacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Personalizacao getPersonalizacao() {
		return personalizacao;
	}

	public void setPersonalizacao(Personalizacao personalizacao) {
		this.personalizacao = personalizacao;
	}

	public abstract double precoTotal();
	
	public abstract double areaTotal();
	
	@Override
	public String toString() {
		return "Prato com " + getPersonalizacao() + " custa R$ " + getPreco() + ".";
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof PratoPersonalizado)){
			return false;
		}
		PratoPersonalizado outro = (PratoPersonalizado) arg0;
		return getPersonalizacao() == outro.getPersonalizacao();
	}
	
	@Override
	public int compareTo(PratoPersonalizado outro) {
		if(precoTotal() > outro.precoTotal()){
			return 1;
		}
		if(precoTotal() < outro.precoTotal()){
			return -1;
		}
		return 0;//sao iguais
		//outra forma: return (int)((precoTotal() - outro.precoTotal()) * 100);
	}
	

}
