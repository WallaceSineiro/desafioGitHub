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
		
		double area = base * altura;
		System.out.println("O valor da área é de " + area);
		
		
		
	}

}
