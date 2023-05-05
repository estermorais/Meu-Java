package principalEster;

public class Terceirizado extends Empregado{
	
	private double horasTrabalhadas;
	
	public Terceirizado(String nome, String sobrenome, int numIdent, double horasTrabalhadas) {
		super(nome, sobrenome, numIdent);
		this.horasTrabalhadas = horasTrabalhadas;		
	}

	@Override
	public double getValorPagar(int diaPagto, int mesPagto) {

		return horasTrabalhadas*Passivo.HORA;
	}

}
