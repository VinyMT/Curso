package ExercicioContratos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	private String nome;
	private NivelDoTrabalhador nivel;
	private Double salarioBase;
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();
	
	public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public void adicionaContrato(Contrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(Contrato contrato) {
		contratos.remove(contrato);
	}
	
	public double salarioTotal(int ano, int mes) {
		double total = salarioBase;
		Calendar calendar = Calendar.getInstance();
		for(Contrato e : contratos) {
			calendar.setTime(e.getData());
			int contratoAno = calendar.get(Calendar.YEAR);
			int contratoMes = 1 + calendar.get(Calendar.MONTH);
			
			if(contratoAno == ano && contratoMes == mes) {
				total += e.valorTotal();
			}
		}
		return total;
	}
}
