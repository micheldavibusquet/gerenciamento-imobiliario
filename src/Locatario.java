
public class Locatario extends Pessoa {
	
	private String email;
	// colocado salário como double ao invés de String, por fazer mais sentido
	private double salario;
	

	public Locatario(String nome, String telefone, String endereco, String cpf, String email, double salario) {
		super(nome, telefone, endereco, cpf);
		this.email = email;
		this.salario = salario;	
	}
	
	public void enviarCobranca() {
		
	}
	
	public void pagarProprietario() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nE-mail: " + this.email +
				"\nSalário: " + this.salario;
	}

	
}
