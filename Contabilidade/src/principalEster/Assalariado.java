package principalEster;

public class Assalariado extends Empregado {
	
	private double horasExtras;
	
	public Assalariado(String nome, String sobrenome, int numIdent, double horasExtras) {
		super(nome, sobrenome, numIdent);
		this.horasExtras = horasExtras;
	}


	@Override
	public double getValorPagar(int diaPagto, int mesPagto) {
		
		if(this.horasExtras > 0) {
			return Passivo.SALARIO + (this.horasExtras*Passivo.HORA);
		}
		
		return Passivo.SALARIO;
	}

}
