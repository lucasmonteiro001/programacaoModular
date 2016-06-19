package codigos;

import java.util.Collection;
import java.util.Date;

public class Cliente extends Pessoa {

    private long numCadastroCliente;
    /**
     * Informa��o do n�mero do CPF do cliente.
     */
    private String numCPF;
    /**
     * Informa��o do documento de identidade do cliente.
     */
    private String numIdentidade;
    /**
     * Data de nascimento do cliente ou do prestador do servi�o
     */
    private Date dataNasc;
    /**
     * Informa��o dos endere�os do cliente.
     */
    private Collection<String> endereco;

}