package ExercicioContratos;

import java.util.Date;

public class Contrato {
	private Date data;
	private Double valorPorHora;
	private Integer horas;
	
	public Contrato(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	
	public Date getData() {
		return data;
	}


	public double valorTotal() {
		return valorPorHora * horas;
	}
}
