package lp2;

/**
 * É responsável por mostrar a saude fisica
 * e mental do aluno,combinando como está os
 * dois tipos de saude 
 * @author Jackson Matheus
 * 
 */
public class Saude {
	
	/**
	 * Saude mental do aluno,podendo ser boa
	 * ou fraca
	 */
	public String valorSaudeMental;
	
	/**
	* Saude fisica do aluno,podendo ser boa
	 * ou fraca
	 */
	public String valorSaudeFisica;

	/**
	 * Constrói a saude do aluno a partir de um
	 * construtor sem parâmetros que defina e saude mental
	 * e a saude fisica do aluno como boa  
	 */
	public Saude() {
		valorSaudeMental = "boa";
		valorSaudeFisica = "boa";

		
	}
	/**
	 * Define a saude mental do aluno
	 * @param valor recebe a saude mental do aluno,
	 * pode ser boa ou fraca como parametro
	 */
	public void defineSaudeMental(String valor) {
		valorSaudeMental=valor;
		
	}
	/**
	 * Define a saude fisica do aluno
	 * @param valor recebe a saude fisica do aluno,
	 * pode ser boa ou fraca como parametro
	 */
	public void defineSaudeFisica(String valor) {
		valorSaudeFisica=valor;
		
	}
	/**
	 * Juntando a saude fisica e mental do
	 * aluno,retorna se é boa ou se é fraca ou se
	 * está ok a junção dos 2 tipos de saúde 
	 * @return A junção da saude do aluno,podendo
	 * ser boa,fraca ou se está ok 
	 */
	public String getStatusGeral() {
		if (valorSaudeFisica.equals("boa") && valorSaudeMental.equals("boa")) {
			return "boa";
		}
		else if(valorSaudeFisica.equals("boa") && valorSaudeMental.equals("fraca")) {
			return "ok";
		}
		else if(valorSaudeFisica.equals("fraca") && valorSaudeMental.equals("boa")) {
			return "ok"; }
		else {
			return "fraca" ;
		}
	
	}
	

}