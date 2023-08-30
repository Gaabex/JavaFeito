
package javaapplication1;


public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    // Construtor
    public Carro(String marca, String modelo, int ano, double velocidadeInicial) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidadeInicial;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos de operações
    public void acelerar(double valor) {
        if (valor > 0) {
            double novaVelocidade = velocidade + valor;
            if (novaVelocidade <= 200.0) {
                velocidade = novaVelocidade;
                System.out.println("Acelerando para " + novaVelocidade + " km/h.");
            } else {
                System.out.println("Velocidade máxima de 200 km/h atingida.");
            }
        } else {
            System.out.println("Valor inválido para aceleração.");
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            double novaVelocidade = velocidade - valor;
            if (novaVelocidade >= 0) {
                velocidade = novaVelocidade;
                System.out.println("Freando para " + novaVelocidade + " km/h.");
            } else {
                velocidade = 0.0;
                System.out.println("Carro parado.");
            }
        } else {
            System.out.println("Valor inválido para frenagem.");
        }
    }
}
