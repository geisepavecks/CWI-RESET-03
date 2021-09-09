/*
 * Fa�a um programa que leia dois n�meros
 * e imprima todos os valores presentes
 * no intervalo entre eles, um abaixo do outro.
 * Caso o segundo n�mero seja menor ou igual ao primeiro,
 * solicite um novo n�mero at� que o segundo
 * n�mero seja maior que o primeiro.
 *  
 * */

package exercicios;

import java.util.Scanner;

public class LoopsExercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int menorNum = scan.nextInt();
		
		System.out.println("Digite um n�mero maior que o anterior: ");
		int maiorNum = scan.nextInt();
		
		while(maiorNum <= menorNum) {
			System.out.println("Por favor, digite um n�mero maior que " + menorNum + ":");
			maiorNum = scan.nextInt();
		}
		
		System.out.println("Esses s�o os n�meros presentes no intervalo entre " + menorNum + " e " + maiorNum + ":");
		for(int i = menorNum + 1; i < maiorNum; i++) {
			System.out.println(i);
		}
		System.out.println("Esses foram os n�meros presentes no intervalo entre " + menorNum + " e " + maiorNum + ":");
		
		
		scan.close();
	}

}
