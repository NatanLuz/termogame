package br.com.natan.termogame;

public class Utils {

    // Códigos ANSI para cor no terminal
    //sequências de escape ANSI podem ser usadas para formatar a saída do terminal, como cores e estilos de texto
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[42;30m";   // Fundo verde, texto preto
    private static final String ANSI_YELLOW = "\u001B[43;30m";  // Fundo amarelo, texto preto
    private static final String ANSI_GRAY = "\u001B[100;30m";   // Fundo cinza escuro, texto preto

    public static void exibirFeedback(String tentativa, String palavraSecreta) {
        char[] tentativaChars = tentativa.toCharArray();
        char[] secretaChars = palavraSecreta.toCharArray();

        // Cria uma cópia para marcar letras já utilizadas
        boolean[] letrasUsadas = new boolean[5];

        // Primeiro passo: é verificar letras verdes
        StringBuilder[] resultado = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            if (tentativaChars[i] == secretaChars[i]) {
                resultado[i] = new StringBuilder(ANSI_GREEN + " " + tentativaChars[i] + " " + ANSI_RESET);
                letrasUsadas[i] = true;
            } else {
                resultado[i] = null; // ainda vamos decidir a cor
            }
        }

        // Segundo passo: é verificar amarelas e cinzas
        for (int i = 0; i < 5; i++) {
            if (resultado[i] != null) continue; // já foi marcada como verde

            boolean encontrada = false;
            for (int j = 0; j < 5; j++) {
                if (!letrasUsadas[j] && tentativaChars[i] == secretaChars[j]) {
                    encontrada = true;
                    letrasUsadas[j] = true;
                    break;
                }
            }

            if (encontrada) {
                resultado[i] = new StringBuilder(ANSI_YELLOW + " " + tentativaChars[i] + " " + ANSI_RESET);
            } else {
                resultado[i] = new StringBuilder(ANSI_GRAY + " " + tentativaChars[i] + " " + ANSI_RESET);
            }
        }

        // Exibe o resultado final
        for (StringBuilder parte : resultado) {
            System.out.print(parte);
        }
        System.out.println(); // quebra de linha final
    }
}
