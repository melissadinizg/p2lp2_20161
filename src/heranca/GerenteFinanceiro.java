package heranca;

import java.util.ArrayList;

public class GerenteFinanceiro {
	private ArrayList<Pagavel> contas = new ArrayList<>();
	
	public void cadastraConta(Pagavel f){
		contas.add(f);
	}
	
	public double calculaGastoTotal(){
		
		double total = 0;
		
		for (Pagavel conta : contas) {
			total += conta.calculaPagamento();
		}
		
		return total;
	}
	
	public void geraFolhaPagamento(){
		for (Pagavel conta : contas) {
			//getNome() chamada polimorfica
			//calculaPagamento chamada polimorfica
			System.out.println(conta.getNome() + " " + conta.calculaPagamento());
		}
	}
	
	public static void main(String[] args) {
		GerenteFinanceiro p2t1sa = new GerenteFinanceiro();
		Horista zezinho = new Horista("Zezinho da Disney", "123", 1);
		Assalariado huguinho = new Assalariado("Huguinho da Disney", "234", 2, 880);
		zezinho.setHorasTrabalhadas(10);
		zezinho.setPrecoPorHora(10);
		huguinho.setQtdDependentes(2);
		p2t1sa.cadastraConta(zezinho);
		p2t1sa.cadastraConta(huguinho);
		NotaFiscal f1 = new NotaFiscal("Limpeza");
		f1.addItem(new Item("desinfetante", 1.99, 3));
		f1.addItem(new Item("agua sanitaria", 2.99, 5));
		
		p2t1sa.cadastraConta(f1);
		System.out.println("Gasto total: " + p2t1sa.calculaGastoTotal());
		
		//--------------
		System.out.println(zezinho.lema());
		System.out.println(huguinho.lema());
		p2t1sa.geraFolhaPagamento();
		
	}

}
