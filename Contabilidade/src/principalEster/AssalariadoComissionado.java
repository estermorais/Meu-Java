package principalEster;

public class AssalariadoComissionado extends Comissionado {
	
	private double percentualBonus;
	
	public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double valorVendas, double percentualBonus) {
		super(nome, sobrenome, numIdent, valorVendas);
		this.percentualBonus = percentualBonus;
	}
	
	@Override
	public double getValorPagar(int diaPagto, int mesPagto) {
		
		return ((getValorVendas()*0.06) + Passivo.SALARIO)+(Passivo.SALARIO*this.percentualBonus);
		
	}

	

}
