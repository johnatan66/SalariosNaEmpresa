package model;

public class Funcionario {
	
	protected String  nome; //protected da a cesso para as outras classes acessarem os atributos dessa classe
	protected String  email;
	protected float   salario;
	
	// se na clasee pai tem um construtor delcarado na classe filho tem que ter tambem
	public Funcionario(String nome, String email, float salario) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	public void aumentarSalario(float percentual) {
		this.salario += salario * percentual/100;
	}
	public String imprimirInfo() {
		 return "Dados "+nome+" ("+email+") " +salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
