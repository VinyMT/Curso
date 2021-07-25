package ExercicioPedido;

public class ItemPedido {
	private int quantidade;
	private double pre�o;
	private Produto produto;
	
	public ItemPedido(int quantidade, double pre�o, Produto produto) {
		this.quantidade = quantidade;
		this.pre�o = pre�o;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return quantidade * pre�o;
	}
}
