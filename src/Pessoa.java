
public abstract class Pessoa {
	
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	
	public Pessoa(String nome, String telefone, String endereco, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return  "--------Pessoa--------" +
				"\nNome: " + this.nome +
				"\nTelefone: " + this.telefone +
				"\nEndereço: " + this.endereco +
				"\nCPF: " + this.cpf;
	}
	
}
