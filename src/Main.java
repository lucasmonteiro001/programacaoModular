import static com.MySQLConnector.MySQLConnector.*;
import static java.lang.System.out;

/**
 * Created by Bernardo on 16/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        out.println("Conexao: " + getMySQLConnector());
        out.println("Status da conexao: \n" + connectionStatus());
        out.println("Fechando a conexao: \n" + closeConnection());
        out.println("Status da conexao: \n" + connectionStatus());
        out.println("Reiniciando a conexao: \n" + restartConnection());
        out.println("Status da conexao: \n" + connectionStatus());
        out.println("Fechando a conexao: \n" + closeConnection());
        out.println("Status da conexao: \n" + connectionStatus());
    }
}
