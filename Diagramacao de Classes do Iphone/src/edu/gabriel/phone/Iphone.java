package edu.gabriel.phone;

import edu.gabriel.interfaces.AparelhoTelefonico;
import edu.gabriel.interfaces.Navegador;
import edu.gabriel.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    @Override
    public void selecionarContato() {
        System.out.println("Contato selecionado");
    }

    @Override
    public void realizarLigacao() {
        System.out.println("Ligando...");

    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");

    }

    @Override
    public void encerrarLigacao() {
        System.out.println("Encerrando ligação");

    }

    @Override
    public void adicionarAosFavoritos() {
        System.out.println("contato adicionado aos favoritos");

    }

    @Override
    public void acessarCaixaDeVoz() {
        System.out.println("Acessando caixa de voz");

    }

    @Override
    public void iniciarCaixaDeVoz() {
        System.out.println("Reproduzindo mensagem da caixa de voz");

    }

    @Override
    public String enviarSMS(String mensagem) {
        System.out.println("Enviando a mensagem");
        return mensagem;
    }

    @Override
    public void selecionarFoto() {
        System.out.println("Foto selecionada");

    }

    @Override
    public void definirPapelDeParede() {
        System.out.println("Papel de parede definido com sucesso");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Mostrando página");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");

    }

    @Override
    public void selecionarEmail() {
        System.out.println("Email selecionado");

    }

    @Override
    public String enviarEmail(String mensagem) {
        System.out.println("Email enviado");
        return mensagem;
    }

    @Override
    public void buscarNoMaps() {
        System.out.println("Era isso que você procurava?");

    }

    @Override
    public void verImagemDeSatelite() {
        System.out.println("Mostrando imagem de satélite");

    }

    @Override
    public void verTempo() {
        System.out.println("Agora está nublado e com temperaturas baixas");

    }

    @Override
    public void verStocks() {
        System.out.println("As ações da apple subiram");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Tocando musica selecionada");

    }

    @Override
    public void selecionarArtista() {
        System.out.println("mostrando musicas do artista selecionado");

    }

    @Override
    public void tocar() {
        System.out.println("reproduzindo musica");

    }

    @Override
    public void pausar() {
        System.out.println("musica pausada");

    }

    @Override
    public void reproduzirVideo() {
        System.out.println("reproduzindo video");

    }
}
