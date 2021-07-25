package ExercicioPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Insira os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("E-mail: ");
		String email = scanner.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNascimento = sdf.parse(scanner.nextLine());
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		System.out.println("Insira os dados do pedido: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scanner.nextLine());
		
		Pedido pedido = new Pedido(new Date(), status);
		
		System.out.print("Quantos produtos nesse pedido? ");
		int quantidade = scanner.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("Insira os dados do pedido #" + i);
			System.out.print("Nome do produto: ");
			scanner.nextLine();
			String nomeDoProduto = scanner.nextLine();
			System.out.print("Preço do produto: ");
			double preço = scanner.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeProd = scanner.nextInt();
			
			pedido.addPedidos(new ItemPedido(quantidadeProd, preço, new Produto(nomeDoProduto, preço)));
		}
		
		System.out.println("Sumário do pedido: ");
		System.out.println("Momento do pedido: " + sdf.format(pedido.getMomento()));
		System.out.println("Status do pedido: " + pedido.getStatus());
		System.out.println("Cliente: " + cliente.getNome() + " (" + sdf.format(cliente.getDataNascimento()) + ") - " + cliente.getEmail());
		System.out.println("Itens do pedido: ");
		for(ItemPedido p : pedido.getPedidos()) {
			System.out.println(p.getProduto().getNome() + ", " + p.getPreço() + ", Quantidade: " + p.getQuantidade() + ", Subtotal: " + p.subTotal());
		}
		System.out.println("Preço total: " + pedido.total());
		scanner.close();
	}
}
