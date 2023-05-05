package principalEster;

public abstract class Empregado implements Passivo {
	
	protected String nome;
	protected String sobrenome;
	protected int numIdent;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getNumIdent() {
		return numIdent;
	}
	public void setNumIdent(int numIdent) {
		this.numIdent = numIdent;
	}
	
	public Empregado(String nome, String sobrenome, int numIdent) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numIdent = numIdent;
	}
	
	

}
