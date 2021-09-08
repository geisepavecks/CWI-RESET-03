//Exercício operadores fazendo a média //

package exercicios;

import java.util.Scanner;

public class OperadoresExercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 4 números");
		int primeiroNumero = scan.nextInt();
		int segundoNumero = scan.nextInt();
		int terceiroNumero = scan.nextInt();
		int quartoNumero = scan.nextInt();
		int resultado = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero) / 4;
		
		System.out.println("A média da soma desses números é:  " + resultado);

	}

}
 

