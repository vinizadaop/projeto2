package com.empresa.model;

import java.math.BigDecimal;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public BigDecimal calcularTotal() {
        return produto.getPreco().multiply(new BigDecimal(quantidade));
    }

    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }

    @Override
    public String toString() {
        return "ItemPedido{produto=" + produto + ", quantidade=" + quantidade + ", total=" + calcularTotal() + "}";
    }
}
