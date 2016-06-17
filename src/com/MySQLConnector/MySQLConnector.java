package com.MySQLConnector;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe utilizada para conexao ao banco e manipulacao de dados.
 */
public class MySQLConnector {
    public static String status = "Nao ha conexao ao banco de dados...";

    // Metodo construtor da classe
    public MySQLConnector() {
    }

    /**
     * Metodo para estabelecer a conexao ao banco de dados
     */
    public static java.sql.Connection getMySQLConnector() {
        Connection connection = null;
        try {
            // Carregamento do driver JDBC padrao
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            // Configuracao da conexao com o banco de dados
            String serverName = "localhost";
            String database = "cadastros";      // nome do banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + database;
            String username = "root";
            String password = " ";       // Informe aqui sua senha de acesso ao banco de dados
            connection = DriverManager.getConnection(url, username, password);

            // Teste de conexao
            if (!connection.isClosed())
                //if (connection != null)
                status = "Conectado com sucesso ao banco de dados!";
            else
                status = "Nao foi possivel conectar ao banco de dados";
            return connection;
        } catch (ClassNotFoundException e) {
            status = "O driver especificado nao foi encontrado.\n" + e.getMessage();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, status);
            return null;
        } catch (SQLException e) {
            status = "Nao foi possivel conectar ao banco de dados.\n" + e.getMessage();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, status);
            return null;
        }
    }

    /**
     * Metodo para retornar o status da conexao
     */
    public static String connectionStatus() {
        JOptionPane.showMessageDialog(null, status);
        return status;
    }

    /**
     * Metodo para encerrar a conexao ao banco de dados
     */
    public static boolean closeConnection() {
        try {
            MySQLConnector.getMySQLConnector().close();
            status = "Conexao ao banco de dados encerrada com sucesso!";
            JOptionPane.showMessageDialog(null, status);
            return true;
        } catch (SQLException e) {
            status = "Nao foi possivel encerrar a conexao com o banco de dados.\n" + e.getMessage();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, status);
            return false;
        }
    }

    /**
     * Metodo para restabelecimento da conexao
     */
    public static java.sql.Connection restartConnection() {
        closeConnection();
        return MySQLConnector.getMySQLConnector();
    }
}
