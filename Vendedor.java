
public class Vendedor extends Funcionario {
	
	private double valorComissao;
	
	public String apresentarSalario () {
		return "\n nome: " + nome + "\n salario Base: " + salarioBase + "\n Bonificacao: "+ valorBonificacao + "\n Comissao: " + valorComissao + "\n salario final: " + salarioFinal;
	}

	public void calcularSalarioFinal (double valorComissao) {
		this.valorComissao = valorComissao;
		salarioFinal = valorComissao + salarioBase + valorBonificacao; 
	}
	
	public String listarFuncionario () {
		
		return "\n nome: " + nome + "\n cpf: " + cpf + "\n Salario Base: " + salarioBase + "\n Salario Final: " + salarioFinal + "\n Valor Bonificacao: " + valorBonificacao;
	
	}

	
	public void calcularSalarioFinal() {
	}
	
}
