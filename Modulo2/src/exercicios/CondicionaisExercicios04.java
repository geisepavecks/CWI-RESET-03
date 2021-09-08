// Exercício de condicionais com aplicação de if else // 

package exercicios;

import java.util.Scanner;

public class CondicionaisExercicios04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua nota da prova final: ");
		double nota = scan.nextDouble();
		
		if (nota >= 7 && nota < 10) {
			System.out.println("Aluno aprovado");
	    } else if (nota < 7) {
	    	System.out.println("Aluno reprovado");
	    } else if (nota == 10) {
	    	System.out.println("Aluno aprovado com louvores");
	    }
	}			

}
