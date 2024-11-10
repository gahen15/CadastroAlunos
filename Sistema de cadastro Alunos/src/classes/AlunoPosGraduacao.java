package classes;

public class AlunoPosGraduacao extends Aluno {

	public AlunoPosGraduacao(String nome, String matricula) {
		super(nome, matricula);

	}

	@Override
	public double calcularMedia() {
		double media = ((nota1 * 3) + (nota2 * 2)) / 5;
		return media;
	}

	@Override
	public void exibirInfo() {
		System.out.println("Tipo: Pós-Graduação.");
		super.exibirInfo();
	}
}
