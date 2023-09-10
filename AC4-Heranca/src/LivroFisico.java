
public class LivroFisico extends Livro{
	
	public boolean emprestado = false;
	
	public LivroFisico(String nome, String autor) {
		super(nome, autor);
	}
	
	public void emprestar() {
		if(reservado == false) {
			System.out.println("O livro não foi reservado!");
		}
		else if(emprestado == true){
			System.out.println("O livro já foi emprestado!");
		}
		else {
			System.out.println("O livro foi emprestado com sucesso!");
			emprestado = true;
		}
	}
	public void devolver() {
		System.out.println("O livro foi devolvido!");
		emprestado = false;
	}
}
