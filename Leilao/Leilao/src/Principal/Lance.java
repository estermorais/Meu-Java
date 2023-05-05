package Principal;

public class Lance {
	
	private Pessoa pessoa; 
	private float valor;
	
		//construtor com parâmetros
		public Lance() {
			this.valor = 0f;
			this.pessoa = new Pessoa();
				
			}
				
		//construtor com parâmetros
		public Lance(Pessoa pessoa,float valor) {
			this.valor = valor;
			this.pessoa = pessoa;
			
		}

		public Pessoa getPessoa() {
			return pessoa;
		}

		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}

		public float getValor() {
			return valor;
		}

		public void setValor(float valor) {
			this.valor = valor;
		}
		
		public boolean equals(Lance lance) {
			if(valor == lance.getValor()) {
				if(pessoa.getNome().equals(lance.getPessoa().getNome()) && pessoa.getContato().equals(lance.getPessoa().getContato())) {
					return true;
				}
			}
			return false;
		}
}
