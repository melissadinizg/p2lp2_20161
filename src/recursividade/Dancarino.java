package recursividade;

public class Dancarino {
	private String nome;
	private Dancarino proximo;
	
	public Dancarino(String nome){
		this.nome = nome;
		proximo = null;
	}
	
	public void adiciona(Dancarino novo){
		if(this.proximo == null){
			proximo = novo;
			return;
		}
		this.getProximo().adiciona(novo);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Dancarino getProximo() {
		return proximo;
	}
	
	public void setProximo(Dancarino proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		if(proximo == null){
			return this.getNome();
		}
		return this.getNome() + " " + proximo.toString();
	}
}
