package exercicio.mario;

public class Jogo {
	Personagem[] jogadores;
	
	public Jogo(Personagem jogador1, Personagem jogador2) {
		this.jogadores = new Personagem[] {jogador1, jogador2};
	}
	
	private void imprimirDados() {
		for(Personagem jogador : jogadores) {
			jogador.imprimeStatus();
		}
	}
	
	public void jogar() {
		System.out.println("Status inicial dos jogadores:");
		imprimirDados();
		
		System.out.println("\n== COMEÇAR JOGO! ==");
		for(int i = 0; i < jogadores.length; i++) {
			int numeroMoedas = (int)(Math.random() * 30);
			Personagem jogador = jogadores[i];
			
			for(int j = 0; j < numeroMoedas; j++) {
				jogador.coletarMoeda();
			}			
			System.out.printf("%nJogador %d coletou %d moedas.%n", i + 1, numeroMoedas);
			
			System.out.println("Status final do jogador " + (i + 1) + ":");
			jogador.imprimeStatus();
		}
	}
}