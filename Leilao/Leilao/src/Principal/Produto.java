package Principal;

public class Produto {
	
	private String descricao;
	private Lance maiorLance;
	
	//construtor sem parâmetros
	public Produto() {
		this.descricao = "";
		this.maiorLance = new Lance();
	}
	
	//construtor com parâmetros
	public Produto(String descricao, Lance maiorLance) {
		this.descricao = descricao;
		this.maiorLance = maiorLance;
	}
	
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Lance getMaiorLance() {
		return maiorLance;
	}


	public void setMaiorLance(Lance lance) {
		
		if(lance.getValor()>maiorLance.getValor()) {
			
			this.maiorLance = lance;
			
		}
		
	}
	
	
	
	

}
