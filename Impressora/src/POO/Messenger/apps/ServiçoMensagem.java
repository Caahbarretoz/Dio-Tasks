package POO.Messenger.apps;

public abstract class ServiçoMensagem {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    // Somente os filhos e classes no mesmo pacote tem acesso a este método por
    // conta do protected
    protected void validarConexão() {
        System.out.println("Validando Conexão");
    }
}
