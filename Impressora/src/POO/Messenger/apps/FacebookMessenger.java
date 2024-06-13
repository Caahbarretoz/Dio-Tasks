package POO.Messenger.apps;

public class FacebookMessenger extends ServiçoMensagem {
    @Override
    public void enviarMensagem() {
        validarConexão();
        System.out.println("Enviando msg pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo msg pelo Facebook");
    }

}
