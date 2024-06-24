
public class Casa extends Imovel {
	
	int qtdAndares;

	public Casa(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros, int qtdAndares) {
		super(codigo, endereco, valorLocacao, vagasGaragem, quartos, banheiros);
		this.qtdAndares = qtdAndares;
	}

	public int getQtdAndares() {
		return qtdAndares;
	}

	public void setQtdAndares(int qtdAndares) {
		this.qtdAndares = qtdAndares;
	}

	@Override
	public double calcularAluguel() {
		return super.getValorLocacao();
	}

}
