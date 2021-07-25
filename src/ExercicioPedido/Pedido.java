package ExercicioPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private Date momento;
	private OrderStatus status;
	private List<ItemPedido> pedidos = new ArrayList<>();
	
	public Pedido(Date momento, OrderStatus status) {
		this.momento = momento;
		this.status = status;
	}
	
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<ItemPedido> getPedidos() {
		return pedidos;
	}

	public void addPedidos(ItemPedido pedido) {
		pedidos.add(pedido);
	}
	
	public void removePedidos(ItemPedido pedido) {
		pedidos.remove(pedido);
	}
	
	public double total() {
		int total = 0;
		for(ItemPedido p: pedidos) {
			total += p.subTotal();
		}
		return total;
	}
}
