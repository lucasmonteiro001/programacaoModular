/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author Iago A D Vaz
 */
public class Material {
    private int idProduto;
    private String nomeProduto;
    private double precoProduto;
    
    Material(int id, String nome, double preco){
        idProduto = id;
        nomeProduto = nome;
        precoProduto = preco;
    }

    public Material() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getIdProduto(){
        return idProduto;
    }
    
    public String getNomeProduto(){
        return nomeProduto;
    }
    
    public double getPrecoProduto(){
        return precoProduto;
    }
    
}
