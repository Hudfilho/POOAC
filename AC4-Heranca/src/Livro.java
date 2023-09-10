
public class Livro {
	
	private String nome;
	private String autor;
	public boolean reservado = false;
	
	public Livro(String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
	}
	
	public void reservar() {
		reservado = true;
		System.out.println("O livro foi reservado com sucesso!");
	}
	public void cancelarReserva() {
		reservado = true;
		System.out.println("A reserva do livro foi cancelada!");
	}

}
