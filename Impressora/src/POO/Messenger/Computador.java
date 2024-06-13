package POO.Messenger;

import POO.Messenger.apps.FacebookMessenger;
import POO.Messenger.apps.MSNMessenger;
import POO.Messenger.apps.ServiçoMensagem;
import POO.Messenger.apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        /*
         * MSNMessenger msn = new MSNMessenger();
         * msn.enviarMensagem();
         * msn.receberMensagem();
         * 
         * FacebookMessenger fcb = new FacebookMessenger();
         * fcb.enviarMensagem();
         * fcb.receberMensagem();
         * 
         * Telegram tlg = new Telegram();
         * tlg.enviarMensagem();
         * tlg.receberMensagem();
         */
        ServiçoMensagem smi = null;
        String appEscolhido = "msn";
        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
