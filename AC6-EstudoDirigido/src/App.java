
// DUPLA HUDSON E HENRIQUE

//

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // DUPLA HUDSON E HENRIQUE
        AlunoDAO alunos = new AlunoDAO();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        String nome;
        String curso;
        String matricula;

        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Incluir aluno");
            System.out.println("2. Remover aluno");
            System.out.println("3. Editar aluno");
            System.out.println("4. Listar alunos");
            System.out.println("5. Sair");
            System.out.print("> ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do aluno: ");
                    nome = scanner.nextLine();
                    System.out.println("Informe o curso do aluno: ");
                    curso = scanner.nextLine();
                    System.out.println("Informe a matricula do aluno: ");
                    matricula = scanner.nextLine();
                    alunos.adicionaAluno(nome, curso, matricula);
                    System.out.print("Aperte enter para continuar ");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Informe a matricula do aluno: ");
                    matricula = scanner.nextLine();
                    alunos.removerAluno(matricula);
                    System.out.print("Aperte enter para continuar ");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Informe a matricula do aluno: ");
                    matricula = scanner.nextLine();
                    System.out.println("Informe o novo curso do aluno: ");
                    curso = scanner.nextLine();
                    alunos.atualizaCurso(matricula, curso);
                    System.out.print("Aperte enter para continuar ");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println(alunos);
                    System.out.print("Aperte enter para continuar ");
                    scanner.nextLine();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        alunos.escrever();
        scanner.close();
    }

}
