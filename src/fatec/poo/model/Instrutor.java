/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author notebook
 */
public class Instrutor extends Pessoa {

    private String Formacao;
    private String AreaAtuacao;

    public Instrutor(String CPF, String Nome) {
        super(CPF, Nome);
    }
    
    //SET
    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }
    //GET
    public String getFormacao() {
        return Formacao;
    }

    public String getAreaAtuacao() {
        return AreaAtuacao;
    }

}
