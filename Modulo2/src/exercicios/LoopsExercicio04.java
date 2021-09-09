/*
 * Desenvolva um gerado de tabuada capaz de gerar
 * a tabuada de qualquer n�mero inteiro entre 1 a 10.
 * O usu�rio deve informar de qual n�mero ele deseja ver a tabuada.
 * A sa�da deve ser conforme o exemplo abaixo:
 * ===================
 * 	Tabuada do 5:
 * 	
 * 	5 x 1 = 5
 * 	5 x 2 = 10
 * 	.
 * 	.
 * 	.
 * 	5 x 10 = 50 
 * ===================
 * */

package exercicios;

import java.util.Scanner;

public class LoopsExercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 1 a 10:");
		int numero = scan.nextInt();
		while(numero < 1 || numero > 10) {
			System.out.println("Por favor, digite um n�mero entre 1 e 10:");
			numero = scan.nextInt();
		}
		
		System.out.println("Tabuada do " + numero + ":");
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
		
		scan.close();
	}
}