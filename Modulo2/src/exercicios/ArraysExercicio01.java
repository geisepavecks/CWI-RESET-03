/* 
 * Crie um programa que receba 5 valores e armazene em um vetor. 
 * Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor multiplicados por 2.
 * Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. No final, imprima o conteúdo dos dois vetores.
 * 
 */


package exercicios;

import java.util.Scanner;

public class ArraysExercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] primeiroVetor = new int[5];
		int[] segundoVetor = new int[5];

		System.out.println("Digite 5 valores: ");
		for(int i = 0; i < 5; i++) {
			int valor = scan.nextInt();
			primeiroVetor[i] = valor;
			segundoVetor[i] = valor * 2;
		}
		
		System.out.println("Valores do primeiro vetor:");
		for(int i = 0; i < 5; i++) {
			System.out.print(primeiroVetor[i] + "\t");
		}
		System.out.println("\nValores do segundo vetor:");
		for(int i = 0; i < 5; i++) {
			System.out.print(segundoVetor[i] + "\t");
		}
		
		scan.close();
	}
}