public class Aluno {
    private String nome, curso, matricula;

    public Aluno ( String nome, String curso, String matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return"Nome: " + this.nome+
            "\nCurso: " + this.curso+
            "\nMatricula: "+ this.matricula + "\n";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
