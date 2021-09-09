/*
 * Faça um programa que leia 5 números
 * e informe o maior número.
 * 
 * */


package exercicios;

import java.util.Scanner;

public class LoopsExercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[5];
		int maiorNumero = 0;
		
		System.out.println("Por favor, digite 5 números:");
		for(int i = 0; i < 5; i++) {
			System.out.println("Número " + (i + 1) + ":");
			numeros[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			if (i == 0) {
				maiorNumero = numeros[i];
			} else if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
		
		System.out.println("O maior número digitado foi " + maiorNumero + ".");
		
		scan.close();
	}
}
