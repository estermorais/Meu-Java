package Principal;

public class Leilao {
	
	public Lote [] lotes;
	public int posicao;
	public String listar;
	private String encerra;
	private String lista;
	
	public Leilao(int quantidade) {
		this.posicao = 0;
		this.lotes = new Lote[quantidade];
	}
		
	public Lote[] getLotes() {
		return lotes;
	}

	public void setLotes(Lote[] lotes) {
		this.lotes = lotes;
	}

	public void inserirLote(Lote lote) {
		  
		if(posicao<= lotes.length) {
			lotes[posicao] = lote;
			posicao++;
		}
				
	}
	
	
	public void receberLance(int numLote, String descricaoProduto, Lance lance) {
		
		lotes[numLote].receberLance(lance,descricaoProduto);	
		
	}
	 
	
	public String encerrarLeilao() {
		
		String auxiliar;
		
		for(int i=0; i<lotes.length; i++) {
			for(int k=0; k<lotes[i].getProdutos().length; k++) {
				
				auxiliar = ("Produto: " + lotes[i].getProdutos()[k].getDescricao() + "\n" + "Comprador: " 
				+ lotes[i].getProdutos()[k].getMaiorLance().getPessoa().getNome() + "\n" + "Contato: " 
				+ lotes[i].getProdutos()[k].getMaiorLance().getPessoa().getContato() + "\n" + "Valor: R$ " 
				+ lotes[i].getProdutos()[k].getMaiorLance().getValor());
				encerra = encerra + auxiliar;
				
			}
		}
		return encerra;
	}
	
	
	public String listarProdutos(){
		
		String auxiliar;
		
		for(int a=0; a<lotes.length; a++) {
			for(int b=0; b<lotes[a].getProdutos().length;b++) {
				auxiliar = ("Produto disponível: " + lotes[a].getProdutos()[b].getDescricao() + "\n"
				+ "Maior lance nesse produto: R$ " + lotes[a].getProdutos()[b].getMaiorLance().getValor() + "\n");
				lista = lista + auxiliar;
			}
		}
		
		return lista;
	}
}
