package exercicios3;

import exercicios2.Analista;
import exercicios2.Gerente;

public class Empresa {
	protected int tipoFunc;

	public Empresa() {
		
	}

	
	public void criarFuncionario(String nome, int idade, int tipoFunc) {
		if (tipoFunc == 1) {
			Gerente g1 = new Gerente(nome, idade);
			
		} else if (tipoFunc == 2) {
			new Analista(nome, idade);
		} else {
			System.out.println("Tipo não permitido.");
		}
	}
	
	public void mostrarDados() {
		
	}

}
