package exercicios1;


public class Funcionario extends exercicios3.Empresa {
	protected String nome;
	protected int idade;
	protected double salario;
	protected int horas;
	
	
	public Funcionario(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;		
		
	}
	
	public Funcionario(String nome) {
		this(nome, 18);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getSalario() {
		calcularSalario();
		return salario;
	}


	public void setSalario(double salario) {
		
		if (salario < 10 || salario > 200) {
			System.out.println("Esse valor é inválido");
		} else {
			this.salario = salario;
		}
	}


	public int getHoras() {
		return horas;

	}


	public void setHoras(int horas) {
		this.horas = horas;
		if (horas >= 160) {
			System.out.println("Você excedeu o limite de horas mensal.");
		}
	}
	
	public void calcularSalario() {
		this.salario *= this.horas;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Horas trabalhadas: " + this.getHoras());
		System.out.println("Salário: " + this.getSalario());
	}
	
	
}
