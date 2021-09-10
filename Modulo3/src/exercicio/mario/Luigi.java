package exercicio.mario;

public class Luigi extends Personagem {
	public Luigi(String nome, int idade, double altura) {
		super(nome, idade, altura);
	}
	
	public void crescer() {
		this.altura *= 1.75;
	}
	
	public void voar() {
		System.out.println("Luigi est� voando.");
	}

}
