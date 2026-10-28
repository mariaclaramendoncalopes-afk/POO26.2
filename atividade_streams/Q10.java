package atividade_streams;

import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
            new Pedido("1", 100.0),
            new Pedido("2", 250.0),
            new Pedido("3", 150.0)
        );

        double valorTotal = pedidos.stream()
            .mapToDouble(pedido -> pedido.getValor())
            .sum();

        System.out.println("A soma dos valores dos pedidos é: " + valorTotal);
    }
}
