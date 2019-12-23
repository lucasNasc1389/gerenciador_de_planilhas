package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;


public class Cheque {
    private Date data;
    private Integer numeroCheque;
    private String nome;
    private BigDecimal valor;
    private String status;
    private Integer qntdParcelas;
    private String formulaTotal;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(Integer numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getQntdParcelas() {
        return qntdParcelas;
    }

    public void setQntdParcelas(Integer qntdParcelas) {
        this.qntdParcelas = qntdParcelas;
    }

    public String getFormulaTotal() {
        return formulaTotal;
    }

    public void setFormulaTotal(String formulaTotal) {
        this.formulaTotal = formulaTotal;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "data=" + data +
                ", numeroCheque=" + numeroCheque +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", status='" + status + '\'' +
                ", qntdParcelas=" + qntdParcelas +
                ", formulaTotal='" + formulaTotal + '\'' +
                '}';
    }
}
