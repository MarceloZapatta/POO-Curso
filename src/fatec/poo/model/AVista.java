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
public class AVista {

    private double Valor;
    private int Agencia;
    private int Ncheque;
    private String PreData;

    //SET
    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    public void setNcheque(int Ncheque) {
        this.Ncheque = Ncheque;
    }

    public void setPreData(String PreData) {
        this.PreData = PreData;
    }  
    
    //GET
    public double getValor() {
        return Valor;
    }

    public int getAgencia() {
        return Agencia;
    }

    public int getNcheque() {
        return Ncheque;
    }

    public String getPreData() {
        return PreData;
    }
    
    

}
