package ExercicioPedido;

public class ItemPedido {
	private int quantidade;
	private double preço;
	private Produto produto;
	
	public ItemPedido(int quantidade, double preço, Produto produto) {
		this.quantidade = quantidade;
		this.preço = preço;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return quantidade * preço;
	}
}
