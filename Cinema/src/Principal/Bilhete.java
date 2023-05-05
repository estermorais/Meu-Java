package Principal;

public class Bilhete {
	
	private double valor;
	private Filme filme;
	private String assento;
	
	public Bilhete(double valor, Filme filme, String assento) {
		
		this.valor = valor;
		this.filme = filme;
		this.assento = assento;
	}
	
	public Bilhete() {
		
		this.valor = 0;
		this.filme = new Filme();
		this.assento = "";
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}
	
	public double valorIngresso(String tipo) {
		
		if(tipo.equals("Meia") || tipo.equals("meia")) {
			return 10.50;
		}
		
		else if(tipo.equals("Inteira") || tipo.equals("inteira")) {
			return 21.00;
		}
		
			else if	(tipo.equals("Criança") || tipo.equals("criança")){
				return 0;
			}
			
		return 0;
	}
}
