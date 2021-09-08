// 1º EXERCÍCIO MOSTRANDO APLICAÇÃO DE SCANNER //

package exercicios;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

	public static void main(String[] args) {
		
		Scanner meuNome = new Scanner(System.in);
		
		System.out.println("Qual seu nome? ");
		String primeiroNome = meuNome.nextLine();
		
		System.out.println("Além de " + primeiroNome + ", você é a aluna do Level 1 do CWI Reset. " );
		
		

	}

}
