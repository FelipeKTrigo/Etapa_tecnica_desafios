package br.com.calculo_de_area;

public abstract class retangulo implements AreaCalculavel{

    public double largura;
    public double altura;

    public retangulo(double l, double a){
        largura = l;
        altura = a;
    }

    @Override
    public Double calculaarea() {
        return largura * altura;
    }
}
