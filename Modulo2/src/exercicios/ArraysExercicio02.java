/*
 * Crie um programa que leia 10 valores inteiros correspondentes as idades de um grupo de pessoas e armazene em um vetor.
 * Escreva uma lógica para determinar a quantidade de pessoas que possuem idade igual ou superior a 18 anos. 
 * Ao final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.
 * 
 */

package exercicios;

import java.util.Scanner;

public class ArraysExercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int numPessoasMaioresDeIdade = 0;
		
		System.out.println("Digite a idade de 10 pessoas:");
		for(int i = 0; i < 10; i++) {
			int idade = scan.nextInt();
			idades[i] = idade;
			if (idade >= 18) {
				numPessoasMaioresDeIdade++;
			}
		}
		
		System.out.println("Idades digitadas: ");
		for(int i = 0; i < 10; i++) {
			System.out.println(idades[i]);
		}
		System.out.println("Pessoas maiores de idade: " + numPessoasMaioresDeIdade);
		
		scan.close();

	}

}
