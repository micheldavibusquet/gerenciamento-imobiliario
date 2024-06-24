import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Corretor extends Pessoa {
	
	private String registro;
	//utilizado LocalDate para usar o LocalDate.Now() e registrar o Corretor na data do sistema.
	private LocalDate dataAdmissao;
	private double comissao;
	private double totalComissaoAcumulada;
	private List<Locacao> locacoes;

	public Corretor(String nome, String telefone, String endereco, String cpf, String registro, LocalDate dataAdmissao, 
			double comissao, double totalComissaoAcumulada) {
		super(nome, telefone, endereco, cpf);
		this.registro = registro;
		this.dataAdmissao = dataAdmissao;
		this.comissao = comissao;
		this.totalComissaoAcumulada = totalComissaoAcumulada;
		this.locacoes = new ArrayList<Locacao>();
	}
	
	public void sacarComissoes(double valor) {
		if (this.totalComissaoAcumulada <= valor) {
			this.totalComissaoAcumulada -= valor;
			System.out.println("Foi retirado: " + valor + " do seu saldo" + "\nSaldo Atual: " + this.totalComissaoAcumulada);			
		} else {
			System.out.println("não há saldo");
		}		
	}
	
	public void receber(double valor) {
		System.out.println("O proprietário " + super.getNome() + "está recebendo o valor de R$ " + valor);
		this.totalComissaoAcumulada += this.comissao * valor;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {		
		this.comissao = comissao;
	}

	public double getTotalComissaoAcumulada() {
		return totalComissaoAcumulada;
	}

	public void setTotalComissaoAcumulada(double totalComissaoAcumulada) {
		this.totalComissaoAcumulada = totalComissaoAcumulada;
	}

	public String getRegistro() {
		return registro;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	
	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nRegistro: " + this.registro +
				"\nData Admissão: " + this.dataAdmissao +
				"\nComissão: " + this.comissao +
				"\nCimissão Acumulada: " + this.totalComissaoAcumulada;
	}


}
