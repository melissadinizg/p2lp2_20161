package heranca;

public abstract class Funcionario {
	private String nome, cpf;
	private int matricula;
	
	public Funcionario(String nome, String cpf, int matricula){
		mudaNome(nome);
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
	private void mudaNome(String novoNome){
		this.nome = novoNome;//fazer tratamento de erros com exceções, por exemplo
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		mudaNome(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public double calculaPagamento(){return 0;}
	
	@Override
	public String toString() {
		return getNome() + " " + getCpf();
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof Funcionario)){
			return false;
		}
		Funcionario f = (Funcionario) arg0;
		return getCpf().equals(f.getCpf());
	}
}
