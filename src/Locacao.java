import java.util.Date;

public class Locacao {
	
	private Date dataInicio;
	private Date dataTermino;
	private Date dataPagamento;
	private Imovel imovel;
	private Corretor corretor;
	private Locatario locatario;

	public Locacao(Date dataInicio, Date dataTermino, Date dataPagamento, Imovel imovel, Corretor corretor, Locatario locatario) {
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.dataPagamento = dataPagamento;
		this.imovel = imovel;
		this.corretor = corretor;
		this.locatario = locatario;
		
	}
	
	public void enviarCobranca() {
		if (imovel.getCodigo() == 10) {
			System.out.println("Email: " + locatario + 
					"O valor de seu aluguel neste mês foi de R$" + imovel.calcularAluguel());
		} else {
			System.out.println("Email: " + locatario + 
					"O valor de seu aluguel neste mês foi de R$" + imovel.calcularAluguel());
		}
		
		
	}
	
	public void pagarProprietario() {
		
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Corretor getCorretor() {
		return corretor;
	}

	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	@Override
	public String toString() {
		return "-----Locação-----" +
				"\nData Início: " + this.dataInicio +
				"\nData Término: " + this.dataTermino +
				"\nData de Pagamento: " + this.dataPagamento +
				this.imovel.toString();
	}

}
