package lp2;

/**
 * É responsavél por registrar os gastos do aluno em uma cantina
 * @author Jackson Matheus
 *
 */
public class ContaCantina {
	/**
	 * Quantidade de itens consumidos pelo aluno
	 */
	public int qtdItens;
	/**
	 * Valor gasto com lanches pelo aluno 
	 */
	public int valorCentavos;
	public String NomeDaCantina;
	/**
	 * Divida acumlada na cantina
	 */
	public int divida;
	/**
	 * Gastos totais de lanches pelo aluno
	 */
	public int gastos;
	/**
	*Constrói a conta na cantina a partir do nome do
	*nome do estabelimento
	*/
	public ContaCantina(String nomeDaCantina) {
		this.NomeDaCantina = nomeDaCantina;
	}
	/**
	 * Atualiza a quantidade de itens comprados,
	 * a divida do aluno com a cantina e os gastos do
	 * aluno na cantina
	 * @param qtdItens recebe a quantidade de intes comprados pelo aluno
	 * @param valorCentavos valor gasto pelo aluno na cantina
	 */
	public void cadastraLanche(int qtdItens,int valorCentavos) {
		this.qtdItens+=qtdItens;
		divida+=valorCentavos;
		gastos+=valorCentavos;
		}
	/**
	 * Valor pago pelo aluno a cantina
	 * @param valorCentavos recebe o valor que o aluno pagou a cantina
	 * 
	 */
	public void pagaConta(int valorCentavos) {
		divida-=valorCentavos;
	}
	/**
	 * mostra o quanto o aluno falta pagar para quitar a divida
	 * @return retorna quanto o aluno falta pagar para zerar a divida 
	 */
	public int getFaltaPagar() {
		return divida;
	}

	/**
	 * Retorna a String que representa informações dos 
	 * gastos e compras do aluno na cantina
	 * formato "Nome da cantina - Quantidade de itens - Gastos do aluno" 
	 */
	public String toString() {
		return NomeDaCantina + " " + qtdItens + " "+ gastos;
	}
	
}
