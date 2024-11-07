package classes;

public class AlunoPosGraducao extends Aluno {

	public AlunoPosGraducao(String nome, String matricula) {
		super(nome, matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMedia() {
		double media = ((nota1 * 3) + (nota2 * 2)) / 5;
		return media;
	}

}
