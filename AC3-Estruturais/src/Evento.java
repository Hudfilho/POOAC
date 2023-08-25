public class Evento {
    String nome, data, local;
    String descricao = "Ainda não há descricao";
    int participantesMaximo, vagas;
    Palestrante palestrante;    
    
    Evento(String nome, String data, String local, int participantesMaximo){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.participantesMaximo = participantesMaximo;
        this.vagas = participantesMaximo;
    }

    Evento(String nome, String data, String local, int participantesMaximo, Palestrante palestrante){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.participantesMaximo = participantesMaximo;
        this.vagas = participantesMaximo;
        this.palestrante = palestrante;
    }    


    public void inscreverAluno(String nome){
        if(this.vagas>0){
        this.vagas-= 1;
        System.out.println("Aluno "+ nome + " inscrito");
        System.out.println("Vagas restantes "+ this.vagas);;
        }
        else{
            System.out.println("Evento lotado!");
        }
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}


