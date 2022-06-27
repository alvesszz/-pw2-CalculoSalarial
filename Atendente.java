
public class Atendente extends Funcionario {

	private double adicionalNoturno;
	
	public String apresentarSalario () {
		return "\n nome: " + nome + "\n cpf: " + cpf + "\n Salario Base: " + salarioBase + "\n Bonificacao: " + valorBonificacao;
		
	}
	public void calcularSalarioFinal (double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
		salarioFinal = adicionalNoturno + salarioBase + valorBonificacao;
		
	}
	public String listarFuncionario () {
		return "\n nome: " + nome + "\n cpf: " + cpf + "\n Salario Base: " + salarioBase + "\n Salario Final: " + salarioFinal + "\n Valor Bonificacao: " + valorBonificacao;
	}
	public void calcularSalarioFinal() {
		
	}
	
}
