package classes;

public class AlunoGraduacao extends Aluno {

	public AlunoGraduacao(String nome, String matricula) {
		super(nome, matricula);

	}

	@Override
	public double calcularMedia() {
		double media = (nota1 + nota2) / 2;
		return media;
	}

	@Override
	public void exibirInfo() {
		System.out.println("Tipo: Graduação.");
		super.exibirInfo();
	}

}
