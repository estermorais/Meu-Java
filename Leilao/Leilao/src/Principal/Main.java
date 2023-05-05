package Principal;

public class Main {

	public static void main(String[] args) {

		Leilao leilao = new Leilao(3);
				
		//criando lotes e inserindo no leilão
		
		Lote lote1 = new Lote(2);
		Lote lote2 = new Lote(2);
		Lote lote3 = new Lote(2);		
		
		leilao.inserirLote(lote1);
		leilao.inserirLote(lote2);
		leilao.inserirLote(lote3);
	
		//instanciando produtos e instanciando nos lotes com valor inicial de lances
		//bicicleta, casa, carro, computador, aviao, jetski
		
		leilao.getLotes()[0].inserirProduto(new Produto("Bicicleta", new Lance(new Pessoa(), 3000)));
		leilao.getLotes()[0].inserirProduto(new Produto("Casa", new Lance(new Pessoa(), 1580000)));
		
		leilao.getLotes()[1].inserirProduto(new Produto("Carro", new Lance(new Pessoa(), 30000)));
		leilao.getLotes()[1].inserirProduto(new Produto("Computador", new Lance(new Pessoa(), 4500)));
		
		leilao.getLotes()[2].inserirProduto(new Produto("Aviao", new Lance(new Pessoa(), 10000000)));
		leilao.getLotes()[2].inserirProduto(new Produto("Jetski", new Lance(new Pessoa(), 50000)));
		
		//instanciando as pessoas do leilão
		
		Pessoa pessoa1 = new Pessoa("Ester", "ester@gmail.com");
		Pessoa pessoa2 = new Pessoa("Maria", "maria@gmail.com");
		Pessoa pessoa3 = new Pessoa("Tainá", "taina@gmail.com");
		
		//recebendo lances
		
		leilao.receberLance(2, "Aviao", new Lance(pessoa1, 15000000));
		leilao.receberLance(0, "Bicicleta", new Lance(pessoa2, 3200));
		leilao.receberLance(1, "Carro", new Lance(pessoa2, 31000));
		
		leilao.receberLance(2, "Jetski", new Lance(pessoa3, 60000));
		leilao.receberLance(0, "Casa", new Lance(pessoa3, 1582000));
		leilao.receberLance(1, "Computador", new Lance(pessoa1, 5000));	
		
		//invocando os métodos
		System.out.println(leilao.listarProdutos());
		System.out.println(leilao.encerrarLeilao());

	}

}
