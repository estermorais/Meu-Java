package Principal;

public class Teste {

	public static void main(String[] args) {
		
		Ponto2D ponto1 = new Ponto2D(3, 4);
		Ponto2D ponto2 = new Ponto2D(5, 2);		
		Ponto2D ponto3 = new Ponto2D(4, 1);
		Ponto2D ponto4  = new Ponto2D(1,1);
		Ponto2D ponto5 = new Ponto2D(8,1);
		Ponto2D ponto6 = new Ponto2D(8,8);
		Ponto2D ponto7 = new Ponto2D(1,8);
		
		Ponto2D[] figura1 = {ponto1, ponto5};
		Ponto2D[] figura2 = {ponto1, ponto2, ponto3};
		Ponto2D[] figura3 = {ponto4, ponto5, ponto6, ponto7};
		
		Espaco2D espaco = new Espaco2D();
		
		espaco.adicionaFormas(espaco.criaForma(figura1));
		espaco.adicionaFormas(espaco.criaForma(figura2));
		espaco.adicionaFormas(espaco.criaForma(figura3));
		
		System.out.println("Área total: " + espaco.calculaAreaTotal());
		System.out.println("Perímetro total: " + espaco.calculaPerimetroTotal());
		System.out.println("Tipo de Triângulo: " + espaco.mostraTipoTriangulo());

	}

}
