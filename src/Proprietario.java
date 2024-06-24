import java.util.ArrayList;
import java.util.List;

public class Proprietario extends Pessoa {

	private String conta;
	private String agencia;
	private List<Imovel> imoveis;
	
	public Proprietario(String nome, String telefone, String endereco, String cpf, String conta, String agencia) {
		super(nome, telefone, endereco, cpf);
		this.conta = conta;
		this.agencia = agencia;	
		this.imoveis = new ArrayList<Imovel>();
	}
	
	public void receber(double valor) {
		System.out.println("O corretor " + super.getNome() + "está recebendo o valor de R$ " + valor);
	}
	
	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public void adicionarImovel(Imovel imovel) {
		this.imoveis.add(imovel);
	}
	
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nConta: " + this.conta +
				"\nAgência: " + this.agencia;
	}


}
