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
public class Curso {

    private String Sigla;
    private String Nome;
    private int CargaHoraria;
    private double Valor;
    private String DataVigencia;
    private double ValorHoraInstrutor;
    private String Programa;

    public Curso(String Sigla, String Nome) {
        this.Sigla = Sigla;
        this.Nome = Nome;
    }
    //SET
    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setDataVigencia(String DataVigencia) {
        this.DataVigencia = DataVigencia;
    }

    public void setValorHoraInstrutor(double ValorHoraInstrutor) {
        this.ValorHoraInstrutor = ValorHoraInstrutor;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    //GET
    public String getSigla() {
        return Sigla;
    }

    public String getNome() {
        return Nome;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public double getValor() {
        return Valor;
    }

    public String getDataVigencia() {
        return DataVigencia;
    }

    public double getValorHoraInstrutor() {
        return ValorHoraInstrutor;
    }

    public String getPrograma() {
        return Programa;
    }

}
