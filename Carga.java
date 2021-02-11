package br.douglas.atividade02;

public class Carga {
    private double valor;
    private double peso;

    public Carga(double valor, double peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
