
public class Ebook extends Livro{
	
	private String formato;
	
	public Ebook(String nome, String autor, String formato) {
		super(nome, autor);
		this.formato = formato;
	}
}
