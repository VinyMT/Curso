package ExercicioProduto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> produtos = new ArrayList<>();
		
		System.out.print("Insira o número de produtos: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i ++) {
			System.out.println("Dados do produto #" + i);
			System.out.print("Comum, usado ou importado? (c/u/i) ");
			char opção = scanner.next().charAt(0);
			
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			System.out.print("Preço: ");
			double preço = scanner.nextDouble();
			
			if(opção == 'u') {
				System.out.print("Data de fabricação: ");
				Date dataDeFabricação = sdf.parse(scanner.next());
				produtos.add(new ProdutoUsado(nome, preço, dataDeFabricação));
			} else {
				if(opção == 'i') {
					System.out.print("Taxa da alfândega: ");
					double taxaDeAlfandega = scanner.nextDouble();
					produtos.add(new ProdutoImportado(nome, preço, taxaDeAlfandega));
				} else {
					produtos.add(new Produto(nome, preço));
				}
			}
		}
		
		System.out.println("Etiquetas de preços: ");
		for(Produto p : produtos) {
			System.out.println(p.etiquetaPreço());
		}
		scanner.close();
	}

}
