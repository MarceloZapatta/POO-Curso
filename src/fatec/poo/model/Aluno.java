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

    private String escolaridade;

    public Aluno(String cpf, String nome) {
        super(cpf, nome);
    }
    //SET
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    //GET
    public String getEscolaridade() {
        return escolaridade;
    }
}
