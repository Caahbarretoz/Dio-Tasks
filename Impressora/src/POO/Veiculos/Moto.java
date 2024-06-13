package POO.Veiculos;

// herdando caracteristicas da outra classe nesta classe
public class Moto extends Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }
}
