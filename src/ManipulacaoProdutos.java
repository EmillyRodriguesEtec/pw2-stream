import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ManipulacaoProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p1 = new Produto();
		p1.setId(50);
		p1.setPreco(25.00);
		p1.setNome("Suco de maracujá");
		p1.setCategoria(CategoriaEnum.BEBIDA);
		
		Produto p2 = new Produto();
		p2.setId(21);
		p2.setPreco(56.00);
		p2.setNome("Morango");
		p2.setCategoria(CategoriaEnum.HORTIFRUTI);
		
		Produto p3 = new Produto();
		p3.setNome("Pão");
		p3.setCategoria(CategoriaEnum.PADARIA);
		
		Produto p4 = new Produto();
		p4.setPreco(12.00);
		p4.setNome("Uva");
		p4.setCategoria(CategoriaEnum.HORTIFRUTI);
		
		Produto p5 = new Produto();
		p5.setId(5);
		p5.setNome("Papel Higiêmico");
		p5.setCategoria(CategoriaEnum.HIGIENE);
		
		List<Produto> lista = List.of(p1, p2, p3, p4, p5);
		
		Optional<Produto>existe =
		lista.stream().filter(e -> e.getPreco() 
			> 50).findFirst();
			
		if(existe.isPresent()) {
			System.out.println("Primeiro produto encontrado: " + existe.get().getNome());
		}		
		
		List<Produto> bebidas =
		lista.stream().filter(e -> e.getCategoria()
				== CategoriaEnum.BEBIDA).
		collect(Collectors.toList());
		
		bebidas.forEach(e ->{
			System.out.println("Bebidas: " + e.getNome());
		});
	}

}
