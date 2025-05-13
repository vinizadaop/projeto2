package com.empresa;

import com.empresa.model.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João Silva", "12345678900", "joao@email.com");
        Produto p1 = new Produto(1, "Notebook", new BigDecimal("3500.00"));
        Produto p2 = new Produto(2, "Mouse", new BigDecimal("150.00"));

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(p1, 10);
        estoque.adicionarProduto(p2, 50);

        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarItem(new ItemPedido(p1, 1));
        pedido.adicionarItem(new ItemPedido(p2, 2));

        System.out.println(pedido);
    }
}
