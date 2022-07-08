package br.com.generation.Exercicios01;

import java.util.Scanner;

public class Exer02 { //Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		Scanner crescente = new Scanner(System.in); //new é variável (o sistema está pronto para receber algo)
		
		int num1, num2, num3, auxiliar; //aqui são minhas variáveis
	
		System.out.println("Digite o 1º número: ");	
		num1 = crescente.nextInt();
		
		System.out.println("Digite o 2º número: ");	
		num2 = crescente.nextInt();
		
		System.out.println("Digite o 3º número: ");	
		num3 = crescente.nextInt();
		
		if(num1 > num2) {
			auxiliar = num1; //auxliar 
			num1 = num2;
			num2 = auxiliar;
		
		}else if (num2 > num3) {
			auxiliar = num2;
			num2 = num3;
			num3 = auxiliar;
		
		}else {
			auxiliar = num3;
			num3 = num1;
			num1 = auxiliar;
			
		}
		System.out.println("Ordem crescente: ");
		System.out.println(num1 + " " + num2 + " " + num3 + " ");
	}
	

}
