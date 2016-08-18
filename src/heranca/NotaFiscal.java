package heranca;

import java.util.ArrayList;

public class NotaFiscal implements Pagavel{
	private String nome;
	private ArrayList<Item> itens;
	
	public NotaFiscal(String nome){
		this.nome = nome;
		itens = new ArrayList<>();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addItem(Item i){
		itens.add(i);
	}

	@Override
	public double calculaPagamento() {
		double total = 0;
		for (Item item : itens) {
			total += item.getPrecoTotal();
		}
		return total;
	}

	@Override
	public String getNome() {
		return nome;
	}

}
