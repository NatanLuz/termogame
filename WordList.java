package br.com.natan.termogame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordList {

    private final List<String> palavrasValidas;

    public WordList() {
        this.palavrasValidas = new ArrayList<>();

        // Lista de palavras válidas (Pode editar ou carregar de arquivo no futuro)
        palavrasValidas.add("piano");
        palavrasValidas.add("canto");
        palavrasValidas.add("falar");
        palavrasValidas.add("nuvem");
        palavrasValidas.add("leite");
        palavrasValidas.add("cobra");
        palavrasValidas.add("vinho");
        palavrasValidas.add("sonho");
        palavrasValidas.add("festa");
        palavrasValidas.add("praia");
        palavrasValidas.add("morar");
        palavrasValidas.add("livro");
        palavrasValidas.add("terno");
        palavrasValidas.add("grito");
        palavrasValidas.add("troca");
        palavrasValidas.add("chuva");
        palavrasValidas.add("carro");
        palavrasValidas.add("mundo");
        palavrasValidas.add("divar");
        palavrasValidas.add("lindo");
        palavrasValidas.add("linda");
        palavrasValidas.add("amora");
        palavrasValidas.add("folha");
        palavrasValidas.add("norte");
        palavrasValidas.add("sulco");
        palavrasValidas.add("cedro");
        palavrasValidas.add("verde");
        palavrasValidas.add("fruta");
        palavrasValidas.add("caixa");
        palavrasValidas.add("pular");
        palavrasValidas.add("beijo");
        palavrasValidas.add("canto");
        palavrasValidas.add("bolsa");
        palavrasValidas.add("tempo");
        palavrasValidas.add("limpo");
        palavrasValidas.add("suave");
        palavrasValidas.add("noite");
        palavrasValidas.add("corpo");
        palavrasValidas.add("campo");
        palavrasValidas.add("doido");
        palavrasValidas.add("rever");
        palavrasValidas.add("andar");
        palavrasValidas.add("pente");
        palavrasValidas.add("roubo");
        palavrasValidas.add("sabor");
        palavrasValidas.add("fraco");
        palavrasValidas.add("barco");
        palavrasValidas.add("vento");
        palavrasValidas.add("brisa");
        palavrasValidas.add("metal");
        palavrasValidas.add("banho");
        palavrasValidas.add("manso");
        palavrasValidas.add("longe");
        palavrasValidas.add("janes");
        palavrasValidas.add("medir");
        palavrasValidas.add("gente");
        palavrasValidas.add("risco");
        palavrasValidas.add("toque");
        palavrasValidas.add("linha");
        palavrasValidas.add("dente");
        palavrasValidas.add("haste");
        palavrasValidas.add("certo");


    }

    // Sorteando uma palavra da lista
    public String sortearPalavra() {
        Random random = new Random();
        int indice = random.nextInt(palavrasValidas.size());
        return palavrasValidas.get(indice);
    }

    // Verificando se a palavra está na lista
    public boolean contem(String palavra) {
        return palavrasValidas.contains(palavra.toLowerCase());
    }

    // Getter para outras classes acessarem a lista
    //Os getters são métodos públicos que permitem a leitura dos valores dos atributos. Eles não modificam os dados, apenas retornam seus valores.
    public List<String> getPalavrasValidas() {
        return palavrasValidas;
    }
}

