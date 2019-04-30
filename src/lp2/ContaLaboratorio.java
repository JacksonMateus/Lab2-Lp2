package lp2;

/**
 * É responsável por registrar o espaço utilizado de memoria pelo aluno no laboratorio   
 * @author Jackson Mateus
 *
 */
	public class ContaLaboratorio {
	public String nomeLaboratorio;
	public int espaçoOcupado = 0;
	public int cota;
	
	/**
	 * Recebe o nome do Laboratorio e constrói a Conta do aluno no laboratorio,se for instaciado o objeto 
	 * nesse contrutor, é chamado o outro construtor recebendo o nome do laboratorio e um certo valor da cota.
	 * @param nomeLaboratorio
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this(nomeLaboratorio, 2000);
	}
	/**
	 * Recebe o nome do Laboratorio e a cota disponivel constrói o a Conta do aluno no laboratorio
	 * @param nomeLaboratorio
	 * @param cota É o limite de espaço disponivel de memoria
	 */
	
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	/**
	 * Esse método recebe um valor 
	 * de memoria gasta pelo aluno e a acumula na variavél que represena
	 * o espaço usado de memoria pelo aluno
	 * @param mbytes recebe um valor de memoria
	 */
	public void consomeEspaço(int mbytes) {
		espaçoOcupado+=mbytes;
		}
	
	/**
	 * Esse método recebe um valor 
	 * de memoria e acumula diminuindo 
	 * o valor gasto de memoria pelo aluno na variavél que represena
	 * o espaço usado de memoria pelo aluno
	 * @param mbytes recebe um valor de memoria
	 */
	public void liberaEspaco(int mbytes) {
		espaçoOcupado -= mbytes;
		
	}
	/**
	 * Retorna se o aluno atingiu a cota maxima de memoria
	 * @return returna true ou false
	 */
	public boolean atingiuCota() {
		if (espaçoOcupado >= cota) {
			return true; 
			
		}
		else {
			return false;
		}		
		
	}


	/**
	* Retorna uma String que representa a Conta no laboratorio. A representação segue o
	* formato “Nome do laboratorio - Espaço ocupado - Cota”.
	*
	* @return a representação em String da Conta do aluno no laboratorio.
	*/
	public String toString() {
		return nomeLaboratorio +" "+ espaçoOcupado  +"/"+cota;
	}
	

	
	
} 