package heranca;

public class Empresa {
	public static void main(String[] args) {
		Horista zezinho = new Horista("Zezinho da Disney", "123", 1);
		Horista huguinho = new Horista("Huguinho da Disney", "234", 2);
		
		System.out.println(zezinho.toString());
		zezinho.setHorasTrabalhadas(10);
		zezinho.setPrecoPorHora(10);
		System.out.println(zezinho.calculaPagamento());
		
		Funcionario f = new Funcionario("margarida", "567", 3);
		f.calculaPagamento();
		
	}

}
