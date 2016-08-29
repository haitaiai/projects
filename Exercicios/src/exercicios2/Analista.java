package exercicios2;

import javax.annotation.Resource;

public class Analista extends exercicios1.Funcionario {
	private String setor;

	public Analista(String nome, int idade) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Horas trabalhadas: " + this.getHoras());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Setor: " + this.setor);
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
