package POO.Messenger.apps;

public class MSNMessenger extends ServiçoMensagem {
    @Override
    public void enviarMensagem() {
        validarConexão();
        System.out.println("Enviando msg pelo MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo msg pelo MSN");
    }
}
