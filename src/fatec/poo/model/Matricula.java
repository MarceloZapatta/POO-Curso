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

    private String Data;
    private int QtdeFaltas;
    private double Nota;

    public Matricula(String Data) {
        this.Data = Data;
    }

    public void setQtdeFaltas(int QtdeFaltas) {
        this.QtdeFaltas = QtdeFaltas;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public String getData() {
        return Data;
    }

    public int getQtdeFaltas() {
        return QtdeFaltas;
    }

    public double getNota() {
        return Nota;
    }
    
    public void EmitirCarne() {

    }

}
