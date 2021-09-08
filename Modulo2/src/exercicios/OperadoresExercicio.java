//Exercício de operadores aritméticos //

package exercicios;

import java.util.Scanner;

public class OperadoresExercicio {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int primeiroNum = scan.nextInt();
		
		System.out.println("Informe outro número: ");
		int segundoNum = scan.nextInt();
		
		System.out.println("A somatória desses números é: " + (primeiroNum + segundoNum ));
	}
}