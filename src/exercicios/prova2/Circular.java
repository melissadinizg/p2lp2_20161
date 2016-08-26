package exercicios.prova2;

public class Circular extends PratoPersonalizado{

	private double raio;
	
	public Circular(double preco, Personalizacao personalizacao, double raio) {
		super(preco, personalizacao);
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double precoTotal() {
		return super.getPreco() + (0.01 * areaTotal());
	}
	
	@Override
	public double areaTotal() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Formato " + getClass().getSimpleName()+".";
	}

}
