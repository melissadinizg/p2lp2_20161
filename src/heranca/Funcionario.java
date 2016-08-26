package heranca;

import interfaces.Pagavel;

public abstract class Funcionario implements Pagavel{
	private String cpf;
	private int matricula;
	protected String nome;
	
	public Funcionario(String nome, String cpf, int matricula){
		mudaNome(nome);
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
	public static String lema(){
		return "Chegar sempre cedo!";
	}
	
	private void mudaNome(String novoNome){
		this.nome = novoNome;//fazer tratamento de erros com exceções, por exemplo
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("Funcionario.setNome()");
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
