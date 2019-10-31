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
public class Turma {

    private String SiglaTurma;
    private String Descricao;
    private String DataInicio;
    private String DataTermino;
    private String Periodo;
    private int QtdVagas;
    private String Observacoes;

    public Turma(String SiglaTurma, String Descricao) {
        this.SiglaTurma = SiglaTurma;
        this.Descricao = Descricao;
    }

    //SET
    public void setSiglaTurma(String SiglaTurma) {
        this.SiglaTurma = SiglaTurma;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public void setDataTermino(String DataTermino) {
        this.DataTermino = DataTermino;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public void setQtdVagas(int QtdVagas) {
        this.QtdVagas = QtdVagas;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
    
    //GET
    public String getSiglaTurma() {
        return SiglaTurma;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getDataInicio() {
        return DataInicio;
    }

    public String getDataTermino() {
        return DataTermino;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public int getQtdVagas() {
        return QtdVagas;
    }

    public String getObservacoes() {
        return Observacoes;
    }
    
    

}
