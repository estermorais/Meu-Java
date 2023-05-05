package principalEster;

public class Concessionaria extends Conta{

	public Concessionaria(int dia, int mes, double valor) {
		super(dia, mes, valor);
	}

	@Override
	public double getValorPagar(int diaPagto, int mesPagto) {

		return this.valor;
	}
	
	

}
