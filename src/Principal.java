import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Locatario loc1 = new Locatario("João", "21 999333333", "Rua da Relação, 55", "123456567-12", 
				"loc1@gmail.com", 1200);
		System.out.println(loc1);
		Corretor cor1 = new Corretor("Pedro", "21 98888888", "Rua do Riachuelo, 22", "124939999-00", "12345678",
		LocalDate.now(), 1000, 200);
		System.out.println(cor1);
		Proprietario prop1 = new Proprietario("Maria", "21 99232425", "Rua do Carmo,100", "123456123-99", "2222", "0928");
		System.out.println(prop1);
		Casa casa1 = new Casa(10, "Rua Padre João, 33", 2350, 2, 3, 2, 1);
		System.out.println(casa1);
		Apartamento ap1 = new Apartamento(20, "Rua Caramelo, 29", 1900, 1, 2, 1, 4, 402, 840, 200, 140);
		System.out.println(ap1);
						
	}
	
}
