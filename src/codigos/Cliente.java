package codigos;

import com.MySQLConnector.MySQLConnector;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.Date;
import javax.swing.JOptionPane;
import telas.TelaAlterarCliente;

public class Cliente extends Pessoa {

    private Integer idCliente;
    private String cpf;
    private String identidade;
    private String nomeCliente;
    private Date dataNascimento;
    private String emailCliente;
    private String enderecoCliente;
    private String telefoneCliente;

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(Integer idCliente, String cpf, String identidade,
            String nomeCliente, Date dataNascimento, String emailCliente,
            String enderecoCliente, String telefoneCliente) {

        this.idCliente = idCliente;
        this.cpf = cpf;
        this.identidade = identidade;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.emailCliente = emailCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public static Cliente getClienteByNomeOuCpf(String nomeOuCpf) {

        try {

            String buscaCliente = "SELECT * FROM cliente where nomeCliente = \"" + 
                    nomeOuCpf + "\" OR cpf =\"" + nomeOuCpf + "\"";
            Statement st = MySQLConnector.conn.createStatement();
            ResultSet rs = st.executeQuery(buscaCliente);

            // Verifica se o cliente foi encontrado no banco.
            if (rs.next() == false) {
                return null;
            } else {
                return new Cliente(rs.getInt("idCliente"), rs.getString("cpf"),
                        rs.getString("identidade"), rs.getString("nomeCliente"),
                        rs.getDate("dataNascimento"), rs.getString("emailCliente"),
                        rs.getString("enderecoCliente"), rs.getString("telefoneCliente"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    
    
    
    
    

}
