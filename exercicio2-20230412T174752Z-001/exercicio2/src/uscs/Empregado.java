package uscs;

public class Empregado {

	private String  nome;
	private String cargo;
	private double salario;
	private int codEmp;
	private static int totalEmp = 0;
	private static int id = 0;
	
	public Empregado(int codEmp, String nome, String cargo, double d) {
		this.codEmp = id++;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = d;
		totalEmp++;
	}


	public Empregado() {
		this.codEmp = id++;
		this.nome = "";
		this.cargo = "";
		this.salario = 0;
		totalEmp++;
	}
	
	public void  ImprimeEmpregados() {
		System.out.println("Código do Empregado: " +  codEmp);
		System.out.println("Nome do Empregado: " + nome);
		System.out.println("Cargo do Empregado: " + cargo);
		System.out.println("Salario do Empregado: " + salario + "\n");
		
	}
	
	public void TotalEmpregados() {
		System.out.println("Total de Empregados: " + totalEmp + "\n");
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getCodEmp() {
		return codEmp;
	}


	public void setCodEmp(int codEmp) {
		this.codEmp = codEmp;
	}
	
}


