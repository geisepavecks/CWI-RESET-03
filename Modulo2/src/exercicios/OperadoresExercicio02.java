//Exerc�cio operadores fazendo a m�dia //

package exercicios;

import java.util.Scanner;

public class OperadoresExercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 4 n�meros");
		int primeiroNumero = scan.nextInt();
		int segundoNumero = scan.nextInt();
		int terceiroNumero = scan.nextInt();
		int quartoNumero = scan.nextInt();
		int resultado = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero) / 4;
		
		System.out.println("A m�dia da soma desses n�meros �:  " + resultado);

	}

}
 

