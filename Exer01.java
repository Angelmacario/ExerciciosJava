package br.com.generation.Exercicios01;

import java.util.Scanner;

public class Exer01 { //Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {
		Scanner saida = new Scanner(System.in); //Scanner � um tipo de vari�vel, e sa�da � nome da vari�vel (saida � do tipo scanner)
		
		int num1, num2, num3, maior; //aqui s�o minhas vari�veis
		
		System.out.println("Digite o 1� n�mero: ");	
		num1 = saida.nextInt();
		
		System.out.println("\nDigite o 2� n�mero: ");	
		num2= saida.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");	
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
		
		System.out.println("O maior n�mero �: " + maior);
		
		saida.close(); //close serve para fechar o Scanner
	    }
	

}
