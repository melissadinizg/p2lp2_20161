package classes;
/* Aulas sobre o modulo de Criacao de Classes e Uso de Objetos
 * Por: Lívia Sampaio Campos
 * Iniciado: 13/07/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */

public class Memoria {
	//atributos
	String frase, data;
	private boolean isFavorito;
	
	public Memoria(String frase, String data)throws Exception{
		checaStringVaziaENula(frase);
		checaStringVaziaENula(data);
		this.frase = frase;
		this.data = data;
		isFavorito = false;
	}
	
	private void checaStringVaziaENula(String s) throws Exception{
		if(s == null || s.trim().equals("")){
			Exception e = new Exception("String nula ou vazia");
			throw e;
		}
	}
	
	public String getFrase(){
		return frase;
	}
	
	public String getData(){
		return data;
	}
	
	public void setFrase(String novaFrase){
		frase = novaFrase;
	}

	public boolean isFavorito() {
		return isFavorito;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void favoritar(){
		isFavorito = true;
	}
	
	@Override
	public String toString(){
		return getData() + " -- " + getFrase() + " -- " + isFavorito();
	}
	
	@Override
	public boolean equals(Object outra){
		if(!(outra instanceof Memoria)){
			return false;
		}
		Memoria aux = (Memoria) outra;
		if(getFrase().equals(aux.getFrase()) && 
				getData().equals(aux.getData())){
			return true;
		}
		return false;
		
	}
	//Nao facam isso em casa! Eh perigoso :)
	public static void main(String[] args) throws Exception{
		Memoria m1 = new Memoria("aa", "aa");
		Memoria m2 = new Memoria("aa", "aa");
		
		System.out.println(m1);
		System.out.println(m2);
		
		m2.favoritar();
		
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println(m1.equals(m2));
	}

}
