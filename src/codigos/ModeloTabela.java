/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.awt.List;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iago A D Vaz
 * responsável por construir a jTable de forma dinâmica
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }
    public ArrayList getLinhas(){
        return linhas;
    }
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    public String[] getColunas(){
        return colunas;
    }
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    public int getColumnCount(){
        return colunas.length;
    }
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    
    public Class getColumnClass(int column){
        return getValueAt(3, column).getClass();
    }
    
    //responsável por selecionar e desselecionar o Check criado
    @Override
    public void setValueAt(Object aValue, int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        if (linha[3].equals(false)){
            linha[3] = true;
        }else{linha[3] = false;}
    }
    
    
    public boolean isCellEditable(int row, int col) {
       return (col == 3); 
    }
    
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
    
    //retorna um ArrayList<Material> com os materiais selecionados pelo técnico.
    public ArrayList getMateriais(){
        Object[] linha;
        ArrayList<Material> materiais = new ArrayList();
        for (int i =0; i < linhas.size(); i++){
             linha = (Object[])getLinhas().get(i);
             if(linha[3].equals(true)){
                 //idProduto.add(Integer.parseInt(linha[0].toString()));
                 materiais.add(new Material(Integer.parseInt(linha[0].toString()), linha[1].toString(), Double.parseDouble(linha[2].toString())));
             }             
        }
        return materiais;
    }
    
    
}
