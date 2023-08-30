
package javaapplication1;


public class ContaBancaria {
   private String titular;
    private int numero;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Métodos de operações
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }
}
