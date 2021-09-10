package exercicio.mario;

public class Yoshi extends Personagem {
	private int frutasComidas;
	private int velocidade;
	
	public Yoshi(String nome, int idade, double altura) {
		super(nome, idade, altura);
		this.frutasComidas = 0;
		this.velocidade = 10;
	}
	
	public void crescer() {
		this.altura *= 1.1;
	}
	
	public void comerFruta() {
		this.frutasComidas++;
		if(this.frutasComidas % 2 == 0) {
			this.velocidade *= 2;
		}
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
}