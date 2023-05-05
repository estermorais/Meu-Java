package principalEster;
import java.util.ArrayList;

public class ControlePagamento {
	
	private ArrayList<Passivo> pagamentos;

	public ControlePagamento() {
		this.pagamentos = new ArrayList<Passivo>();
	}
	
	public void recebePagamentos(Passivo valor) {
		
		this.pagamentos.add(valor);
		
	}
	
	public double retornaPagamentosEmpregado(int dia, int mes) 
	{
		double total = 0.0;
		for(Passivo passivo: pagamentos) 
		{
			if(passivo instanceof Empregado) 
			{
				total += passivo.getValorPagar(dia, mes);
			}
		}
		
		return total;
		
	}	
	
	public double retornaPagamentosConta(int dia, int mes) 
	{
		double total = 0.0;
		for(Passivo passivo: pagamentos) 
		{
			if(passivo instanceof Conta) 
			{
				total += passivo.getValorPagar(dia, mes);
			}
		}
		
		return total;
		
	}
	

}
