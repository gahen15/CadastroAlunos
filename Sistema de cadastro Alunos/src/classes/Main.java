package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean loop = true;
		Scanner sc = new Scanner(System.in);

		CadastroAluno cadastro = new CadastroAluno();

		while (loop) {
			System.out.println("\n\nO que deseja fazer?");
			System.out.println("\n|1| Cadastrar aluno.");
			System.out.println("|2| Exibir lista de alunos.");
			System.out.println("|3| Buscar Aluno.");
			System.out.println("|4| Alterar notas de aluno.");
			System.out.println("|-1| Sair.\n");

			System.out.print("Escolha a opção que deseja: ");
			String opcao = sc.nextLine();
			switch (opcao) {
			case "1":
				System.out.println("\nQual o tipo de aluno que deseja cadastrar?");
				System.out.println("|1| Graduação");
				System.out.println("|2| Pós-Graduação");
				String tipoAluno = sc.nextLine();

				System.out.println("Digite o nome do Aluno: ");
				String nome = sc.nextLine();
				System.out.println("Digite a matrícula: ");
				String matricula = sc.nextLine();

				if (tipoAluno.equals("1")) {
					Aluno alunoCadastro = new AlunoGraduacao(nome, matricula);
					cadastro.cadastrarAluno(alunoCadastro);
				} else if (tipoAluno.equals("2")) {
					Aluno alunoCadastro = new AlunoPosGraduacao(nome, matricula);
					cadastro.cadastrarAluno(alunoCadastro);
				} else {
					System.out.println("Tipo de aluno inválido!");
					break;
				}

				break;

			case "2":
				System.out.println("\nExibindo lista de Alunos:\n");
				cadastro.exibirAlunos();
				System.out.println();
				break;

			case "3":
				System.out.println("Digite o número de matrícula do aluno que deseja procurar:");
				String buscaMatricula = sc.nextLine();
				System.out.println();
				cadastro.exibirAlunoMatricula(buscaMatricula);
				System.out.println();
				break;

			case "4":
				System.out.println("Digite o número de matrícula do aluno para alterar as notas:");
				String matriculaAlterarNotas = sc.nextLine();
				System.out.println("Digite a nova nota 1:");
				double novaNota1 = sc.nextDouble();
				System.out.println("Digite a nova nota 2:");
				double novaNota2 = sc.nextDouble();
				sc.nextLine(); // Limpar o buffer do scanner
				cadastro.alterarNotas(matriculaAlterarNotas, novaNota1, novaNota2);
				break;

			case "-1":
				System.out.println("Até mais!");
				loop = false;
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		}

		sc.close();
	}
}
