package br.douglas.atividade02;

public class Vagao extends Transporte {

    public Vagao(Carga carga) {
        super(carga);
    }

    @Override
    public double calculaFrete() {
        return super.calculaFrete(0.2, 0.1);
    }
}
