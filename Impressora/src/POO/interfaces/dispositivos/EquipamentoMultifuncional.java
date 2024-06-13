package POO.interfaces.dispositivos;

public class EquipamentoMultifuncional implements Digitalizadora, Copiadora, Impressora {
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando");

    }

    @Override
    public void copiar() {
        System.out.println("Copiando");

    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo");

    }
}
