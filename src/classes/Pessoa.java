package classes;
/* Aulas sobre o modulo de Criacao de Classes e Uso de Objetos
 * Por: Lívia Sampaio Campos
 * Iniciado: 06/07/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */
import java.time.LocalDate;

public class Pessoa {
	//atributos
	private boolean isGravida;
	private boolean hasCrianca;
	private int anoNascimento;
	private String nome;
	
	//construtor
	public Pessoa(int nascimento, boolean gravida, boolean crianca, String nome){
		anoNascimento = nascimento;
		isGravida = gravida;
		hasCrianca = crianca;
		this.nome = nome;
	}
	
	public Pessoa(String nome, int nascimento){
		this(nascimento, false, false, nome);
	}
	
	public int getAnoNascimento(){
		return anoNascimento;
	}
	
	public String getNome(){
		return nome;
	}
	
	public boolean isGravida() {
		return isGravida;
	}

	public boolean hasCrianca() {
		return hasCrianca;
	}

	public void setNome(String novoNome){
		nome = novoNome;
	}
	
	public int calculaIdade(){
		LocalDate hoje = LocalDate.now(); 
		int anoAtual = hoje.getYear();
		return anoAtual - getAnoNascimento();
	}
	
	//metodos
	public String situacaoPreferencial(){
		if(calculaIdade() >= 60){
			return "PreferencialIdoso";
		}else if(isGravida){
			return "PreferencialGestante";
		}else if(hasCrianca){
			return "PreferencialCriancaNoColo";
		}else{
			return "Voce nao tem direito ao atendimento preferencial";
		}
	}
	
	@Override
	public String toString(){
		return "Nome: " + getNome() + 
				" Idade: " + calculaIdade()+
				" Estah Gravida: " + isGravida() +
				" Tem crianca de colo: " + hasCrianca();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoNascimento;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (anoNascimento != other.anoNascimento)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	/*@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Pessoa)){
			return false;
		}
		Pessoa p = (Pessoa)obj;
		
		return getAnoNascimento() == p.getAnoNascimento() && 
				getNome().equals(p.getNome());
	}*/

}
