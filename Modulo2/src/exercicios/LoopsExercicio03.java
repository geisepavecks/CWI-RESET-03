/*
 * Fa�a um programa que leia 5 n�meros
 * e informe o maior n�mero.
 * 
 * */


package exercicios;

import java.util.Scanner;

public class LoopsExercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[5];
		int maiorNumero = 0;
		
		System.out.println("Por favor, digite 5 n�meros:");
		for(int i = 0; i < 5; i++) {
			System.out.println("N�mero " + (i + 1) + ":");
			numeros[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			if (i == 0) {
				maiorNumero = numeros[i];
			} else if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
		
		System.out.println("O maior n�mero digitado foi " + maiorNumero + ".");
		
		scan.close();
	}
}
