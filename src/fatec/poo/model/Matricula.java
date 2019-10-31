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
public class Matricula {

    private String data;
    private int qtdeFaltas;
    private double nota;

    public Matricula(String data) {
        this.data = data;
    }

   public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getData() {
        return data;
    }

    public int getQtdeFaltas() {
        return qtdeFaltas;
    }

    public double getNota() {
        return nota;
    }
    
    public void EmitirCarne() {
        // TODO EMITIR CARNE
    }
}
