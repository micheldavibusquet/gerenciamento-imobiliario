
public abstract class Imovel {
	
	private int codigo;
	private String endereco;
	private double valorLocacao;
	private int vagasGaragem;
	private int quartos;
	private int banheiros;
	public Imovel(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros) {
		super();
		this.codigo = codigo;
		this.endereco = endereco;
		this.valorLocacao = valorLocacao;
		this.vagasGaragem = vagasGaragem;
		this.quartos = quartos;
		this.banheiros = banheiros;
	}
	
	public abstract double calcularAluguel();
		
	public double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	public int getVagasGaragem() {
		return vagasGaragem;
	}
	public void setVagasGaragem(int vagasGaragem) {
		this.vagasGaragem = vagasGaragem;
	}
	public int getQuartos() {
		return quartos;
	}
	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}
	public int getBanheiros() {
		return banheiros;
	}
	public void setBanheiros(int banheiros) {
		this.banheiros = banheiros;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	
	@Override
	public String toString() {
		return 	"------Imóvel------" +
				"\nCódigo: " + this.codigo +
				"\nEndereço: " + this.endereco +
				"\nValor de Locação: " + this.valorLocacao +
				"\nVagas de Garagem: " + this.vagasGaragem +
				"\nQuantidade de Quartos: " + this.quartos +
				"\nQuantidade de Banheiros: " + this.banheiros;
	}
	
	

}
