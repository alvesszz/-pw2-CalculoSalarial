
public class Gerente extends Funcionario {

	private double gratificacao;
	
	public String listarFuncionario () {
		 
		return "\n nome: " + nome + "\n cpf: " + cpf + "\n Salario Base: " + salarioBase + "\n Salario Final: " + salarioFinal + "\n Valor Bonificacao: " + valorBonificacao;
		
	}
	public void calcularSalarioFinal (double gratificacao) {
		
		this.gratificacao = gratificacao;
		salarioFinal = gratificacao + salarioBase + valorBonificacao;
		
	}
	public String apresentarSalario () {
		return "\n nome: " + nome + "\n salarioBase: " + salarioBase + "\n Bonificacao: " + valorBonificacao + "\n Gratificacao: " + gratificacao + "\n Salario Final: " + salarioFinal; 
	}
	public void calcularSalarioFinal() {
		
		
	}
}
