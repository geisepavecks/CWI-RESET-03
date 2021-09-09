/*
 * Faça um programa que leia dois números
 * e imprima todos os valores presentes
 * no intervalo entre eles, um abaixo do outro.
 * Caso o segundo número seja menor ou igual ao primeiro,
 * solicite um novo número até que o segundo
 * número seja maior que o primeiro.
 *  
 * */

package exercicios;

import java.util.Scanner;

public class LoopsExercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int menorNum = scan.nextInt();
		
		System.out.println("Digite um número maior que o anterior: ");
		int maiorNum = scan.nextInt();
		
		while(maiorNum <= menorNum) {
			System.out.println("Por favor, digite um número maior que " + menorNum + ":");
			maiorNum = scan.nextInt();
		}
		
		System.out.println("Esses são os números presentes no intervalo entre " + menorNum + " e " + maiorNum + ":");
		for(int i = menorNum + 1; i < maiorNum; i++) {
			System.out.println(i);
		}
		System.out.println("Esses foram os números presentes no intervalo entre " + menorNum + " e " + maiorNum + ":");
		
		
		scan.close();
	}

}
