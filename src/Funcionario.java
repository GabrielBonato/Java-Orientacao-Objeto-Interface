class Funcionario {
	private String nome;
	protected double salario;
	private int senha;
	// 1 = funcionario, 2 = gerente, 3 = ...
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}


	public double getBonus() {
		return this.salario * 0.2;
	}

	public boolean autentica(int senha) {
		return this.senha == senha;
	}

}
