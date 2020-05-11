import model.Diretor;
import model.Funcionario;
import model.Diretor;


public class AppFolha {
	public static void main(String args[]) {
		
		Funcionario f = new Funcionario("johnatan", "john@john.com", 1000.0f);
		
		Diretor d = new Diretor("isidro", "isidro@isidro.com", 1000.0f, 2000.0f);
		
		
		
		
		//f.setNome("johnatan");
		//f.setEmail("john@john.com");
		//f.setSalario(1000.0f);
		
		//d.setNome("Isidro");
		//d.setEmail("isidro@isidro.com");
		//d.setSalario(1020.0f);
		//d.setBeneficio(2000.0f);
		
		System.out.println(f.imprimirInfo());
		
		System.out.println("\n\n");
		
		System.out.println(d.imprimirInfo());
	}

}
