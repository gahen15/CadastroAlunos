package classes;

public abstract class Aluno {

	String nome, matricula;
	double nota1, nota2;

	public Aluno(String nome, String matricula) {
	
		this.nome = nome;
		this.matricula = matricula;
	}

	public boolean verificarAprovado() {
		if (calcularMedia() > 7) {
			return true;
		} else {
			return false;
		}

	}

	public void exibirInfo() {

		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Média: " + calcularMedia());
		System.out.println("Estatus de aprovação: " + verificarAprovado());
		
	}

	public abstract double calcularMedia();

}
