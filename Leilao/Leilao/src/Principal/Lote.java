package Principal;

public class Lote {
	
	private Produto [] produtos;
	private int posicao;
		
		
	public Lote(int quantidade) {
		this.posicao = 0;
		this.produtos = new Produto[quantidade];
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}


	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}


	public boolean inserirProduto(Produto produto) {
		
		if(posicao < produtos.length) {
			produtos[posicao] = produto;
			posicao++;
			return true;
		}
		
		return false;		
		
	}
	
	public void receberLance(Lance lance, String descricao) {
		pesquisarProduto(descricao).setMaiorLance(lance);
		
	}
	
	private Produto pesquisarProduto(String descricao) {
		for(int i=0; i<produtos.length; i++) {
			if(produtos[i].getDescricao().equals(descricao)) {
				return produtos[i];
			}
		}
		return null;
	}
	
}
