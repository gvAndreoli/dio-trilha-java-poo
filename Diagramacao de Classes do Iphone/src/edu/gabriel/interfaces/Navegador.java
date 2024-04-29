package edu.gabriel.interfaces;

public interface Navegador {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
    void selecionarEmail();
    String enviarEmail(String mensagem);
    void buscarNoMaps();
    void verImagemDeSatelite();
    void verTempo();
    void verStocks();
}
