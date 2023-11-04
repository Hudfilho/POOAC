import java.util.HashMap;

public class AlunoDAO{

    static Arquivo arquivo = new Arquivo("AlunosDB.txt");
    static HashMap<String, Aluno> alunos = arquivo.lerAlunos();

    //Adicionar um novo aluno à estrutura;
    public void adicionaAluno(String nome, String curso, String matricula){
        if (alunos.containsKey(matricula)){
            System.out.println("Matricula ja existe");
            return;
        }
        Aluno aluno = new Aluno(nome, curso, matricula);
        alunos.put(aluno.getMatricula(), aluno);
        System.out.println("Aluno adicionado");
    }

    //Remover um aluno da estrutura, a partir da matrícula;
    public void removerAluno(String chave){
        if (alunos.containsKey(chave)){
            alunos.remove(chave);
            System.out.println("Aluno removido");
        }
        else{
            System.out.println("Matricula invalida");
        }
    }

    //Atualizar o curso de um aluno, a partir da matrícula;
    public void atualizaCurso(String chave, String curso){
        if (alunos.containsKey(chave)){
            Aluno aluno = alunos.get(chave);
            aluno.setCurso(curso);
            System.out.println("Curso atualizado");
        }
        else{
            System.out.println("Matricula invalida");
        }
    }

    //Listar as informações de um aluno, a partir da matrícula;
    public void listaAluno(String chave){
        if (alunos.containsKey(chave)){
            Aluno aluno = alunos.get(chave);
            System.out.println(aluno);
        }
    }

    //Listar todos os alunos.
    public String toString(){
        String res = "";
        for (Aluno aluno : alunos.values()){
            res += "--------------------\n";
            res += aluno;
        }
        return res; 
    }
    
    public String listaAlunos(HashMap<String, Aluno> alunos){
        String res = "";
        for (Aluno aluno : alunos.values()){
            res += "--------------------\n";
            res += aluno;
        }
        return res;
    }

    public void escrever(){
        arquivo.escreverAlunos(alunos);
    }
}
