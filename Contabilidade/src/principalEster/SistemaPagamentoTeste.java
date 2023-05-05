package principalEster;

public class SistemaPagamentoTeste {

	public static void main(String[] args) {
				
		Conta titulo = new Titulo(1,4,420);
		Conta concessionaria = new Concessionaria(5,4,531);
		
		Empregado terceirizado = new Terceirizado("Ester", "Morais", 84255144, 160);
		Empregado comissionadoAssalariado = new AssalariadoComissionado("Marcos", "Brito", 95514125, 120, 0.1);		
		Empregado comissionado = new Comissionado("Maria", "Imaculada", 83054216, 200);
		Empregado assalariado = new Assalariado("Cleber", "Jose", 84621242, 176);
		

		ControlePagamento resultado  = new ControlePagamento();
		resultado.recebePagamentos(comissionadoAssalariado);
		resultado.recebePagamentos(comissionado);
		resultado.recebePagamentos(assalariado);
		resultado.recebePagamentos(terceirizado);
		resultado.recebePagamentos(concessionaria);
		resultado.recebePagamentos(titulo);
		
		double totalContas = resultado.retornaPagamentosConta(30,4);
		double totalEmpregados = resultado.retornaPagamentosEmpregado(5,4);
		double total = totalContas + totalEmpregados;
		
		System.out.println("Valor total de gastos: " + total);
		System.out.println("Valor das contas a pagar: " + totalContas);
		System.out.println("Valor total a pagar aos empregados: " + totalEmpregados);
		
	}

}
