package ExercicioProduto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private Date dataDeFabrica��o;
	
	public ProdutoUsado(String nome, double pre�o, Date dataDeFabrica��o) {
		super(nome, pre�o);
		this.dataDeFabrica��o = dataDeFabrica��o;
	}

	public Date getDataDeFabrica��o() {
		return dataDeFabrica��o;
	}

	public void setDataDeFabrica��o(Date dataDeFabrica��o) {
		this.dataDeFabrica��o = dataDeFabrica��o;
	}
	
	@Override
	public String etiquetaPre�o() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return getNome() + " (usado) $ " + String.format("%.2f", getPre�o()) + " (Data de fabrica��o: " + sdf.format(dataDeFabrica��o) + ")";
	}
}
