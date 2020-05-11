package model;

public class Diretor extends Funcionario{
	private float beneficio;

	//a primeira linha da classe filho tem que chamar o construtor da classe pai
	
	public Diretor (String nome, String email, float salario, float beneficio) {
		super(nome,email, salario); // sempre chamar a classe pai primeiro
		this.beneficio = beneficio;
	}
	
	public float getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(float beneficio) {
		this.beneficio = beneficio;
	}
	
	public String imprimirInfo(){
		return "DIRETOR "+super.imprimirInfo()+ " Beneficio R$ "+beneficio; 
	}
	

}
