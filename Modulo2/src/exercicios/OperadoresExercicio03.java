//Exerc�cio operadores para calcular sal�rio //

package exercicios;

import java.util.Scanner;

public class OperadoresExercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto que voc� ganha por hora trabalhada: ");
		double salarioPorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha no m�s? ");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.println("O total do seu sal�rio no m�s � de: " + (horasTrabalhadas * salarioPorHora));

	}

}
