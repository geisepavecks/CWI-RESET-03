//Exercício operadores para calcular salário //

package exercicios;

import java.util.Scanner;

public class OperadoresExercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto que você ganha por hora trabalhada: ");
		double salarioPorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha no mês? ");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.println("O total do seu salário no mês é de: " + (horasTrabalhadas * salarioPorHora));

	}

}
