package recursividade;

public class CongaLine {
	Dancarino primeiroDancarino;
	
	public void adicionaDancarino(String nome){
		if(primeiroDancarino == null){
			primeiroDancarino = new Dancarino(nome);
		}else{
			Dancarino novo = new Dancarino(nome);
			primeiroDancarino.adiciona(novo);
		}
	}
	
	@Override
	public String toString() {
		return primeiroDancarino.toString();
	}
	
	public static void main(String[] args) {
		CongaLine danca = new CongaLine();
		danca.adicionaDancarino("Huguinho");
		danca.adicionaDancarino("Zezinho");
		danca.adicionaDancarino("Luizinho");
		danca.adicionaDancarino("Margarina");
		danca.adicionaDancarino("Minnie");
		System.out.println(danca);
	}

}
