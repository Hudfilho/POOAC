
// DUPLA HUDSON E HENRIQUE
public class App {
    public static void main(String[] args) throws Exception {
        // DUPLA HUDSON E HENRIQUE
        AlunoDAO alunos = new AlunoDAO();
        Aluno aluno1 = new Aluno("Joao", "Engenharia", "12");
        Aluno aluno2 = new Aluno("Marcio", "Computacao", "34");
        Aluno aluno3 = new Aluno("Alana", "Arquitetura", "56");

        String chave = "34";
        String curso = "batata";

        //Adiciona 1/5
        alunos.adicionaAluno(aluno1);
        alunos.adicionaAluno(aluno2);
        alunos.adicionaAluno(aluno3);

        System.out.println(alunos);

        //removerAluno 2/5;
        alunos.removerAluno("12");
        alunos.removerAluno("12");

        alunos.listaAluno(chave);
        
        alunos.atualizaCurso(chave, curso);

        //Lista Alunos 5/5
        System.out.println(alunos);
    }

}
