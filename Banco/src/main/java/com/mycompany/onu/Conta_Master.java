/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onu;

/**
 *
 * @author aluno
 */
public class Conta_Master {

    /**
     * @return the SaldoInvestimento
     */
    public int getSaldoInvestimento() {
        return SaldoInvestimento;
    }

    /**
     * @param SaldoInvestimento the SaldoInvestimento to set
     */
    public void setSaldoInvestimento(int SaldoInvestimento) {
        this.SaldoInvestimento = SaldoInvestimento;
    }

    /**
     * @return the LimiteExtra
     */
    public int getLimiteExtra() {
        return LimiteExtra;
    }

    /**
     * @param LimiteExtra the LimiteExtra to set
     */
    public void setLimiteExtra(int LimiteExtra) {
        this.LimiteExtra = LimiteExtra;
    }
    private int SaldoInvestimento;
    private int LimiteExtra;
}
