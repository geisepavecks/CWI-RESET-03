//Exerc�cio de operadores aritm�ticos //

package exercicios;

import java.util.Scanner;

public class OperadoresExercicio {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int primeiroNum = scan.nextInt();
		
		System.out.println("Informe outro n�mero: ");
		int segundoNum = scan.nextInt();
		
		System.out.println("A somat�ria desses n�meros �: " + (primeiroNum + segundoNum ));
	}
}