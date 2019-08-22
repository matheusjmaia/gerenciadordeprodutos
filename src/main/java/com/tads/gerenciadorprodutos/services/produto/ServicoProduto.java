/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tads.gerenciadorprodutos.services.produto;

import com.tads.gerenciadorprodutos.exceptions.DataSourceException;
import com.tads.gerenciadorprodutos.exceptions.ProdutoException;
import com.tads.gerenciadorprodutos.model.Produto;
import com.tads.gerenciadorprodutos.model.ValidadorProduto;
import com.tads.gerenciadorprodutos.repository.contracts.IRepositorio;
import com.tads.gerenciadorprodutos.repository.produto.RepositorioProduto;
import java.util.ArrayList;

/**
 *
 * @author Vitoria Cristina
 */
public class ServicoProduto {
    static IRepositorio repositorio = new RepositorioProduto();
    public static void cadastrarProduto(Produto produto)
            throws ProdutoException {


        ValidadorProduto.validar(produto);

        try {

            repositorio.inserir(produto);
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
    
    public static void atualizarProduto(Produto produto)
            throws ProdutoException, DataSourceException {
        

        ValidadorProduto.validar(produto);

        try {

            repositorio.atualizar(produto);
            return;
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }


    public static ArrayList<Produto> procurarPeloNome(String nome)
            throws ProdutoException, DataSourceException {
        try {

            return (ArrayList<Produto>)repositorio.buscarPorNome(nome);
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static Produto buscarIdProduto(Integer id)
            throws ProdutoException, DataSourceException {
        try {

            return (Produto)repositorio.pegar(id);
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }


    public static void excluirProduto(Integer id)
            throws ProdutoException, DataSourceException {
        try {

            repositorio.deletar(id);
        } catch (Exception e) {

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static ArrayList<Produto> listar (){
        try {
            return (ArrayList<Produto>) repositorio.listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}