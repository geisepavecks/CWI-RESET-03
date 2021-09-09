/* Exercício onde o programa vai pedir uma nota entre zero e dez. Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez,
mostre uma mensagem informando o problema, mas mantenha o programa em execução pedindo novamente a nota até que o usuário informe um valor válido. 
Quando o usuário informar uma nota válida, imprima o valor da nota.
 */


package exercicios;

import java.util.Scanner;

public class LoopsExercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre zero e dez: ");
		int nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota, inválida. Por favor, digite uma nota entre 0 e 10: ");
			nota = scan.nextInt();
		}
		
		System.out.println("A nota digitada foi " + nota + ".");
		
		scan.close();

	}

}
