package exercicios.prova2;

public class Triangular extends PratoPersonalizado{
	private double base, altura;
	
	public Triangular(double preco, Personalizacao personalizacao, double base, double altura) {
		super(preco, personalizacao);
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double precoTotal() {
		return super.getPreco() + (0.01 * areaTotal());
	}
	
	@Override
	public double areaTotal() {
		return (getBase() * getAltura())/2;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Formato " + getClass().getSimpleName()+".";
	}
	

}
