package exercicios1;

import exercicios2.Analista;
import exercicios2.Gerente;
import exercicios3.Empresa;

public class Main {

	public static void main(String[] args) {
//		//Funcionário 
//		Funcionario f1 = new Funcionario("Vitor");
//		
//		f1.setHoras(100);
//		f1.setSalario(80);
//		f1.mostrarDados();
//		
//		System.out.println();
//		
//		//Analista
//		Analista a1 = new Analista("Fernando");
//		
//		a1.setHoras(120);
//		a1.setSalario(120);
//		a1.setSetor("Engenharia de Softwares");
//		a1.mostrarDados();
//		
//		System.out.println();
//		
//		//Gerente
//		Gerente g1 = new Gerente("Tássio");
//		
//		g1.setHoras(160);
//		g1.setSalario(200);
//		g1.setBonus(500);
//		
//		g1.mostrarDados();
		
		Empresa e1 = new Empresa();
		
		
		
		e1.criarFuncionario("Vitor", 3, 1);
		
		g1.mostrarDados();
	}

}
