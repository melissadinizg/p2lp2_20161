package heranca;

public class Assalariado extends Funcionario{
	private int qtdDependentes;
	private double salarioBase;
	public static final double ADICIONAL_POR_DEPENDENTE = 15.0;
	
	public Assalariado(String nome, String cpf, int matricula, double salarioBase){
		super(nome, cpf, matricula);
		this.salarioBase = salarioBase;
		this.qtdDependentes = 0;
	}
	
	public int getQtdDependentes() {
		return qtdDependentes;
	}

	public void setQtdDependentes(int qtdDependentes) {
		this.qtdDependentes = qtdDependentes;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double calculaPagamento() {
		return salarioBase + (qtdDependentes*ADICIONAL_POR_DEPENDENTE);
	}
	
	@Override
	public String toString() {
		return "ASSALARIADO" + super.toString();
	}
}
