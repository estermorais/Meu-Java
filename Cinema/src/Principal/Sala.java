package Principal;
import java.util.HashMap;

public class Sala {
	
	private int numero;
	private int capacidade;
	private HashMap<String,Bilhete>assentos;
	private Filme[] filmes;
	
	public Sala(int numero, int capacidade, HashMap<String, Bilhete> assentos) {
		
		this.numero = numero;
		this.capacidade = capacidade;
		this.assentos = assentos;
	}

	public Sala() {
		
		this.numero = 0;
		this.capacidade = 0;
		this.assentos = new HashMap<>();
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public HashMap<String, Bilhete> getAssentos() {
		return assentos;
	}

	public void setAssentos(HashMap<String, Bilhete> assentos) {
		this.assentos = assentos;
	}	

	public Filme[] getFilmes() {
		return filmes;
	}

	public void setFilmes(Filme[] filmes) {
		this.filmes = filmes;
	}

	public void verificaCadeira() {		
		
		
	}
	
	int posicao;
	public void adicionaFilme(Filme filme) {		
		
		if(posicao < filmes.length) {
			filmes[posicao] = filme;
			posicao++;
			
		}		
		
	}
	
	public Filme consultaFilme(String descricao) {
		
		for(int i=0; i<filmes.length; i++) {
			if(filmes[i].getTitulo().equals(descricao)) {
				return filmes[i];
			}
		}
		return null;
	}	
	
}
