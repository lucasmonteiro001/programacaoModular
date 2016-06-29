package codigos;

import com.MySQLConnector.MySQLConnector;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.Date;
import javax.swing.JOptionPane;

public class Profissional extends Pessoa {

    private Integer idTecnico;
    private Integer nrMatricula;
    private String emailTecnico;
    private String nomeTecnico;
    private String telefoneTecnico;

    public Profissional(Integer idTecnico, Integer nrMatricula,
            String nomeTecnico, String emailTecnico,String telefoneTecnico) {

        this.idTecnico = idTecnico;
        this.nrMatricula = nrMatricula;
        this.nomeTecnico = nomeTecnico;
        this.emailTecnico = emailTecnico;
        this.telefoneTecnico = telefoneTecnico;
    }

    public static Profissional getTecnicoByNomeOuMatricula(String nomeOuMatricula) {

        try {

            String buscaTecnico = "SELECT * FROM tecnico where nomeTecnico = \"" + 
                    nomeOuMatricula + "\" OR matriculaTecnico =\"" + nomeOuMatricula + "\"";
            Statement st = MySQLConnector.conn.createStatement();
            ResultSet rs = st.executeQuery(buscaTecnico);

            // Verifica se o cliente foi encontrado no banco.
            if (rs.next() == false) {
                return null;
            } else {
                return new Profissional(rs.getInt("idTecnico"), rs.getInt("matriculaTecnico"),
                        rs.getString("nomeTecnico"), rs.getString("emailTecnico"), rs.getString("telefoneTecnico"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public void excluirTecnico(Profissional tecnico){
        
        try {
            String deletaTecnico = "DELETE FROM tecnico where nomeTecnico = \"" + 
                    tecnico.nomeTecnico + "\" OR matriculaTecnico =\"" + tecnico.nrMatricula + "\"";
            Statement st = MySQLConnector.conn.createStatement();
            st.executeUpdate(deletaTecnico);
            JOptionPane.showMessageDialog(null, "Tecnico excluido com sucesso!");            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Este tecnico já está associado com outros registros no sistema"
                    + " e por isso não pode ser excluido.");
        }
    }
    
    public Integer getIdTecnico() {
        return idTecnico;
    }
    
    public void setIdCliente(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public Integer getMatricula() {
        return nrMatricula;
    }

    public void setMatricula(Integer matricula) {
        this.nrMatricula = matricula;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getEmailTecnico() {
        return emailTecnico;
    }

    public void setEmailTecnico(String emailTecnico) {
        this.emailTecnico = emailTecnico;
    }

    public String getTelefoneTecnico() {
        return telefoneTecnico;
    }

    public void setTelefoneTecnico(String telefoneTecnico) {
        this.telefoneTecnico = telefoneTecnico;
    }

}

