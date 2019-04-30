package lp2;

/**
 * É responsável por registrar informações de um aluno 
 * em uma determinada disciplina
 * @author Jackson Mateus
 *
 */

public class Disciplina {
	/**
	 * Nome da disciplina que o aluno esta pagando
	 */
	public String nomeDisciplina;
	/**
	 * Horas que o aluno cursou na disciplina
	 */
	public int horas;
	
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4; 
	
	
	/**
	 * Constrói informarções do aluno a partir do nome da disciplina
	 * @param nomeDisciplina
	 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	 * Acumula as horas do aluno na disciplina 
	 * @param horas recebe as horas cursadas pelo aluno
	 */
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	/**
	 * Cadastra as notas do aluno em uma determinada disciplina
	 * @param nota recebe a nota que vai ser acessada
	 * @param valorNota valor que irá ser passado pra nota
	 */
	public void cadastraNota(int nota,double valorNota) {
		switch (nota) {
		case 1:
			this.nota1=valorNota;
			break;
		case 2:
			this.nota2=valorNota;
			break;
		case 3:
			this.nota3=valorNota;
			break;
		case 4:
			this.nota4=valorNota;
			break;
		default:
			System.out.println("Nota invalida");
		}
	}
	double media = (nota1+nota2+nota3+nota4)/4.0;	
	
	
	/**
	 * Diz se o aluno foi aprovado ou não
	 * @return se o aluno foi aprovado retorna true,
	 * caso contrario retorna false
	 */
	public boolean Aprovado() {
		media = (nota1+nota2+nota3+nota4)/4.0;	
		if (media>=7) {
			return true; 
					}
		else {
			return false;
		}
	}

	/**
	 * Retorna as informações do aluno na disciplina
	 * formato "Nome da disciplina-horas cursadas-media-notas"
	 */
	public String toString() {
	return nomeDisciplina + " "+ horas + " "+ media + " [" +
				nota1 + " " + nota2 + " " + nota3 + " " + nota4+"]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
