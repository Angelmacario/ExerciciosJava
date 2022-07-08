package br.com.generation.Exercicios01;

import java.util.Scanner;

public class Exer01 { //Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {
		Scanner saida = new Scanner(System.in); //Scanner é um tipo de variável, e saída é nome da variável (saida é do tipo scanner)
		
		int num1, num2, num3, maior; //aqui são minhas variáveis
		
		System.out.println("Digite o 1º número: ");	
		num1 = saida.nextInt();
		
		System.out.println("\nDigite o 2º número: ");	
		num2= saida.nextInt();
		
		System.out.println("Digite o 3º número: ");	
		num3 = saida.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
		}
		else if(num2 > num3) {
			maior = num2;
		}
		else {
		    maior = num3;	
		}
		
		System.out.println("O maior número é: " + maior);
		
		saida.close(); //close serve para fechar o Scanner
	    }
	

}
