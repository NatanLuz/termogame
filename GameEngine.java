package br.com.natan.termogame;

import java.util.Scanner;

public class GameEngine {

    private static final int MAX_TENTATIVAS = 5; //Quantidade max de tentativas

    private final WordList  wordList; // lista com palavras válidas
    private final Scanner scanner;

    public GameEngine() {
        this.wordList = new WordList();
        this.scanner = new Scanner(System.in);
    }

    // este metodo que inicia o game
    public void start() {
        String palavraSecreta = wordList.sortearPalavra(); // aqui vai sortear a palavra secreta

        int tentativas = 0;

        while (tentativas < MAX_TENTATIVAS) {
            System.out.printf("\nTentativa %d de %d\n", tentativas + 1, MAX_TENTATIVAS);
            System.out.print("Digite uma palavra de 5 letras: ");
            String tentativa = scanner.nextLine().toLowerCase();

            //validando a tentativa

            if (!InputHandler.ehValida(tentativa, wordList)) {
                System.out.println(" Palavra inválida. Tente Novamente.");
                continue; // não pode e não conta tentativa inválida
            }

            // Mostra o feedback com letras coloridas
            Utils.exibirFeedback(tentativa, palavraSecreta);

            if (tentativa.equals(palavraSecreta)) {
                System.out.println(" Parabéns! Você acertou!");
                return; // Fim do jogo com vitória
            }

            tentativas++;
        }

        // Se chegar aqui, o jogador perdeu
        System.out.println("\n Fim de jogo. A palavra correta era: " + palavraSecreta.toUpperCase());
    }
}

