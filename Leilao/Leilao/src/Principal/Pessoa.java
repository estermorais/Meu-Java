package Principal;

public class Pessoa {

	private String nome;
	private String contato;
	
	//construtor sem parâmetros
	public Pessoa() {
		this.nome = "";
		this.contato = "";
	}
		
	//construtor com parâmetros
	public Pessoa(String nome,String contato) {
		this.nome = nome;
		this.contato = contato;
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}	
	
	
}
