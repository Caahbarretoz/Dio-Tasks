package POO.Veiculos;

// herdando caracteristicas da outra classe nesta classe
public class Carro extends Veiculo {
    // Encapsulamento => usar private para funções não ficarem visiveis fora da
    // classe
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
}