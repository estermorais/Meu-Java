package Principal;

public class Triangulo extends Forma {

	public Triangulo() {
		super();
	}
	
	public Triangulo(Ponto2D[] pontos) {
		super(pontos);
	}
	
	@Override
	public double calculaArea() {

		double lado1 = pontos[0].calculaDistancia(pontos[1]);
		double lado2 = pontos[1].calculaDistancia(pontos[2]);
		double lado3 = pontos[2].calculaDistancia(pontos[0]);
		
		double semiperimetro = (lado1 + lado2 + lado3) / 2;

		return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
	}

	@Override
	public double calculaPerimetro() {
		
		double lado1 = pontos[0].calculaDistancia(pontos[1]);
		double lado2 = pontos[1].calculaDistancia(pontos[2]);
		double lado3 = pontos[2].calculaDistancia(pontos[0]);
		
		return lado1+lado2+lado3;
	}
	
	public String tipoTriangulo() {
		
		double lado1 = pontos[0].calculaDistancia(pontos[1]);
		double lado2 = pontos[1].calculaDistancia(pontos[2]);
		double lado3 = pontos[2].calculaDistancia(pontos[0]);
		
		if((lado1 == lado2) && (lado1 == lado3) && (lado3 == lado2)) {
			return "Equilátero";
		}
		
		if((lado1 == lado2) || (lado1 == lado3) || (lado3 == lado2)){
			return "Isóceles";
		}
		
		if((lado1 != lado2) && (lado1 != lado3) && (lado3 != lado2)) {
			return "Escaleno";
		}
		return null;
		
	}

}
