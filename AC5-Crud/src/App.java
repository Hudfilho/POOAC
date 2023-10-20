
// DUPLA HUDSON E HENRIQUE
public class App {
    public static void main(String[] args) throws Exception {
        // DUPLA HUDSON E HENRIQUE
        AlunoDAO alunos = new AlunoDAO();
        String chave = "34";
        String curso = "batata";

        //Adiciona 1/5
        alunos.adicionaAluno("Joao", "Engenharia", "12");
        alunos.adicionaAluno("Marcio", "Computacao", "34");
        alunos.adicionaAluno("Alana", "Arquitetura", "56");

        System.out.println(alunos);

        //removerAluno 2/5;
        alunos.removerAluno("12");

        alunos.listaAluno(chave);
        
        alunos.atualizaCurso(chave, curso);

        //Lista Alunos 5/5
        System.out.println(alunos);
    }

}
