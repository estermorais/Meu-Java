package principalEster;

public class Titulo extends Conta {

	public Titulo(int dia, int mes, double valor) {
		super(dia, mes, valor);
	}

	@Override
	public double getValorPagar(int diaPagto, int mesPagto) {
		
		if(mesPagto > this.mes) {
			
			return this.valor*1.1;
			
		}
		else if(mesPagto == this.mes && diaPagto > this.dia) {
			
			return this.valor*1.1;
			
		}
		
		return this.valor;
	}

}
