package exercicios2;

public class Gerente extends exercicios1.Funcionario {
	private int bonus;

	public Gerente(String nome, int idade) {
		super(nome);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void calcularSalario() {
		this.salario = this.salario * this.horas + this.bonus;
	}
	
	@Override 
	public void mostrarDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Horas trabalhadas: " + this.getHoras());
		System.out.println("Bonus: " + this.bonus);
		System.out.println("Salário: " + this.getSalario());
	}
}
