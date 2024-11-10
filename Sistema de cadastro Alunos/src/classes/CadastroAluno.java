package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CadastroAluno {

	private List<Aluno> listaAlunos = new ArrayList<>();
	private Map<String, Aluno> mapaAlunos = new HashMap<>();

	public CadastroAluno() {
		super();
	}

	public void cadastrarAluno(Aluno aluno) {
		listaAlunos.add(aluno);
		mapaAlunos.put(aluno.getMatricula(), aluno);
		System.out
				.println("Aluno cadastrado com sucesso: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
	}

	public void exibirAlunos() {
		for (Aluno aluno : listaAlunos) {
			System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula() + " | Status: "
					+ aluno.statusAprovacao());
		}
	}

	public void alterarNotas(String matricula, double novaNota1, double novaNota2) {
		Aluno aluno = buscarAluno(matricula);
		if (aluno != null) {
			aluno.setNota1(novaNota1);
			aluno.setNota2(novaNota2);
			System.out.println("Notas alteradas com sucesso!");
		} else {
			System.out.println("Aluno não encontrado!");
		}
	}

	public Aluno buscarAluno(String matricula) {
		return mapaAlunos.get(matricula);
	}

	public void exibirAlunoMatricula(String matricula) {
		Aluno aluno = buscarAluno(matricula);

		if (aluno != null) {
			aluno.exibirInfo();
		} else {
			System.out.println("Aluno não encontrado! Verifique se a matrícula está correta.");
		}
	}
}
