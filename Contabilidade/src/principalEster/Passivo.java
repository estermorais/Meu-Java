package principalEster;

public interface Passivo {
	
	public static final double SALARIO = 1320.0;
	public static final double HORA = 65.0;
	
	public abstract double getValorPagar(int diaPagto, int mesPagto);

}
