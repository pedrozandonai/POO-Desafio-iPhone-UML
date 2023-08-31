package iPhone;

public class Iphone implements ReprodutorMusical, Telefone, NavegadorWeb{
    private String modelo;
    private int capacidade;
    private String cor;

    @Override
    public void exibirPagina(String url) {
        NavegadorWeb.super.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        NavegadorWeb.super.adicionarNovaAba(url);
    }

    @Override
    public void atualizarPagina() {
        NavegadorWeb.super.atualizarPagina();
    }

    @Override
    public void tocar() {
        ReprodutorMusical.super.tocar();
    }

    @Override
    public void pausar() {
        ReprodutorMusical.super.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        ReprodutorMusical.super.selecionarMusica(musica);
    }

    @Override
    public void ligar(int numero) {
        Telefone.super.ligar(numero);
    }

    @Override
    public void atender() {
        Telefone.super.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        Telefone.super.iniciarCorreioVoz();
    }
}
