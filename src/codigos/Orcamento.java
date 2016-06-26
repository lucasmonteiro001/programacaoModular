package codigos;

import java.time.LocalDateTime;
import java.util.Date;

public class Orcamento {
    
    private static int numeroOS;
    private static double valMaoDeObra;
    private static double valorISS;
    private static double valorTotal;
    
    private String descricaoOrcamento;
    private Object matriculaProfissional;
    private Date numHorasTrabalho;
    private double valorHoraTrabalho;
    //  private Map<String, double> materialUsado;
    
    private double valorTotalServico;
    private LocalDateTime prazoOrcamento;
    private boolean autorizaServico;

    public static double CalcularOrcamento(int numHoras, double valHora, 
            double valMateriais){
        valorTotal = 0.00;
        valMaoDeObra = (double)numHoras * valHora;
        valorISS = valMaoDeObra * 0.05;
        valorTotal = valMaoDeObra + valorISS + valMateriais;
        return valorTotal;
    }
    
    
    
    public void incluirOrcamento() {
        // TODO - implement Orcamento.incluirOrcamento
        throw new UnsupportedOperationException();
    }

    public void editarOrcamento() {
        // TODO - implement Orcamento.editarOrcamento
        throw new UnsupportedOperationException();
    }

    public void consultarOrcamento() {
        // TODO - implement Orcamento.consultarOrcamento
        throw new UnsupportedOperationException();
    }

    public void descreverOrcamento() {
        // TODO - implement Orcamento.descreverOrcamento
        throw new UnsupportedOperationException();
    }

    public static int getNumeroOS() {
        return numeroOS;
    }

    public static void setNumeroOS(int numOS) {
        Orcamento.numeroOS = numOS;
    }

    public static double getValorISS() {
        return valorISS;
    }
    
    public static double getValMaoDeObra() {
        return valMaoDeObra;
    }
    
}