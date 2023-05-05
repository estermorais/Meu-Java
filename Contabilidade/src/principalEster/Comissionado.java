package principalEster;

public class Comissionado extends Empregado {
	
	private double valorVendas;
	
	public Comissionado(String nome, String sobrenome, int numIdent, double valorVendas) {
		super(nome, sobrenome, numIdent);
		this.valorVendas = valorVendas;
	}

	@Override
	public double getValorPagar(int diaPagto, int mesPagto) {
		return this.valorVendas*0.6;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	

	
}
