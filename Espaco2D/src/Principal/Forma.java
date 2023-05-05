package Principal;

public abstract class Forma {

		protected Ponto2D[] pontos;
		
		public Forma() {
			
		}
		
		public Forma(Ponto2D[] pontos) {
			this.pontos = pontos;
		}
		
		public static Forma geraForma(Ponto2D[] pontos) {
			
			int tamanho = pontos.length;
						
			//se tamanho = 3, verifico se posso gerar triangulo
			
			if(tamanho == 3) {
				if(geraTriangulo(pontos)) {
					return new Triangulo(pontos);
				}
			}
			
			//se tamanho = 2, verifico se posso gerar circulo
			
			if(tamanho == 2) {
				if(geraCirculo(pontos)) {
					return new Circulo(pontos);
				}
			}
			
			//se tamanho = 4, verifico se posso gerar circulo
			
			if(tamanho == 4) {
				if(geraQuadrado(pontos)) {
					return new Quadrado(pontos);
				}
			}
			
		return null;
				
		}
		
		public static boolean geraTriangulo(Ponto2D[] pontos) {
				
			double lado1 = pontos[0].calculaDistancia(pontos[1]);
			double lado2 = pontos[1].calculaDistancia(pontos[2]);
			double lado3 = pontos[2].calculaDistancia(pontos[0]);
			
			if((lado1+lado2)>lado3) {
				return true;
			}
			
			return false;
		}
		
		public static boolean geraCirculo(Ponto2D[] pontos) {
			
			double raio = pontos[0].calculaDistancia(pontos[1]);
						
			if(raio != 0) {
				return true;
			}
			
			return false;
		}
		
		public static boolean geraQuadrado(Ponto2D[] pontos) {
			
			double lado1 = pontos[0].calculaDistancia(pontos[1]);
			double lado2 = pontos[1].calculaDistancia(pontos[2]);
			double lado3 = pontos[2].calculaDistancia(pontos[0]);
			double lado4 = pontos[3].calculaDistancia(pontos[0]);
			
			if((lado1 == lado2)&&(lado2 == lado3) && (lado3 == lado4) && (lado4 == lado1) && (lado1 !=0) && (lado2 !=0) && (lado3 !=0) && (lado4 !=0)){
				
				return true;
			}
			
			return false;
		}
		
		public abstract double calculaArea();
		
		public abstract double calculaPerimetro();
		

		public Ponto2D[] getPontos() {
			return pontos;
		}

		public void setPontos(Ponto2D[] pontos) {
			this.pontos = pontos;
		}
		
		
		
		
}
