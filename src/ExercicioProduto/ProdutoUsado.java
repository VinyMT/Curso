package ExercicioProduto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private Date dataDeFabricação;
	
	public ProdutoUsado(String nome, double preço, Date dataDeFabricação) {
		super(nome, preço);
		this.dataDeFabricação = dataDeFabricação;
	}

	public Date getDataDeFabricação() {
		return dataDeFabricação;
	}

	public void setDataDeFabricação(Date dataDeFabricação) {
		this.dataDeFabricação = dataDeFabricação;
	}
	
	@Override
	public String etiquetaPreço() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return getNome() + " (usado) $ " + String.format("%.2f", getPreço()) + " (Data de fabricação: " + sdf.format(dataDeFabricação) + ")";
	}
}
