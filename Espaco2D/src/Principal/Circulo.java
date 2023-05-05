package Principal;

public class Circulo extends Forma {

	public Circulo() {
		super();
	}
	
	public Circulo(Ponto2D[] pontos) {
		super(pontos);
	}
	
	@Override
	public double calculaArea() {
		
		double raio = pontos[0].calculaDistancia(pontos[1]);
		
		return Math.PI*raio*raio;
	}

	@Override
	public double calculaPerimetro() {

		double raio = pontos[0].calculaDistancia(pontos[1]);
		
		return Math.PI*raio*2;
	}

}
