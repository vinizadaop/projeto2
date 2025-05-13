package com.empresa.model;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public boolean removerProduto(Produto produto, int quantidade) {
        int atual = produtos.getOrDefault(produto, 0);
        if (quantidade > atual) return false;
        produtos.put(produto, atual - quantidade);
        return true;
    }

    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }
}
