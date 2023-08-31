package iPhone;

public interface Telefone {
    public default void ligar(int numero){}

    public default void atender(){}

    public default void iniciarCorreioVoz(){}
}
