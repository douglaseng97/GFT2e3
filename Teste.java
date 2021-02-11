package br.douglas.atividade02;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite o peso: ");
        double peso = scan.nextDouble();


        System.out.println("\nDigite o valor: ");
        double valor = scan.nextDouble();

        Carga carga = new Carga(valor, peso);
        Vagao vagao = new Vagao(carga);
        Caminhao cami = new Caminhao(carga);

        double freteVagao = vagao.calculaFrete();
        double freteCami = cami.calculaFrete();

        if ( peso < 15000 ) {
            freteVagao += 5000;
        }

        if ( valor > 40000 ) {
            freteCami -= (freteCami * 0.25);
        }

        System.out.println("\nO peso é =  " + peso + " | " + "e o Valor é = " + valor);
        System.out.println("Frete do Vagão é: $" + freteVagao + " e " + " Frete do Caminhão é: $" + freteCami);
    }
}
