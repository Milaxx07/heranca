package aplicacao;

import modelo.Veiculo;
import modelo.Carro;
import modelo.Moto;

public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("Toyota", "Corolla", 4);
        veiculos[1] = new Moto("Honda", "CB500", 500);
        veiculos[2] = new Carro("Volkswagen", "Golf", 2);

        for (Veiculo v : veiculos) {
            v.exibirInfo(); // polimorfismo em ação
        }
    }
}
