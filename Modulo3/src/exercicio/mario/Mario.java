package exercicio.mario;

public class Mario extends Personagem {
	private Yoshi yoshi;
	
	public Mario(String nome, int idade, double altura) {
		super(nome, idade, altura);
	}
	
	public void crescer() {
		this.altura *= 1.5;
	}
	
	public void montarNoYoshi(Yoshi yoshi) {
		this.yoshi = yoshi;
	}
	
	public void imprimeSeTemMontaria() {
		System.out.println(yoshi != null ? "Mario est� montado no Yoshi." : "Mario n�o est� montado no Yoshi.");
	}
}