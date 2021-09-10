package exercicio.mario;

public abstract class Personagem {
	private String nome;
	private int idade;
	protected double altura;
	private int estamina;
	private int moedasColetadas;
	private int vidas;
	
	public Personagem(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
		this.moedasColetadas = 0;
		this.vidas = 1;
	}
	
	public void imprimeStatus() {
		System.out.println(String.format("Personagem{nome: %s, altura: %.2f, estamina: %d, moedasColetadas: %d, vidas: %d}",
				nome, altura, estamina, moedasColetadas, vidas));
	}
	
	public void saltar() {
		System.out.println(String.format("%s pulou %.2fm.", this.nome, altura / 2));
	}
	
	public void saltar(double alturaObjeto) {
		System.out.println(String.format("%s pulou %.2fm sobre um objeto de %.2fm.", this.nome, alturaObjeto * 1.5, alturaObjeto));
	}
	
	public void perderEstamina() {
		this.estamina -= 10;
		if(this.estamina < 0) {
			this.estamina = 0;
		}
	}
	
	public void ganharEstamina() {
		this.estamina += 5;
		if(this.estamina > 100) {
			this.estamina = 100;
		}
	}
	
	private void revigorar() {
		this.estamina = 100;
	}
	
	public void morrer() {
		this.estamina = 0;
		this.vidas--;
		if(this.vidas < 0) {
			this.vidas = 0;
		} else {
			this.revigorar();
		}
	}
	
	public abstract void crescer();
	
	public void coletarMoeda() {
		this.moedasColetadas++;
		if(this.moedasColetadas % 10 == 0) {
			this.vidas++;
		}
	}
}