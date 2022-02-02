package br.com.calculo_de_area;

public class quadrado implements AreaCalculavel{

    public double lado;

    public quadrado(double l){
        lado = l;
    }

    @Override
    public Double calculaarea() {
        return lado * lado;
    }

}
