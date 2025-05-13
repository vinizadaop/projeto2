package com.empresa.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private LocalDate data;
    private List<ItemPedido> itens;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(i -> i.calcularTotal().doubleValue()).sum();
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", cliente=" + cliente + ", data=" + data + ", total=" + calcularTotal() + "}";
    }
}
