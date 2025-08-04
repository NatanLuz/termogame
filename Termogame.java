package br.com.natan.termogame;

// Classe principal do jogo
public class Termogame {
    public static void main(String[] args) {
        // para exigir o titulo do game iremos fazer isso
        System.out.println("===== SEJA BEM-VINDO AO TERMO (TERMOGAME) =====");

        //Cria uma instancia do GameEngine (o que no qual vai rodar o jogo)
        GameEngine game = new GameEngine();

        // inicia o jogo
        game.start();
    }
}
