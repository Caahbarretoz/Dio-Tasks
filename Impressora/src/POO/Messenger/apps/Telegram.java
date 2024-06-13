package POO.Messenger.apps;

public class Telegram extends ServiçoMensagem {
    @Override
    public void enviarMensagem() {
        validarConexão();
        System.out.println("Enviando msg pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo msg pelo Telegram");
    }

}
