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
public class Aluno extends Pessoa {

    private String Escolaridade;

    public Aluno(String CPF, String Nome) {
        super(CPF, Nome);
    }
    //SET
    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }
    //GET
    public String getEscolaridade() {
        return Escolaridade;
    }
}
