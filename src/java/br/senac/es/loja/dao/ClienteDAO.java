/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.es.loja.dao;

// Essa classe utiliza o padrao de projetos DAO (Data Access Object)

import br.senac.es.loja.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ClienteDAO {
    
    public Cliente inserir(Cliente cliente) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConexaoFactory.getConexao();
        
        // Comando SQL 
        SQL = "INSERT INTO clientes (nome, email, cpf, sexo) " +
                                     "VALUES (?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, cliente.getNome());
        preparedStatement.setString(2, cliente.getEmail());
        preparedStatement.setString(3, cliente.getCpf());
        preparedStatement.setString(4, cliente.getSexo());
        
        // Executa no BD        
        preparedStatement.executeUpdate();  

        // Busca o retono do banco
        rs = preparedStatement.getGeneratedKeys();

        // Busca a chave gerada (id)
        if (rs.next()) {
             cliente.setCodigo(rs.getInt(1));
         } 
        
        // Fechar conexao
        conn.close();
        
        return cliente;
    }

    
}
