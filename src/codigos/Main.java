package codigos;

import static com.MySQLConnector.MySQLConnector.*;
import static java.lang.System.out;

/**
 * Created by Bernardo on 16/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        String usuario = " ";
        String senha = " ";
        out.println("Conexao: " + getMySQLConnector(usuario, senha));
        out.println("Status da conexao: \n" + connectionStatus());
        out.println("Fechando a conexao: \n" + closeConnection(usuario, senha));
        out.println("Status da conexao: \n" + connectionStatus());
        out.println("Reiniciando a conexao: \n" + restartConnection(usuario, senha));
        out.println("Status da conexao: \n" + connectionStatus());
        out.println("Fechando a conexao: \n" + closeConnection(usuario, senha));
        out.println("Status da conexao: \n" + connectionStatus());
    }
}
