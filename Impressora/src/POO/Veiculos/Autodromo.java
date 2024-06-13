package POO.Veiculos;

public class Autodromo {
    public static void main(String[] args) {
        // aqui está criando um novo objeto através da classe Carro(assim ele pega tudo
        // do Carro que for publico)
        Carro jeep = new Carro();
        // aqui ele consegue pegar chassi porque está sendo herdado nas classes
        jeep.setChassi("323458");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("234234");
        z400.ligar();
    }
}
