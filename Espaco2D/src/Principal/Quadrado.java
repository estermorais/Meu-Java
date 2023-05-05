package Principal;

public class Quadrado extends Forma {

	public Quadrado() {
		super();
	}
	
	public Quadrado(Ponto2D[] pontos) {
		super(pontos);
	}
	
	@Override
	public double calculaArea() {
		
		double lado1 = pontos[0].calculaDistancia(pontos[1]);
				
		return lado1*lado1;
	}

	@Override
	public double calculaPerimetro() {
		
		double lado1 = pontos[0].calculaDistancia(pontos[1]);
		double lado2 = pontos[1].calculaDistancia(pontos[2]);
		double lado3 = pontos[2].calculaDistancia(pontos[3]);
		double lado4 = pontos[3].calculaDistancia(pontos[0]);
		
		return lado1+lado2+lado3+lado4;
	}
	
	

}
