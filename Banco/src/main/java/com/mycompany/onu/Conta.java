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
public class Conta {

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Agencia
     */
    public int getAgencia() {
        return Agencia;
    }

    /**
     * @param Agencia the Agencia to set
     */
    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    /**
     * @return the Saldo
     */
    public int getSaldo() {
        return Saldo;
    }

    /**
     * @return the Limite
     */
    public int getLimite() {
        return Limite;
    }

    /**
     * @param Limite the Limite to set
     */
    public void setLimite(int Limite) {
        this.Limite = Limite;
    }
    private int Numero;
    private int Agencia;
    private int Saldo;
    private int Limite;
}
