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
		
		System.out.print("Insira o n�mero de produtos: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i ++) {
			System.out.println("Dados do produto #" + i);
			System.out.print("Comum, usado ou importado? (c/u/i) ");
			char op��o = scanner.next().charAt(0);
			
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			System.out.print("Pre�o: ");
			double pre�o = scanner.nextDouble();
			
			if(op��o == 'u') {
				System.out.print("Data de fabrica��o: ");
				Date dataDeFabrica��o = sdf.parse(scanner.next());
				produtos.add(new ProdutoUsado(nome, pre�o, dataDeFabrica��o));
			} else {
				if(op��o == 'i') {
					System.out.print("Taxa da alf�ndega: ");
					double taxaDeAlfandega = scanner.nextDouble();
					produtos.add(new ProdutoImportado(nome, pre�o, taxaDeAlfandega));
				} else {
					produtos.add(new Produto(nome, pre�o));
				}
			}
		}
		
		System.out.println("Etiquetas de pre�os: ");
		for(Produto p : produtos) {
			System.out.println(p.etiquetaPre�o());
		}
		scanner.close();
	}

}
