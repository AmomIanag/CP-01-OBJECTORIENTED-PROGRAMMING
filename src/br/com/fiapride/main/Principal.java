package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Iniciando veiculo\n");

        Veiculos veiculo1 = new Veiculos("Amom", "AMO-1234");

        System.out.println("abastecendo");
        veiculo1.adicionar(90);

        System.out.println("\n status do veiculo");

        System.out.println(
                "dono do veiculo: " + veiculo1.getIndividuo() +
                "placa do veiculo: " + veiculo1.getPl() +
                "Gasolina: " + veiculo1.getGas()
        );

        System.out.println("\n Usando o veiculo");

        System.out.println("Gastando gasolina");
        veiculo1.gasta(20);

        System.out.println("\nStatus");

        System.out.println(
                "Dono do veículo: " + veiculo1.getIndividuo() +
                " - Placa do veículo: " + veiculo1.getPl() +
                " - Gasolina: " + veiculo1.getGas()
        );
    }
}