
public abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salarioBase;
	protected double salarioFinal;
	protected double valorBonificacao;
	
	public void calcularBonificacao () {
	
		valorBonificacao = salarioFinal * 0.05;
		
	}
	
	public void cadastrarFuncionario(String nome, String cpf, double salarioBase ) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	     salarioFinal = 0;
	     valorBonificacao = 0; 
	}
	public abstract String listarFuncionario ();
	public abstract void calcularSalarioFinal ();
	public abstract String apresentarSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	public double getValorBonificacao() {
		return valorBonificacao;
	}

	public void setValorBonificacao(double valorBonificacao) {
		this.valorBonificacao = valorBonificacao;
	}
}
