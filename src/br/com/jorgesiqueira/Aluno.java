package br.com.jorgesiqueira;

import java.util.Scanner;

public class Aluno {
	public static void main(String[] args) {
		/*
		 * Exercicio Uninabuco
		 */

		try (Scanner entrada = new Scanner(System.in)) {
			String nome;
			int idade, peso;
			String CPF;
			float imc, altura;
			System.out.println("Digite seu nome:");
			nome = entrada.nextLine();
			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();

			System.out.println("Digite o CPF:");
			CPF = entrada.next();
			System.out.println("Para calcular o IMC, digite sua altura:");
			altura = entrada.nextFloat();
			System.out.println("Para calcular o IMC, digite seu peso");
			peso = entrada.nextInt();
			imc = peso / (altura * 2);

			System.out.printf("Seu nome " + nome + "\n");
			System.out.printf("Sua idade " + idade + "\n");
			System.out.printf("Seu CPF é: " + CPF + "\n");
			System.out.printf("Resultado do calculo IMC : " + imc + "\n");
			if (imc < 18.5)
				System.out.println("Abaixo do peso ideal, vamos melhorar!");
			else if ((imc > 18.5) && (imc < 24.9))
				System.out.println("Voce esta no peso ideal, parabens!");
			else if ((imc > 25.0) && (imc < 29.9))
				System.out.println("Voce está com excesso de peso, vamos melhorar!");
			else if ((imc > 30.0) && (imc < 34.9))
				System.out.println("Obesidade Classe I, cuidado!");
			else if ((imc > 35.0) && (imc < 39.9))
				System.out.println("Obesidade Classe II, ainda temos como mudar isso!");
			else if (imc >= 40)
				System.out.println("Obesidade Classe III, procure ajuda, nada está perdido!");
		}
		    System.out.println("Obrigado :)");

	}
}