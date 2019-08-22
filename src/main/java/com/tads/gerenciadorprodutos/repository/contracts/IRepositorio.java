/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tads.gerenciadorprodutos.repository.contracts;

import java.sql.SQLException;

/**
 *
 * @author Vitoria Cristina
 */
public interface IRepositorio {
    void inserir(Object entity) throws SQLException;
    Object listar() throws SQLException;
    Object pegar(Integer id) throws SQLException;
    void atualizar(Object entity) throws SQLException;
    void deletar(Integer id) throws SQLException;
    Object buscarPorNome(String nome) throws SQLException;
}
