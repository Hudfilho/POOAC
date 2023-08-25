public class Painel {
    Evento evento;
    Aluno aluno;
    Palestrante palestrante;
    //Array eventos

    Painel(Evento evento, Palestrante palestrante){
        this.evento = evento;
        this.palestrante = palestrante;
    }
    public void visualizarEvento(Evento evento){
        System.out.println("Nome: "+ evento.nome + " Data: "+ evento.data + " Local: "+evento.local+
                "\nLotacao: "+evento.participantesMaximo+" Vagas: "+evento.vagas+ "\nDescricao: "+evento.descricao);
    }

    public void visualizarPalestrante(Palestrante palestrante){
       System.out.println("Nome: "+palestrante.nome+" Area de Conhecimento: "+ palestrante.areaDeConhecimento);
    }

    public void visualizarVagas(Evento evento){
        System.out.println("Numero de vagas: " + evento.vagas);
    }

    public void setEvento(Evento evento){
        this.evento = evento;
    }

    public void listaEventosFuturos(){
        //visualiza eventos futuros salvos no banco de dados (no momento array Eventos)
    }
}
