package br.com.natan.termogame;

public class InputHandler {

    // Metodo estático para validar entrada do jogador
    public static boolean ehValida(String palavra, WordList wordList) {
        if (palavra == null) {
            return false;
        }

        // Verifica se tem exatamente 5 letras
        if (palavra.length() != 5) {
            System.out.println("A palavra deve conter exatamente 5 letras.");
            return false;
        }

        // Verifica se contém apenas letras (sem números ou símbolos)
        if (!palavra.matches("[a-zA-Z]+")) {
            System.out.println("A palavra deve conter apenas letras.");
            return false;
        }

        // Verifica se a palavra existe na lista
        if (!wordList.contem(palavra)) {
            System.out.println("A palavra não está na lista de palavras válidas.");
            return false;
        }

        // Tudo certo
        return true;
    }
}
