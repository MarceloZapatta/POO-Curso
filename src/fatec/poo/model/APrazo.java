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
public class APrazo {

    private double Valor;
    private String DtVencimento;
    private double TaxaJuros;
    private int Mensalidade;

    public APrazo(double TaxaJuros) {
        this.TaxaJuros = TaxaJuros / 100;
    }
    //SET
    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setDtVencimento(String DtVencimento) {
        this.DtVencimento = DtVencimento;
    }

    public void setTaxaJuros(double TaxaJuros) {
        this.TaxaJuros = TaxaJuros;
    }

    public void setMensalidade(int Mensalidade) {
        this.Mensalidade = Mensalidade;
    }
    
    //GET
    public double getValor() {
        return Valor;
    }

    public String getDtVencimento() {
        return DtVencimento;
    }

    public double getTaxaJuros() {
        return TaxaJuros;
    }

    public int getMensalidade() {
        return Mensalidade;
    }

}
