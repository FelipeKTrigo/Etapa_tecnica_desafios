package br.com.calculo_de_area;

public class circulo implements AreaCalculavel{

    public double pi = 3.14;
    public double raio;

    public circulo(double r){
        raio = r;
    }
    @Override
    public Double calculaarea() {
        return pi * (raio * raio);
    }

}
