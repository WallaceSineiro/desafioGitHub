package desafioGitHub;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao meu primeiro programa");
		System.out.println("Hoje vamos calcular a área de um quadrilátero");
		
		System.out.print("Me diga o valor da base:");
		double base = sc.nextDouble();
		
		System.out.print("Agora me diga o valor da altura: ");
		double altura = sc.nextDouble();
		
		
		System.out.println("O valor da área é de " + Calculos.calcularArea(base, altura));
		
		System.out.print("Você deseja saber o perímetro(sim/nao)?");
		String choice = sc.next();
		
		if(choice.equalsIgnoreCase("sim")) {
			System.out.println("O perímetro é: " + Calculos.calcularPerimetro(base, altura));
		}else {
			System.out.println("Obrigado pela preferência!!");
		}
		
		sc.close();
		System.exit(0);
		
		
	}

}
