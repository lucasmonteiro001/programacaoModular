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
    static String username;
    static String password;

    // Metodo construtor da classe
    public MySQLConnector() {
    }

    /**
     * Metodo para estabelecer a conexao ao banco de dados
     * @param usuario informacao do login do usuario
     * @param senha informacao da senha do usuario
     * @return java.sql.Connection retorna o status da conexao
     */
    public static java.sql.Connection getMySQLConnector(String usuario, String senha) {
        Connection connection = null;
        try {
            // Carregamento do driver JDBC padrao
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            // Configuracao da conexao com o banco de dados
            String serverName = "localhost";
            String database = "cadastros";      // nome do banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + database +
                    "?autoReconnect=false&useSSL=false";
            // String username = "root";
            username = usuario;
            // String password = " ";       // Informe aqui sua senha de acesso ao banco de dados
            password = senha;
            connection = DriverManager.getConnection(url, username, password);

            // Teste de conexao
            if (!connection.isClosed()) {
                //if (connection != null)
                status = "Conectado com sucesso ao banco de dados!";
                final ImageIcon icon = new ImageIcon("C:\\Users\\Bernardo\\IdeaProjects\\programacaoModular\\src\\telas\\icons\\Ok1.png");
                JOptionPane.showMessageDialog(null, status, "Conexao bem sucedida", JOptionPane.INFORMATION_MESSAGE, icon);
            } else {
                status = "Banco de dados nao inicializado!";
                JOptionPane.showMessageDialog(null, status);
            }
            return connection;
        } catch (ClassNotFoundException e) {
            status = "O driver especificado nao foi encontrado.\n" + e.getMessage();
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, status);
            return null;
        } catch (SQLException e) {
            status = "Usuario e/ou senha invalido.\n" + e.getMessage();
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, status);
            return null;
        }
    }

    /**
     * Metodo para retornar o status da conexao
     * @return String retorna o status da conexao
     */
    public static String connectionStatus() {
        JOptionPane.showMessageDialog(null, status);
        return status;
    }

    /**
     * Metodo para encerrar a conexao ao banco de dados
     * @param usuario Informa os dados de login
     * @param senha Informa os dados da senha do usuario
     * @return boolean retorna se a conexao esta encerrada ou nao
     */
    public static boolean closeConnection(String usuario, String senha) {
        try {
            MySQLConnector.getMySQLConnector(usuario, senha).close();
            status = "Conexao ao banco de dados encerrada com sucesso!";
            JOptionPane.showMessageDialog(null, status);
            return true;
        } catch (SQLException e) {
            status = "Nao foi possivel encerrar a conexao com o banco de dados.\n" + e.getMessage();
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, status);
            return false;
        }
    }

    /**
     * Metodo para restabelecimento da conexao
     * @param usuario informa os dados do usuario
     * @param senha informa os dados da senha
     * @return java.sql.Connection retorna o status da conexao
     */
    public static java.sql.Connection restartConnection(String usuario, String senha) {
        closeConnection(usuario, senha);
        return MySQLConnector.getMySQLConnector(usuario, senha);
    }
}
