package POO.Veiculos;

//Abstract => a classe não sabe como uma das coisas irá se comportar, mas todas as classes que quiserem ser um veiculo precisará ter o método ligar(e a funcionalidade é descrita nas próprias classes)
public abstract class Veiculo {
    // Herança => Moto e Carro estão herdando métodos daqui com extends
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
