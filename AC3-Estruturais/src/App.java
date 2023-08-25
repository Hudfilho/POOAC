public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando Sistema de Eventos");

        Aluno al1 = new Aluno("pedro", "1234", "null", "ibmec");
        Evento ev1 = new Evento("casa", "23/04/22", "casa", 80);
        Palestrante p1 = new Palestrante("Julio", "Geopolitica", "null");
        Painel painel = new Painel(ev1, p1);

        painel.visualizarVagas(ev1);;
        p1.visualizarEvento(ev1);
        ev1.inscreverAluno(al1.nome);
    }
}
