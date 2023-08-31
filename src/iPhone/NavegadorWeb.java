package iPhone;

public interface NavegadorWeb {
    public default void exibirPagina(String url){}

    public default void adicionarNovaAba(String url){}

    public default void atualizarPagina(){}
}
