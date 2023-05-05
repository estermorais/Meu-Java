package Principal;

public class Filme {
	
	private String titulo;
	private String genero;
	private int ano;
	private String diretor;
	private int sala;
	
	public Filme(String titulo, String genero, int ano, String diretor, int sala) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.diretor = diretor;
		this.sala = sala;
	}
	
	public Filme() {
		super();
		this.titulo = "";
		this.genero = "";
		this.ano = 0;
		this.diretor = "";
		this.sala = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}
	
	
	
	

}
