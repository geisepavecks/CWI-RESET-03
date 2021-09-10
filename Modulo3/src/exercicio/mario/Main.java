package exercicio.mario;

public class Main {

	public static void main(String[] args) {
		Mario mario = new Mario("Mario", 24, 1.55);
		Luigi luigi = new Luigi("Luigi", 24, 1.77);
		Yoshi yoshi = new Yoshi("Yoshi", 12, 1.45);
		
		System.out.println("Status dos personagens antes de crescer:");
		mario.imprimeStatus();
		luigi.imprimeStatus();
		yoshi.imprimeStatus();
		System.out.println("Status dos personagens depois de crescer:");
		mario.crescer();
		mario.imprimeStatus();
		luigi.crescer();
		luigi.imprimeStatus();
		yoshi.crescer();
		yoshi.imprimeStatus();
		
		mario.saltar();
		mario.saltar(2.0);
		luigi.saltar();
		luigi.saltar(4.0);
		yoshi.saltar();
		yoshi.saltar(1.75);
	}
}