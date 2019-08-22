/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tads.gerenciadorprodutos.model;

import com.tads.gerenciadorprodutos.exceptions.ProdutoException;



/**
 *
 * @author matheusjmaia
 */
public class ValidadorProduto {
    public static void validar(Produto produto) throws ProdutoException {
        if(produto.getNome().isEmpty() || produto.getNome() == null)
            throw new ProdutoException("Nome obrigatório");
        if(produto.getPrecoCompra() <= 0)
            throw new ProdutoException("Preço não pode ser zero ou negativo");
        if(produto.getPrecoVenda() <= 0)
            throw new ProdutoException("Preço não pode ser zero ou negativo");
        if(produto.getQuantidade() <= 0)
            throw new ProdutoException("A quantidade não pode ser zero ou negativo");
        if(produto.getDescricao().isEmpty() || produto.getDescricao() == null)
            throw new ProdutoException("Descrição obrigatória");
    }
    
}
